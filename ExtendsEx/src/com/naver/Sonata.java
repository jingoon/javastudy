package com.naver;

public class Sonata extends Car{
	private String model = "sonata";
	
	public Sonata() {
		run();
	}

	public Sonata(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	public void only() {
		System.out.println("�θ�Ŭ�������� ����, �ҳ�ŸŬ�������� �ִ� �޼���");
	}
	
	public void me1() {
		System.out.println(getModel());
		
	}

	@Override
	public void run() {
		System.out.println(":::::::::::");
		System.out.println("sonataŬ������ run()");
		System.out.println("::::::::::::::::");
		
	}
	

}
