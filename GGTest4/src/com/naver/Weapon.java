package com.naver;

public class Weapon {
	private String name;
	private int power;
	public Weapon(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	@Override
	public String toString() {
		return name;
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
	
	public void attack(Monster mon) {
		int monhp = mon.getHp() - power;
		mon.setHp(monhp);
		System.out.println(monhp);
	}
	
	

}
