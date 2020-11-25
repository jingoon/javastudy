package com.me;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.naver.MemberDTO;

public class MemberDAO2 {
	private final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "ezen";
	private final String PASSWORD ="ezen";
	
	public MemberDAO2() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("DAO2 드라이버 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("DAO2 드라이버 연결 실패");
			e.printStackTrace();
		}
	}
	
	public void insert(MemberDTO dto) {
		 Connection conn = null;
		 PreparedStatement pstmt = null;
		 String sql = "insert into member values (?,?,?,?)";
		 
		 try {
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER, PASSWORD);
			 pstmt = conn.prepareStatement(sql);
			 
			 pstmt.setString(1, dto.getMid());
			 pstmt.setString(2, dto.getName());
			 pstmt.setString(3, dto.getJob());
			 pstmt.setDate(4, dto.getBirth());
			int in = pstmt.executeUpdate();
			if(in ==1) {
				System.out.println("DAO2 입력 성공");
			}else {
				System.out.println("DA02 입력 실패");
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
	
	public MemberDTO selectBymid(String mid) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member where mid=?";
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String name=rs.getString("name");
				String job = rs.getString("job");
				Date birth = rs.getDate("birth");
				dto = new MemberDTO(mid, name, job, birth);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
		
		return dto;
	}
	
	public void delete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from member where mid=?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMid());
						
			int a =pstmt.executeUpdate();
			if(a==0) {
				System.out.println("DAO2 delete 실패");
			}else {
				System.out.println("DAO2 delete 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
	
	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update member set name=?, job=?, birth=? where mid=?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getJob());
			pstmt.setDate(3, dto.getBirth());
			pstmt.setString(4, dto.getMid());
			int a = pstmt.executeUpdate();
			if(a==0) {
				System.out.println("DAO2 update실패");
			}else {
				System.out.println("DAO2 update성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		String sql = "select * from member";
		ResultSet rs=null;
		try {
		
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen");
			pstmt = conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			while(rs.next()) {
			String mid = rs.getString("mid");
			String name = rs.getString("name");
			String job = rs.getString("job");
			Date birth = rs.getDate("birth");
			MemberDTO dto = new MemberDTO(mid, name, job, birth);
			list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
		
		
		return list;
	}
	
	

}















