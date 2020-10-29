package com.naver;

public class Test {
		
	
	public void me1() {
		int a=10;
		if(a%5==0) {
			System.out.println(5);
		}
	}
	
	public void me2(int a) {
		
		if(a%5==0 && a%6==0) {
			System.out.println("최소공배수");
			System.out.println(30);
			
		}
	}
	
	public void me3(int a) {
		if(a!=4) {
			System.out.println(true);
			
		}
	}
	
	public String me4(int a) {
		if(a<=10) {
			return "ok";
		}else {
			return "no";
		}
	}
	
	public void me5(int x) {
		int y=0;
			if(x<0) {
				y=3;
				System.out.println(y);
			}else if(x>=0) {
				y=-3;
				System.out.println(y);
			}
				
	}
	public void me6(int a) {
		if(a%2==0) {
			System.out.println(2);
		}else if(a%3==0) {
			System.out.println(3);
		}else if(a%5==0) {
			System.out.println(5);
		}else {
			System.out.println(0);
		}
	}
	public char me7(int score) {
		char result = '수';
		if(score>=90) {
			 result = '수';
		}else if(score >=80) {
			result= '우';
		}else if(score >=70) {
			result= '미';
		}else if(score >=60) {
			result= '양';
		}else {
			result= '가';
		}
		return  result;
	}
	
	public void me8() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Test() {
	}

}
