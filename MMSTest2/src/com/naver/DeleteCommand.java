package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {

		System.out.println("������ ���̵� �Է��ϼ���");
		String id =sc.nextLine();
		MemberDTO dto = new MemberDTO(id, null, 0);
		DB.db.remove(dto);
	}

	@Override
	public String toString() {
		return "ȸ������";
	}
	

}
