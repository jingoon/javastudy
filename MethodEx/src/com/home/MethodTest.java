package com.home;

public class MethodTest {
	
	public MethodTest() {	//������ ��ü�� ������ ��
		
	}
	
	public void stand() {	//��ü�� ȣ�� �� ��
		System.out.println("�Ͼ");
	}
	public void sleep() {
		System.out.println("���̵�ϴ�.");
	}
	public void sayHello() {
		System.out.println("Hello~");
	}
	public void sitDown() {
		System.out.println("�ɾ�");
		callName("�浿��");
	}
	public void callName(String name) {
		System.out.println(name);
		sayHello();
	}
	public void printDan(int i) {
		System.out.println("<"+ i +"�� �ܿ�>");
		for(int i2=1;i2<=9;i2++) {
			String x="x";
			String e="=";
			System.out.println(i + x + i2 + e + i*i2);
		}
		System.out.println(i+"�� �������----------");
	}
	public void printScore(String name, int score) {
		System.out.println(name + " " + score + "��");
	}
	public void printDan2() {
		System.out.println();
	}

}

	
