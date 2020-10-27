package com.naver;

public class Car {
	private String name;
	private int carNum;
	private boolean no;
	private int gas;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	

	public Car(String name, int carNum, boolean no, int gas) {
		super();
		this.name = name;
		this.carNum = carNum;
		this.no = no;
		this.gas = gas;
	}
	



	public boolean isNo() {
		return no;
	}



	public void setNo(boolean no) {
		this.no = no;
	}



	public int getGas() {
		return gas;
	}



	public void setGas(int gas) {
		this.gas = gas;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	

}
