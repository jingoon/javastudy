package com.naver;

import java.util.Random;

public class Test {
	
	public void me6() {
		//rnd1,2�� ���尡 ���� ���������� ���� �� ���� �迭���� ����.
		// ù��° �� ������, �ι�° �� ������ ����°...�� ���ΰ���
		Random rnd1 = new Random(2);
		Random rnd2 = new Random(2);
		for (int i = 0; i < 10; i++) {
			int num1 = rnd1.nextInt(100);
			int num2 = rnd2.nextInt(100);
		System.out.println(num1==num2);
		}
	}
	public void me5(int start, int end) {
		//start~end ������ �ִ� ���ڰ� ���Ƿ� �������� ���α׷���
		
		Random rnd = new Random();
		int num =rnd.nextInt(end - start + 1 )+ start;
		System.out.println(num);
	}
	
	
	public void me4() {
		//������ ���� ������ 3~10���� �������� 
		Random rnd = new Random();
		int n=10-3+1;
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(n)+3; 
			/*
			 * 0+3 ~n-1+3
			 * 3(start)~10(end)
			 * n-1+3=10
			 * n=10-3+1
			 * n=end-start+1
			 */
			System.out.println(num);
		}
			
		
	}
	
	public void me3() {
		int num2 = 2;
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(num2); // 0~n����
			System.out.println(num);
		}
		
		
	}
	
	public void me2() {
		Random rnd = new Random(System.currentTimeMillis());
	}
	
	public void me1() {
		Random rnd = new Random();
	}

}
