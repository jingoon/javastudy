package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void command(Scanner sc) {
		System.out.println("������ ID�� �Է��ϼ���");
		String id = sc.nextLine();
		boolean del =DB.db.remove(new MemberDTO(id, null, 0));
		if(del)	{
			System.out.println(id+"���� ����");
		}
			System.out.println(id+"�� ������ �����Ͽ����ϴ�.");
	}

	@Override
	public String toString() {
		return "4:����";
	}
	

}
