package com.naver;

import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void command(Scanner sc) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
				
	}

	@Override
	public String toString() {
		return "0:종료";
	}
	

}
