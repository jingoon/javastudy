package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("������ id�� �Է��ϼ���");
		String id = sc.nextLine();
		MemberDTO dto= new MemberDTO(id, null, 0);
		
		boolean b = DB.db.remove(dto);
		if(b) {
			System.out.println(id+"���� ����");
		}else {
			System.out.println(id+"���� ����");
		}
	
	}

}
