package com.naver;

public abstract class Weapon {

	private String name;
	private int power;

	public Weapon(String name) {
		super();
		this.name = name;
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
	@Override
	public String toString() {
		return name;
	}
	
	public abstract void img();
	
	public void attack(Monster mon) {
		int bhp = mon.getHp();
		int ahp = bhp-power;
		mon.setHp(ahp);
		System.out.println(ahp);
	}
	

}
