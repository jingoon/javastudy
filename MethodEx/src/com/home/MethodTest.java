package com.home;

public class MethodTest {
	
	public MethodTest() {	//생성자 객체를 생성할 때
		
	}
	
	public void stand() {	//객체를 호출 할 때
		System.out.println("일어나");
	}
	public void sleep() {
		System.out.println("잠이듭니다.");
	}
	public void sayHello() {
		System.out.println("Hello~");
	}
	public void sitDown() {
		System.out.println("앉아");
		callName("길동아");
	}
	public void callName(String name) {
		System.out.println(name);
		sayHello();
	}
	public void printDan(int i) {
		System.out.println("<"+ i +"단 외워>");
		for(int i2=1;i2<=9;i2++) {
			String x="x";
			String e="=";
			System.out.println(i + x + i2 + e + i*i2);
		}
		System.out.println(i+"단 여기까지----------");
	}
	public void printScore(String name, int score) {
		System.out.println(name + " " + score + "점");
	}
	public void printDan2() {
		System.out.println();
	}

}

	
