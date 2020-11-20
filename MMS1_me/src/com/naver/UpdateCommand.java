package com.naver;


import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {

		System.out.println("수정할 id를 입력하세요");
		String id = sc.nextLine();
		System.out.println("변경할 name을 입력하세요");
		String name = sc.nextLine();
		System.out.println("변경할 age를 입력하세요");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		int index=DB.DBlist.indexOf(dto);
		DB.DBlist.set(index, dto);
	}

	@Override
	public String toString() {
		return "(3.회원 수정)";
	}
	

}
