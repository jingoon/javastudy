package com.naver;

public class CarRegistManagementService {
	private String carName;
	
	public CarRegistManagementService() {
		carName = "소나타";
	}
	
	//-----------------------------------------
	//우클릭 소스 - 제너레이터 겟,셋, 체크
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCountCarName(String carName) {
		
		int size = carName.length();
		
		return size;
	}
	public long add(int a , int b) {
		
		long sum =(long) a + b;
		return sum;
	}
	
	

}
