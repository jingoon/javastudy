package com.naver;

import java.util.Arrays;

public class Hero {
	Weapon[] weapons;
	Weapon w;
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
	public void chageWeapon(int idx) {
		if(idx>=weapons.length || idx<0) {
			idx=weapons.length-1;
			
		}
		w= weapons[idx];
		System.out.println(w+"로 무기가 변경");
	}
	
	

}
