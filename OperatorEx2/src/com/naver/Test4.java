package com.naver;

public class Test4 {
	
	private int a;
	private int b;
	
	public Test4() {

		a=4;
		b=11;
	}
	
	public void con5(int score) {
		char c = score >=90 ? 'A' 
				: score >= 80? 'B'
						: score >= 70? 'C'
								: score >= 60? 'B'
										: 'F';
	}
	
	public void con4() {
		int c = a >b*2 ? me1() : a;		//me1()은 반환형이 있어서 사용가능 
										//me2()는 반환형이 없어서 사용불가
	}
	
	public void me2() {
		System.out.println(44);
	}
	public int me1() {
		return 3;
	}
	
	
	public void con3() {
		StringBuffer c = a <= b ? new StringBuffer("hello") : new StringBuffer("no");
	}
	
	public void con2() {
		/*
		 * a가 b가 안 같으면 new String("hello")
		 * 그렇지 않으면 new String("no")를 갖는다
		 * 변수 c를 선언하시오
		 */
		String c = a != b ? new String("hello") : new String("no");
		
	}
	
	
	public void con1() {
		/*
	    변수 c는 
		a가 b보다 크거나 같으면 'a'
		그렇지 않으면 'z'를 갖는다
		변수 c를 선언하시오
		*/
		char c = a>=b ? 'a' : 'z';
		
	}
	

}
