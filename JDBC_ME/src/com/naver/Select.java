package com.naver;

import java.sql.Date;
import java.util.Scanner;

public class Select implements Command{

	@Override
	public void execute(Scanner sc) {
	
		System.out.println("id를 입력하세요");
		String mid =sc.nextLine();
		
		MemberDTO dto= SelectBymid.selectBymid(mid);
		
		System.out.println(dto);
		
	}

	@Override
	public String toString() {
		return "2.Select";
	}
	

	

}
