package kr.co.ezen;

public class Dog {
	private String name;
	private int age;
	
	public Dog() {
		name = "�۸���";
		age =23;
	}
	
	public Dog(String name) {
		this.name = name;
	}
	public Dog(int age) {
		this.age = age;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Dog(int age, String name) {
		this.age= age;
		this.name=name;
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
