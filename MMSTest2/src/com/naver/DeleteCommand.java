package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {

		System.out.println("삭제할 아이디를 입력하세요");
		String id =sc.nextLine();
		MemberDTO dto = new MemberDTO(id, null, 0);
		DB.db.remove(dto);
	}

	@Override
	public String toString() {
		return "회원삭제";
	}
	

}
