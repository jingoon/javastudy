package com.naver;

public class Spear extends Weapon{

	public Spear(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[" + getName() + "][" + getPower() + "]";
	}
	

}
