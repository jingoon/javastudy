package com.naver;

public abstract class Weapon implements WeaponSkill {
	
	private String name;
	private int power;
	
	
	
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
		int aHP = mon.getHp();
		int bHP = aHP - power;
		mon.setHp(bHP);
		System.out.println(String.format("남은 체력: %d",bHP));
		
	}
	
	

	@Override
	public String toString() {
		return getName();
	}

	}
	
	
