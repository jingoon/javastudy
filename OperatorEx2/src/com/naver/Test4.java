package com.naver;

public class Test4 {
	
	private int a;
	private int b;
	
	public Test4() {

		a=4;
		b=11;
	}
	
	public void con5(int score) {
		char c = score >=90 ? 'A' 
				: score >= 80? 'B'
						: score >= 70? 'C'
								: score >= 60? 'B'
										: 'F';
	}
	
	public void con4() {
		int c = a >b*2 ? me1() : a;		//me1()�� ��ȯ���� �־ ��밡�� 
										//me2()�� ��ȯ���� ��� ���Ұ�
	}
	
	public void me2() {
		System.out.println(44);
	}
	public int me1() {
		return 3;
	}
	
	
	public void con3() {
		StringBuffer c = a <= b ? new StringBuffer("hello") : new StringBuffer("no");
	}
	
	public void con2() {
		/*
		 * a�� b�� �� ������ new String("hello")
		 * �׷��� ������ new String("no")�� ���´�
		 * ���� c�� �����Ͻÿ�
		 */
		String c = a != b ? new String("hello") : new String("no");
		
	}
	
	
	public void con1() {
		/*
	    ���� c�� 
		a�� b���� ũ�ų� ������ 'a'
		�׷��� ������ 'z'�� ���´�
		���� c�� �����Ͻÿ�
		*/
		char c = a>=b ? 'a' : 'z';
		
	}
	

}
