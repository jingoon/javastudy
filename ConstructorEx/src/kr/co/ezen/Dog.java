package kr.co.ezen;

public class Dog {
	private String name="���̸�";
	private int dogAge=0;
	private String name2 = "������";
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, int age, String name2) {
		this.name = name;
		this.dogAge = age;
		this.name2 =name2;
	}
	
	
	public void dogInfo() {
		System.out.println("���̸���: "+name);
		System.out.println("�����̴�: "+dogAge);
		System.out.println("�����̸���: "+name2);
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
