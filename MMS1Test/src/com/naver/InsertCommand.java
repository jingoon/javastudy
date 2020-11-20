package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void command(Scanner sc) {
		
		try {
			System.out.println("ID를 입력하세요");
			String id=sc.nextLine();
			System.out.println("이름을 입력하세요");
			String name=sc.nextLine();
			System.out.println("나이(숫자)를 입력하세요");
			int age=sc.nextInt();
			sc.nextLine();
			
			MemberDTO dto = new MemberDTO(id, name, age);
			DB.db.add(dto);
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
			
		
		
	}

	@Override
	public String toString() {
		return "1:입력";
	}
	

}
