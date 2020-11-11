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
		return "Weapon [name=" + name + ", power=" + power + "]";
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
		int monhp = mon.getHp()	- power;
		if(monhp<=0) {
			mon.setHp(0);
			mon.die();
		}
		mon.setHp(monhp);
		
		System.out.println(String.format("%s(%d)·Î %s °ø°Ý", name,power,mon));
	}
	
}
