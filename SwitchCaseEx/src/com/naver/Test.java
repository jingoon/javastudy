package com.naver;

public class Test {
	private int sum = 0;
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public void me1(int a) {
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
			break;
		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;
		default:
			System.out.println("fine");
			break;
		}
	}
	
	public void m2(int a) {
		switch (a) {
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);
			
		default:
			System.out.println(999);
			break;
		}
		System.out.println(">>>스위치에서나감>>>>>");
	}
	
	public void me3(int a) {
		switch (a/10) {//연산식 가능
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;

		default:
			System.out.println("end");
			break;
		}
		System.out.println("********>>>>>>>");
	}
	
	public void me31(int a) {
		int data = a/10; //변수선언
		switch (data) {	//변수 넣을 수 있다
		case 1:
			
			break;

		default:
			break;
		}
	}
	
	public void me4(int a) {
		switch (a) {
		//int b=10;  {와 case 사이에 코드입력 불가
		case 1:
			
			break;

		default:
			break;
		}
	}
	
//	public void me5(long a) { //int, String, enum
//		switch (a) { 
//		case 10L:
//			
//			break;
//
//		default:
//			break;
//		}
//	}
	
	public void me6(int month) {
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;

		default:
			System.out.println("30일까지");
			break;
		}
	}
	
	public void me60(int month) {
	//	28=2, 30=4,6,9,11 ,31
		if(month>12 || month<1) {
			System.out.println("입력오류.1~12월까지 입력");
			return;
		}
			
		switch (month) {
		case 2:
			System.out.println(month+"달은 28일 까지입니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"달은 30일 까지입니다");
			break;
		default:
			System.out.println(month+"달은 31일 까지입니다");
			break;
		}
	}
	
	public void me7(int score) {
		//수우미양가
		if(score<0 || score>100) {
			System.out.println("입력오류, 0~100까지");
			return;
		}
		char result = '수';
		switch (score/10) {
		case 10:
		case 9:
			result='수';
			break;
		case 8:
			result='우';
			break;
		case 7:
			result='미';
			break;
		case 6:
			result='양';
			break;
		default:
			result='가';
			break;
		}
		System.out.println(result);
		
	}
	
	public void me8(String a, String b) {
		// a변수에 b의 값을 넣고
		// b 변수에는 a의 값을 넣으려고 합니다
		//치환 알고리즘
		String c;
		 c = a;
		 a = b;
		 b = c;
		 System.out.println(a + b);
		
	}
	public void me9(int a) {
		// 누적 알고리즘
		sum += a;
		System.out.println(sum);
		
	}
	
	public void func1() {
		tt();
		sum+= 3;
		System.out.println(sum);
	}
	public void func2() {
		tt();
		sum *=3;
	}
	public void func3() {
		tt();
		sum -= 3;
	}
	public void tt() {
		System.out.println("hello world");
	}
	
	
	

}
