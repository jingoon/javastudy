package com.naver;

public class Test {
	
	public Test() {
	
	}
	
	
	public void me6(boolean a, boolean b) {
		System.out.println(a!=b);
	}
	
	public void me51(boolean a, boolean b) {
		System.out.println("me51_boolean 두값의 비교: " + (a==b));
	}
	
	public void me5(short a, short b) {
		System.out.println("me5의 결과 "+(a==b));
	}
	
	public boolean me4(byte a, byte b) {
		return a<=b;
	}
	
	public char me31(int a, int b) {
		if(a>b) {
			return 'a';
		}else {
			return 'z';
		}
	}
	
	public String me3(float a, float b) {
	//	boolean retult0 = a<b;
		
		String result;
		if(a<b){
			result = "ok";
		}else {
			result ="no";
		}
		return result;
	}
	
	
	
	public boolean m2(long a, long b) {
		boolean c = a>=b;
		
		return c;
	}
	
	public boolean me1(int a, int b) {
		 
		 boolean  c = a > b;
		 
		 return c;
	}
	
	

}
