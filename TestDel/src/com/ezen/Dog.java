package com.ezen;

public class Dog {

	private String name;
	private int age;
	private boolean no;
	
	public Dog() {
		// TODO Auto-generated constructor stub
		no = false;
	}
	
	Dog dog1 = new Dog("Áøµ¾°³", 2);
	
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
