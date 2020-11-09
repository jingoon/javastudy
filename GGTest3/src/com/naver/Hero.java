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
	public Weapon[] getWeapons() {
		return weapons;
	}
	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
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
	public void chageWeapon(int CWIdx) {
		if(CWIdx<0 || CWIdx>=weapons.length) {
			CWIdx=weapons.length-1;
		}
		w= weapons[CWIdx];
		System.out.println(w+"로 무기변경합니다.");
	}

}
