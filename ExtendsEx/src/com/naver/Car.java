package com.naver;

public class Car {
	public String model = "car";
	private String company;
	private int price;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void run() {
		System.out.println("Car클래스의 run()");
	}
	
	public void k1() {

	}
	public void k2() {

	}
	public void k3() {

	}
	public void k4() {

	}
	public void k5() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
