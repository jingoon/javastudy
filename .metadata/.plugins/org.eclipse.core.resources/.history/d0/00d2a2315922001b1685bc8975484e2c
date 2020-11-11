package kr.co.test;

import java.util.Scanner;

public class Test {
	
	private final int A_B_C = 3;
	private static final int C_D_E=44;
	private final int D_E_F;
	
	public Test() {
		//A_B_C = 55;
		D_E_F = 55;
	}
	public Test(int D_E_F) {
		//this.A_B_C = A_B_C;
		this.D_E_F = D_E_F;
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		//변수: 값이 바뀌는 데이터
		//t1.A_B_C=55;	상수는 변경 할 수 없음
		System.out.println(t1.A_B_C);
		System.out.println(Test.C_D_E);		// static은 클래스명. 호출
		
		Scanner sc = new Scanner(System.in); //키보드 입력
		
		boolean isTrue = true;
		int a=0;
		while(isTrue) {
			System.out.println("a 값을 입력하세요.");
			a = sc.nextInt();
			sc.nextLine();
			System.out.println("msg1값을 입력하세요.");
			String msg1 = sc.nextLine();
			System.out.println(msg1);
			
			if(a==4) {
				break;
			}
			System.out.println(a+ "를 넘겨받았습니다.");
		}
		
		System.out.println("end");
		
		sc.close();
	}

}
