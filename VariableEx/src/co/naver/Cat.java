package co.naver;

public class Cat {
	//member 변수(클레스 필드에 선언된 변수)
	String name = "happy"; 
	int age;
	String addess;
	
	public Cat() {
		
		System.out.println(name);
		int b = 33;
		System.out.println(b);
		me1(); // 멤버들끼리는 순서가 중요하지 않다 
	}
	
	public void me1() {
		System.out.println(name);
	}
	

}
