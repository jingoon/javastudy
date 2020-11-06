package com.naver;

public class Test {
	
	public void me3(int a, int b, int...arr) {
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int k = arr.length;
		System.out.println(k);
	}
	
	public void me2(int[] arr) {
		int sum =0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
	}
	public void me11(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void me1(int a, int b) {
		System.out.println(a+b);
	}

}
