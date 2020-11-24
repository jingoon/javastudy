package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class Test {
	private final String DRIVER_NAME ="oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME= "ezen";
	private final String PASSWORD= "ezen";
	
	public Test() {	// 생성자. main클래스에서 T1객체를 만들 때 한번 실행 되면서 오라클 드라이버가 DB와 연결됨
		// full package: 패키지.클래스명
		// kr.co.ezen.Test
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void me1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
//		String sql = "INSERT INTO member(mid, name, job, birth) values ('m005','kim', 'd', '2000-01-03')"; //  pstmt.setString과 대응 됨
		String sql = "INSERT INTO member(mid, name, job, birth) values (?, ?, ?, ?)"; //파라미터로 받는 데이터는 ? 동적인것 , 인덱스 1,2,3,4
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen");
			System.out.println("커넥션 연결 성공");
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("prepareStatement 생성 성공");
			
			pstmt.setString(1, "m006");
			pstmt.setString(2, "kim");
			pstmt.setString(3, "c");
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));// long타입 파라미터로 수정값을 넣을 수 있다.
			pstmt.execute(); // DB or driver에게 데이터(.setString( , ) 값)를 전달.
			
		} catch (Exception e) {
			System.out.println("커넥션 연결 실패");
			System.out.println("prepareStatement 생성 실패");
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();// conn보다 먼저 닫기
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
