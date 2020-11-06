package com.test;

public class Weapon2 {
	private String name;
	private int power;
	
	public Weapon2() {
		// TODO Auto-generated constructor stub
	}
	
	public void attack(Monster2 mon2) {
		int bHp =mon2.getHp();
		int aHp = bHp-power;
		mon2.setHp(aHp);
		System.out.println(mon2);
	}

	public Weapon2(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Weapon2 [name=" + name + ", power=" + power + "]";
	}
	
	

}
