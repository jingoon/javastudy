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
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}
	public void transter(String fromId, String toId, int howmuch) {
		
		Connection conn =null;
		PreparedStatement pstmt=null;
		String sql ="update account set balance = balance + ? where id=?";
		String sql2 ="update account set balance = balance - ? where id=?"; // fromId�� toId������ �ٲ�� ���ڴ�..
		ResultSet rs=null; // ������. ������ ���ؼ� �߰�
		// Ʈ������ ó��
		boolean isok= false; // Ʈ�������� ����. �߰��� �������� �����Ѵٸ� �⺻�� false
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, toId);
			pstmt.executeUpdate();
			
			if(pstmt !=null) {		// sql�� �������(!=null) �ߴٸ� ���⼭ �ѹ� �ݾ��ش�.
				pstmt.close();
			}
			System.out.println("�� ������ �����ϴ�");
			System.out.println(4/0);	// ������ ǥ�� exception
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, fromId);
			pstmt.executeUpdate();
			
			isok= true;		// Ʈ������� ���� ���������� �����ߴٸ� isok = true
		} catch (Exception e) {
			e.printStackTrace();// ������ �䱸���׸��� Ȯ��
		}finally {
			// commit, rollback�� conn�� ���� ����̹Ƿ�  connection�� close�Ǳ� ���� ����.
			try {			// ��ɿ� ���� try~ catch������ �и��ؼ� finally�� �ۼ�
				if (isok) {		// conn�� ���
					conn.commit(); // ���� ������ true �̹Ƿ� commit
				}else {
					conn.rollback(); // �߰��� ������ ������ false �̹Ƿ� rollback
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {						// close() ��ɵ�
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
		ResultSet rs=null; // �ʿ���� ������ ����
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
		//	System.out.println("������ ����"+4/0);
			
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
