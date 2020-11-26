package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_me {
	private final String DRIVER="oracle.jdbc.OracleDriver";
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private	final String USER="ezen";
	private final String PASSWORD="ezen";
	
	public DAO_me() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void transter() {
		Connection conn =null;
		PreparedStatement pst=null;
		String sql1="update oder set buycount= buycount +? where mid=?";
		String sql2="update membership set point= point + ? where mid=?";
		boolean isok=false;
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
			pst=conn.prepareStatement(sql1);
			conn.setAutoCommit(false);
			pst.setInt(1, 1);
			pst.setString(2, "m001");
			pst.executeUpdate();
			System.out.println("구매 증가");
			if (sql1 != null) {
				pst.close();
			}
		//	System.out.println("비정상 종료"+4/0);
			
			pst=conn.prepareStatement(sql2);
			pst.setInt(1, 10);
			pst.setString(2, "m001");
			
			
			pst.executeUpdate();
			System.out.println("포인트 지급");
			
			isok=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (isok) {
					conn.commit();
					System.out.println("정상종료 포인트 지급");
				}else {
					conn.rollback();
					System.out.println("비정상종료: 구매취소");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
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
