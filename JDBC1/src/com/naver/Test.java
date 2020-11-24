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
	
	public Test() {	// ������. mainŬ�������� T1��ü�� ���� �� �ѹ� ���� �Ǹ鼭 ����Ŭ ����̹��� DB�� �����
		// full package: ��Ű��.Ŭ������
		// kr.co.ezen.Test
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}
	
	public void me1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
//		String sql = "INSERT INTO member(mid, name, job, birth) values ('m005','kim', 'd', '2000-01-03')"; //  pstmt.setString�� ���� ��
		String sql = "INSERT INTO member(mid, name, job, birth) values (?, ?, ?, ?)"; //�Ķ���ͷ� �޴� �����ʹ� ? �����ΰ� , �ε��� 1,2,3,4
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen");
			System.out.println("Ŀ�ؼ� ���� ����");
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("prepareStatement ���� ����");
			
			pstmt.setString(1, "m006");
			pstmt.setString(2, "kim");
			pstmt.setString(3, "c");
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));// longŸ�� �Ķ���ͷ� �������� ���� �� �ִ�.
			pstmt.execute(); // DB or driver���� ������(.setString( , ) ��)�� ����.
			
		} catch (Exception e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			System.out.println("prepareStatement ���� ����");
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();// conn���� ���� �ݱ�
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
