package com.naver;

public abstract class Weapon {
	private String name;
	private int power;
	
	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(String name, int power) {
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
	public void attack(Monster mon) {
		img();
		int monHP = mon.getHp() - power;
		mon.setHp(monHP);
		System.out.println("몬스터의 남은체력: "+monHP);
	}
	
	public abstract void img();

	@Override
	public String toString() {
		return name;
	}
	

}
