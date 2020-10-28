package com.naver;

public class Test3 {
	private int a;
	private int b;
	private int c;
	int d=0;
	
	
	public Test3() {	// 파라미터가 없어서 디폴트 생성자
		a = 0;
		b = 0;
		c = 0;
	}
	
	public void k333() {
		int aa=3;
		int bb=5;
		int c = aa==bb ? 44 : 33;
		System.out.println(c);
		
	}
	
	public void minus1() {
		System.out.println("--a "+ --a);
	}
	
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	
	
	
	public void plus1() {
		System.out.println("a "+a);
		++a;
		System.out.println("++a " +a);
	}
	
	public void plus11() {
		System.out.println("++a "+ ++a);
	}
	public void plus2() {
		
		System.out.println("b "+ b);
		b++;
		System.out.println("b++ "+b);
	}
	public void plus21() {
		
		System.out.println("b++ "+ b++);
	}
	public void plus211() {
		System.out.println(c++);
	}
	public void plus111() {
		System.out.println(++a);
	}
	
	public void plus1111() {
		d=++d;
		System.out.println(d);
	}
	public void plus2222() {
		d=d++;
		System.out.println(d);
	}
	public void plus3333() {
		System.out.println(d);
	}
	public void p1() {
		int p=0;
		int k =0;
		System.out.println(p);
		System.out.println(p++);
		System.out.println(++p);
		System.out.println(p);
		
	}
	

}
