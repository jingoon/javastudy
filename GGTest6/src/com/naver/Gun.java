package com.naver;

public class Gun extends Weapon{

	public Gun(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[" + getName() + "][" + getPower() + "]";
	}
	

}
