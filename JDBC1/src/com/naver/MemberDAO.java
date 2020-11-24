package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "ezen";
	private final String PASS	= "ezen";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε�����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}
		
	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member(mid, name, job, birth) values (?, ?, ?, ?)";
		
		try {
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER, PASS);
			System.out.println("insert ���� ����");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
		
			int insert	= pstmt.executeUpdate();
			if(insert ==1) {
				System.out.println("�Է� ����");
			}else {
				System.out.println("�Է� ����");
			}
			
		} catch (Exception e) {
			System.out.println("insert ���� ����");
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
		// executeQuery 
		return list;
		
	}
	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER, PASS);
			
			
			
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
	
	public void delete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from member where mid=?";
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER, PASS);
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMid());
		
			int del= pstmt.executeUpdate();
			if(del==1) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
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
}
