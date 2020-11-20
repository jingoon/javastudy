package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void command(Scanner sc) {
		
		try {
			System.out.println("ID�� �Է��ϼ���");
			String id=sc.nextLine();
			System.out.println("�̸��� �Է��ϼ���");
			String name=sc.nextLine();
			System.out.println("����(����)�� �Է��ϼ���");
			int age=sc.nextInt();
			sc.nextLine();
			
			MemberDTO dto = new MemberDTO(id, name, age);
			DB.db.add(dto);
		} catch (Exception e) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return;
		}
			
		
		
	}

	@Override
	public String toString() {
		return "1:�Է�";
	}
	

}
