package com.naver;

public class Staf extends Weapon{

	public Staf(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[" + getName() + "][" + getPower() + "]";
	}
	

}
