package com.naver;

public class Test {
	private int sum = 0;
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public void me1(int a) {
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
			break;
		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;
		default:
			System.out.println("fine");
			break;
		}
	}
	
	public void m2(int a) {
		switch (a) {
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);
			
		default:
			System.out.println(999);
			break;
		}
		System.out.println(">>>����ġ��������>>>>>");
	}
	
	public void me3(int a) {
		switch (a/10) {//����� ����
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;

		default:
			System.out.println("end");
			break;
		}
		System.out.println("********>>>>>>>");
	}
	
	public void me31(int a) {
		int data = a/10; //��������
		switch (data) {	//���� ���� �� �ִ�
		case 1:
			
			break;

		default:
			break;
		}
	}
	
	public void me4(int a) {
		switch (a) {
		//int b=10;  {�� case ���̿� �ڵ��Է� �Ұ�
		case 1:
			
			break;

		default:
			break;
		}
	}
	
//	public void me5(long a) { //int, String, enum
//		switch (a) { 
//		case 10L:
//			
//			break;
//
//		default:
//			break;
//		}
//	}
	
	public void me6(int month) {
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;

		default:
			System.out.println("30�ϱ���");
			break;
		}
	}
	
	public void me60(int month) {
	//	28=2, 30=4,6,9,11 ,31
		if(month>12 || month<1) {
			System.out.println("�Է¿���.1~12������ �Է�");
			return;
		}
			
		switch (month) {
		case 2:
			System.out.println(month+"���� 28�� �����Դϴ�");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"���� 30�� �����Դϴ�");
			break;
		default:
			System.out.println(month+"���� 31�� �����Դϴ�");
			break;
		}
	}
	
	public void me7(int score) {
		//����̾簡
		if(score<0 || score>100) {
			System.out.println("�Է¿���, 0~100����");
			return;
		}
		char result = '��';
		switch (score/10) {
		case 10:
		case 9:
			result='��';
			break;
		case 8:
			result='��';
			break;
		case 7:
			result='��';
			break;
		case 6:
			result='��';
			break;
		default:
			result='��';
			break;
		}
		System.out.println(result);
		
	}
	
	public void me8(String a, String b) {
		// a������ b�� ���� �ְ�
		// b �������� a�� ���� �������� �մϴ�
		//ġȯ �˰���
		String c;
		 c = a;
		 a = b;
		 b = c;
		 System.out.println(a + b);
		
	}
	public void me9(int a) {
		// ���� �˰���
		sum += a;
		System.out.println(sum);
		
	}
	
	public void func1() {
		tt();
		sum+= 3;
		System.out.println(sum);
	}
	public void func2() {
		tt();
		sum *=3;
	}
	public void func3() {
		tt();
		sum -= 3;
	}
	public void tt() {
		System.out.println("hello world");
	}
	
	
	

}
