package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void command(Scanner sc) {
		
	
			System.out.println("수정할 ID를 입력하세요");
			String id=sc.nextLine();
			System.out.println("새로운 이름을 입력하세요");
			String name=sc.nextLine();
			System.out.println("새로운 나이(숫자)를 입력하세요");
			
			int age = sc.nextInt();
			sc.nextLine();
			MemberDTO dto = new MemberDTO(id, name, age);
			DB.db.add(dto);
	
	
			
		
		
				
		
	}

	@Override
	public String toString() {
		return "3:수정";
	}
	

}
