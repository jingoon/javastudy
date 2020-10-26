package com.ezen;

public class Dog {
	String name;
	int age;
	public Dog() {
		
	}
	
	public void me1() {
		
	}
	public void me2(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public Dog me3() {
		return new Dog();
	}
	public int me4(String name) {
		int size = 0;
		return size;
	}

}
