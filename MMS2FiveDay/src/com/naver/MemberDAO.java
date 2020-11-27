package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	Command com;
	
	public MemberDAO() {
		try {
			Class.forName(com.DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("연결실패");
		}
	}
	
	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pst =null;
		String sql="update member set name=?, job=? , birth=? where mid=?";
		
		try {
			conn=DriverManager.getConnection(com.URL,com.USER, com.PASSWORD);
			pst = conn.prepareStatement(sql);
			
		//만약 이름만 입력했을 때
			pst.setString(1, dto.getName());
			pst.setString(2, dto.getJob());
			pst.setDate(3, dto.getBirth());
			pst.setString(4, dto.getMid());
			pst.executeUpdate();
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pst, conn);
		}
	}	
	
	public List<MemberDTO> selectByNmae(String name) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pst =null;
		ResultSet rs=null;
		String sql="select * from member where name=?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(com.URL,com.USER, com.PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			
			rs=pst.executeQuery();
			while (rs.next()) {
				String mid=rs.getString("mid");
				String job=rs.getString("job");
				Date birth=rs.getDate("birth");
				dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pst, conn);
		}
		
		if(dto==null) {
			return null;
		}else {
			return list;
		}
		
	}

	
	public MemberDTO selectBymid(String mid) {
		Connection conn = null;
		PreparedStatement pst =null;
		ResultSet rs=null;
		String sql="select * from member where mid=?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(com.URL,com.USER, com.PASSWORD);
			pst = conn.prepareStatement(sql);
			pst.setString(1, mid);
			
			rs=pst.executeQuery();
			if (rs.next()) {
				String name=rs.getString("name");
				String job=rs.getString("job");
				Date birth=rs.getDate("birth");
				dto = new MemberDTO(mid, name, job, birth);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pst, conn);
		}
		
		
		return dto;
	}

	private void closeAll(ResultSet rs, PreparedStatement pst, Connection conn) {
		
		try {
			if (rs !=null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
