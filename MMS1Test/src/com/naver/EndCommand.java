package com.naver;

import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void command(Scanner sc) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
				
	}

	@Override
	public String toString() {
		return "0:����";
	}
	

}
