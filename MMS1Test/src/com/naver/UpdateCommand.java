package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void command(Scanner sc) {
		
	
			System.out.println("������ ID�� �Է��ϼ���");
			String id=sc.nextLine();
			System.out.println("���ο� �̸��� �Է��ϼ���");
			String name=sc.nextLine();
			System.out.println("���ο� ����(����)�� �Է��ϼ���");
			
			int age = sc.nextInt();
			sc.nextLine();
			MemberDTO dto = new MemberDTO(id, name, age);
			DB.db.add(dto);
	
	
			
		
		
				
		
	}

	@Override
	public String toString() {
		return "3:����";
	}
	

}
