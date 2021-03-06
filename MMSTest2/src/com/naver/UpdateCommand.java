package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("변경할 회원의 아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("새로운 이름를 입력하세요");
		String name = sc.nextLine();
		System.out.println("새로운 나이를 입력하세요");
		int age = sc.nextInt();
		sc.nextLine();

		MemberDTO dto = new MemberDTO(id, name, age);
		int index = DB.db.indexOf(dto);
		DB.db.set(index, dto);
	}

	@Override
	public String toString() {
		return "회원수정";
	}

}
