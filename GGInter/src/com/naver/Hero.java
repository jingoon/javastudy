package com.naver;

public class Hero {
	private String name;
	Weapon[] weapons;
	Weapon w;
	public Hero() {
	
	}
	
	public Hero(String name, Weapon[] wepons, Weapon w) {
		super();
		this.name = name;
		this.weapons = wepons;
		this.w = w;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Weapon[] getWepons() {
		return weapons;
	}
	public void setWepons(Weapon[] wepons) {
		this.weapons = wepons;
	}
	public Weapon getW() {
		return w;
	}
	public void setW(Weapon w) {
		this.w = w;
	}
	public void attack(Monster mon) {
		w.attack(mon);
	}
	public void chageWeapon(int weaponidx) {
		if(weaponidx <0 || weaponidx >= weapons.length) {
			weaponidx=weapons.length-1;
		}
		w= weapons[weaponidx];
		System.out.println(w+"으로 변경되었습니다.");
		
	}
	

}
