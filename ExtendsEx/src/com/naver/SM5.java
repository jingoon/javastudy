package com.naver;

public class SM5 extends Car {
	
	public SM5() {
		// TODO Auto-generated constructor stub
		run();
	}
	
	public SM5(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}

	public void me1() {
		System.out.println(getModel());
	}

	@Override
	public void run() {
		System.out.println("SM5�� run()");
	}
	
	
	
	
}
