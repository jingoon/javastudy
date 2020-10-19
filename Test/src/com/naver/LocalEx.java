package com.naver;

public class LocalEx {
	//멤버변수, 디폴드값
	boolean a; 
	char b;		
	byte c;
	short d;
	int e;
	long f;
	float g;
	double h;
	
	public LocalEx() {	// 생성자
		
		//지역 변수
		boolean aa = true;	// 변수 초기화
		boolean aaa = false; 
		aa= false; // 지역변수 대입
		aaa= true;
		
		char bb = '한';
		bb= '문';
		
		byte cc =0; //초기화
		cc = 127; 	// 변수 대입
		
		short dd = 0;
		dd = 200;
		
		int ee = 323000;
		ee = 4000;
		
		long ff = 4000000000L;
		ff = 50000000000L;
		
		float gg = 5.32f;
		gg = 3.55f;
		double hh = 33.33;
		hh = 3.14;
		
		System.out.println(a);
		System.out.println(ee);
		System.out.println(aaa);
		System.out.println(aa);
		System.out.println(":::::::::::::::");
		test();
		
							
		
	}
	
	public void test() { //메서드
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

}
