package com.naver;


public class Test2 {
	private int a=0;
	private boolean b;
	
	
	public void kTest(int d, int k) {
		
		for(int i=0;i<=3;i++) {
	
			System.out.println(i/d+k);
			
		}
		 
		
	}
	
	public void switchBoolean() {
		b=!b;
		System.out.println(b);
	}
	
	public void switchInt() {
		a= 1-a;
		System.out.println(a);
		
	}
	
	public void k3(boolean a) {
		System.out.println(!a);
		System.out.println(a);
	}
	
	public void k2(boolean a, boolean b) {
		System.out.println(a || b);
		
	}
	
	public void k1(boolean a, boolean b) {
	boolean result =	a && b;
	 System.out.println(result);
	}

}
