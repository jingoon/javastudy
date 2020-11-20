package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void command(Scanner sc) {
		System.out.println("삭제할 ID를 입력하세요");
		String id = sc.nextLine();
		boolean del =DB.db.remove(new MemberDTO(id, null, 0));
		if(del)	{
			System.out.println(id+"삭제 성공");
		}
			System.out.println(id+"의 삭제가 실패하였습니다.");
	}

	@Override
	public String toString() {
		return "4:삭제";
	}
	

}
