package com.naver;

public class Hero {
	Weapon[] weapons;
	Weapon w;
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}
	public void attack(Monster mon) {
		w.attack(mon);
	}
	public void chageWeapon(int weaponChaIdx) {
		if(weaponChaIdx <0 || weaponChaIdx>=weapons.length) {
			weaponChaIdx= weapons.length-1;
		}
		w=weapons[weaponChaIdx];
		System.out.println(w+"로 무기 변경");
	}
	
}
