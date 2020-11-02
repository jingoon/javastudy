package com.naver;

public class Sonata {
	
	public static String company;
	private String modelName;
	
	static {
		company = "hyundai";
	}
	
	public Sonata() {
		// TODO Auto-generated constructor stub
	}

	public Sonata(String modelName) {
		super();
		this.modelName = modelName;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Sonata.company = company;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	

}
