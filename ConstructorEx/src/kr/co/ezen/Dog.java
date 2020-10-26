package kr.co.ezen;

public class Dog {
	private String name="개이름";
	private int dogAge=0;
	private String name2 = "개주인";
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, int age, String name2) {
		this.name = name;
		this.dogAge = age;
		this.name2 =name2;
	}
	
	
	public void dogInfo() {
		System.out.println("개이름은: "+name);
		System.out.println("개나이는: "+dogAge);
		System.out.println("주인이름은: "+name2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return dogAge;
	}

	public void setAge(int age) {
		this.dogAge = age;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}
	
}
