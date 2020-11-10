package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("삭제할 id를 입력하세요");
		String id = sc.nextLine();
		MemberDTO dto= new MemberDTO(id, null, 0);
		
		boolean b = DB.db.remove(dto);
		if(b) {
			System.out.println(id+"삭제 성공");
		}else {
			System.out.println(id+"삭제 실패");
		}
	
	}

}
