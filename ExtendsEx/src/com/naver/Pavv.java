package com.naver;

public class Pavv {
	
	private String model;
	private String company;
	private int price;
	
	public Pavv() {
		// TODO Auto-generated constructor stub
	}

	public Pavv(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
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
