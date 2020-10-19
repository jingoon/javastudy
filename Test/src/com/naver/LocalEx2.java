package com.naver;

public class LocalEx2 {
	//멤버변수: LocalEx2필드에 선언된 변수
	//멤버 변수 선언, 디폴드값으로 선언
	boolean bo;
	char c;
	byte b;
	short s;
	int i ;
	long l;
	float f;
	double d;
		
	public LocalEx2() {
		// 지역 변수 선언, 초기화 해준다
		boolean bo2 = true;
		char c2 = '대';
		
		System.out.println(bo2);
		System.out.println(c2);
		// 지역변수 대입, 변수선언 이후 가능
		bo2 = false;
		System.out.println(bo2);
		c2 = '입';
		System.out.println(c2);
		
	}

}
