package com.naver;

import java.util.Scanner;

public class SelectCommand implements Command{

	@Override
	public void command(Scanner sc) {
		System.out.println("ȸ������� ��ȸ�մϴ�.");
		for (int i = 0; i < DB.db.size(); i++) {
			MemberDTO dto =DB.db.get(i);
			System.out.println(dto);
		}
				
	}

	@Override
	public String toString() {
		return "2:��ȸ";
	}
	

}
