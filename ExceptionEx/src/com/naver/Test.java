package com.naver;

import java.io.Serializable;
import java.util.ArrayList;


public class Test {
	
	public void me73(String msg) throws Exception {
		if (msg.equals("개새끼")) {
			throw new Exception("욕설금지");
		}
		System.out.println(msg);
	}
	
	public void me72(String msg) throws Exception {
		if (msg.equals("개새끼")) {
			throw new DoNotSwearException1("욕설금지!!");
		}
		System.out.println(msg);
	}
	
	public void me71(String msg) {
		if (msg.equals("개새끼")) {
			throw new DoNotSwearException2("욕설 금지!");
		}
		System.out.println(msg);
	}
	
	public void me7(String msg) {
		if (msg.equals("개새끼")) {
			throw new RuntimeException("욕설금지");
		}
		System.out.println(msg);
	}
	
	public void me61() {
		int a = 4;
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			System.out.println("0으로 나눠서 예외처리가 됨");
			return;
		}finally {
			System.out.println("성공/실패 상관없이 실행");
			System.out.println("리턴보다 강력함");
		}
		System.out.println("me61() end");
	}
	
	public void me6(int num) {
		int a=4;
		try {
			System.out.println(a/num);
		} catch (Exception e) {
			System.out.println("0으로 나누면 안 됩니다.");
		}finally {
			System.out.println("성공하든 실패하든 반드시 실행되는 코드");
			System.out.println("return보다 더 강력하다.");
		}
		System.out.println("me6() end");
	
	}
	
	public void me5(int idx) throws Exception{
		String msg="hi";
		System.out.println(msg.charAt(idx));
	}
	
	public void me4(int weaponIdx) {
		String[] arr ={"활","검","총"};
		try {
			System.out.println(arr[weaponIdx]);
		} catch (Exception e) {
			System.out.println("사용자가 잘못된 값을 입력");
		}
		
	}
	
	public void me3() {
		Serializable t1 = new String("hello");
		Serializable t2 = new ArrayList<Object>();
		
		
		try {
			String msg = (String) t2;
		} catch (Exception e) {
			System.out.println("뭔가 문제있지만 무시하겠음me3");
		}
		
		
		
	}
	public void me2() {
		int[] arr = {3,6,9};
		System.out.println(arr[arr.length-1]);
	}
	public void me1() {
		String msg = "hello";
		System.out.println(msg.length());
	}

}
