package com.naver;

public class Sum {
	private int num;
	private int tes;
	
	
	Object key1 = new Object();
	Object key2 = new Object();
	
	public Sum() {
		// TODO Auto-generated constructor stub
	}
	public Sum(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void subTes(int n) {
		synchronized (key1) {
			tes -= n;
		}
	}
	public void addTes(int n) {
		synchronized (key1) {
			tes += n;
		}
	}
	public void addnum(int n) {
		synchronized (this) {
			num += n;
		} 
	}
	public void subNum(int n) {
		synchronized (this) {
			num -= n;
		}
	}
	
	public int getTes() {
		return tes;
	}
	public void setTes(int tes) {
		this.tes = tes;
	}
	
	

}
