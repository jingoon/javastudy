package kr.co.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Ű���� �Է�
		
		boolean isTrue = true;
		int a=0;
		while(isTrue) {
			System.out.println("a ���� �Է��ϼ���.");
			a = sc.nextInt();
			sc.nextLine();
			System.out.println("msg1���� �Է��ϼ���.");
			String msg1 = sc.nextLine();
			System.out.println(msg1);
			
			if(a==4) {
				break;
			}
			System.out.println(a+ "�� �Ѱܹ޾ҽ��ϴ�.");
		}
		
		System.out.println("end");
		
		sc.close();
	}

}