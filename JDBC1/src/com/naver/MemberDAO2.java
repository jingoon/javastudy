package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
	private final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "ezen";
	private final String PASSWORD ="ezen";
	
	public MemberDAO2() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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

}















