package com.naver;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private int level;
	private int exp;
	
	Weapon[] weapons;
	Weapon w;
	public Hero(String name, int hp, int power, int level, int exp, Weapon[] weapons, Weapon w) {
		super();
		this.name = name;
		this.hp = hp;
		this.power = power;
		this.level = level;
		this.exp = exp;
		this.weapons = weapons;
		this.w = w;
	}
	
	

}
