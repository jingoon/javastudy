package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectBymid implements Command{
	
	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("id를 입력하세요");
		String mid =sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto= dao.selectBymid(mid);
		
		System.out.println(dto);
		
	}

	@Override
	public String toString() {
		return "2.SelectBymid";
	}
	

}
