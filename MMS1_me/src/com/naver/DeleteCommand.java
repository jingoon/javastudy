package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է��ϼ���");
		String id=sc.nextLine();
		
		boolean ok =DB.DBlist.remove(new MemberDTO(id, null, 0));
		if(ok) {
			System.out.println(id+"�� Member�� �����Ǿ����ϴ�");
		}else {
			System.out.println(id+"�� ������ �����Ͽ����ϴ�");
		}
		
	}

	@Override
	public String toString() {
		return "( 4.ȸ�� ���� )";
	}

}
