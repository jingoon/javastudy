package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id를 입력하세요");
		String id=sc.nextLine();
		
		boolean ok =DB.DBlist.remove(new MemberDTO(id, null, 0));
		if(ok) {
			System.out.println(id+"의 Member가 삭제되었습니다");
		}else {
			System.out.println(id+"의 삭제가 실패하였습니다");
		}
		
	}

	@Override
	public String toString() {
		return "( 4.회원 삭제 )";
	}

}
