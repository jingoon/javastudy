package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {

	private final String DRIVER ="oracle.jdbc.OracleDriver";
	private final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER ="ezen";
	private final String PASSWORD ="ezen";
	
	public AccountDAO() {
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	public void transter(String fromId, String toId, int howmuch) {
		
		Connection conn =null;
		PreparedStatement pstmt=null;
		String sql ="update account set balance = balance + ? where id=?";
		String sql2 ="update account set balance = balance - ? where id=?"; // fromId와 toId순서가 바뀌면 좋겠다..
		ResultSet rs=null; // 사용안함. 설명을 위해서 추가
		// 트랜젝션 처리
		boolean isok= false; // 트랙젝션의 조건. 중간에 비정상적 종료한다면 기본값 false
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, toId);
			pstmt.executeUpdate();
			
			if(pstmt !=null) {		// sql이 정상수행(!=null) 했다면 여기서 한번 닫아준다.
				pstmt.close();
			}
			System.out.println("곧 전원이 나갑니다");
			System.out.println(4/0);	// 고장을 표현 exception
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, fromId);
			pstmt.executeUpdate();
			
			isok= true;		// 트랜잭션의 조건 성공적으로 수행했다면 isok = true
		} catch (Exception e) {
			e.printStackTrace();// 배포시 요구사항명세서 확인
		}finally {
			// commit, rollback은 conn이 가진 기능이므로  connection이 close되기 전에 실행.
			try {			// 기능에 따라서 try~ catch구문을 분리해서 finally에 작성
				if (isok) {		// conn의 기능
					conn.commit(); // 정상 종료라면 true 이므로 commit
				}else {
					conn.rollback(); // 중간에 비정상 종료라면 false 이므로 rollback
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {						// close() 기능들
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void transter2(String oid, String menu, String mid) {
		Connection conn =null;
		PreparedStatement pst=null;
		String sql1="insert into order1 values(?,?,?)";
		String sql2="update member10 set point= point + 10 where mid=?";
		ResultSet rs=null; // 필요없음 설명을 위해
		boolean isok=false;
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
			pst=conn.prepareStatement(sql1);
			conn.setAutoCommit(false);
			pst.setString(1, oid);
			pst.setString(2, menu);
			pst.setString(3, mid);
			
			pst.executeUpdate();
	
			if (sql1 != null) {
				pst.close();
			}
		//	System.out.println("비정상 종료"+4/0);
			
			pst=conn.prepareStatement(sql2);
			pst.setString(1, mid);
			
			
			pst.executeUpdate();
		
			isok=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {				
				if (isok) {			
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {				 
				if (rs != null) {
					rs.close();
				}
				if (pst != null) {
					pst.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
