package com.naver;


import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void execute(Scanner sc) {

		System.out.println("종료되었습니다.");
		System.exit(0);
		
	}

	@Override
	public String toString() {
		return "(0.종 료)";
	}
	

}
