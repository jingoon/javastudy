package com.naver;

public class Test {
	
	public void me5() {
		// Charater.parseLong()와 Charater.valueof()는 없다		// 대신 문자열.chsrAt();을 사용
		String msg ="h";
		char c = msg.charAt(0);
		System.out.println(c);
	}
	
	public void me41() {
		//문자열을 기본자료형으로 변경하는 방법1,2
		//1.WrapperType.pardeWrapper()
		//2.WrapperType.valueOf()
		String msg="false";
		boolean b = Boolean.parseBoolean(msg);
		System.out.println(b);
		
		boolean b2 = Boolean.valueOf(msg);
		System.out.println(b2);
	}
	
	public void me4() {
		//래퍼클래스.parse기본자료형(문자열)
		//문자열을 기본자료형으로 만들어줌
		String msg = "123";
		int i=Integer.parseInt(msg);
		System.out.println(i+10);
		System.out.println(msg+10);
	}
	
	public void me3() {
		//AutoUnBoxing
		boolean a = new Boolean(false);
		Character b = new Character('c');
		char bb=b;
		
	}
	
	public void me2() {	//Wrapper class
		//각 랩퍼클래스의 자료형
		//AutoBoxing
		Boolean a = false; // 원래는 Boolean a = new Boolean(false); 이지만 AutoBoxing 해줌
		Character b = ' ';
		Byte c = 0;
		Short d = 0;
		Integer e =0;
		Long f =0L;
		Float g= 0.0F;
		Double h =0.0;
		
	}
	
	public void me1() {
		boolean a = false;
		char b =' ';
		byte c =0;
		short d=0;
		int e=0;
		long	f=0L;
		float	g=0.0F;
		double h=0.0;
				
	}

}
