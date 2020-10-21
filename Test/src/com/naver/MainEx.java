package com.naver;

public class MainEx {
	
	int c;
	
	public MainEx() {
		boolean b = false;
		c = 44;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int a = 10; //변수 a를 선언하면서 10으로 초기화.
		System.out.println(a);
		System.out.println(a+1);
		
		System.out.println(a*10);
		
		a=100;
		System.out.println(a);
		
		int c = 0;
		c=44;
		
		System.out.println("==========");
		LocalEx localEx = new LocalEx(); // 참조자료형 호출
		System.out.println("===========");
		LocalEx2 Lo2 = new LocalEx2();
	}

}
