package com.naver;

import java.util.Scanner;

public class SelectCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		for (int i = 0; i < DB.DBlist.size(); i++) {
			System.out.println(DB.DBlist.get(i));
		}
		
		
	
	}

	@Override
	public String toString() {
		return "(2.회원 조회)";
	}

}
