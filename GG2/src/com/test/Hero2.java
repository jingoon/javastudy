package com.test;

import java.util.Arrays;

public class Hero2 {
	
	Weapon2[] Weapons2;
	Weapon2 w;
	
	public Hero2() {
		// TODO Auto-generated constructor stub
	}

	public Hero2(Weapon2[] weapons2, Weapon2 w) {
		super();
		Weapons2 = weapons2;
		this.w = w;
	}

	public Weapon2[] getWeapons2() {
		return Weapons2;
	}

	public void setWeapons2(Weapon2[] weapons2) {
		Weapons2 = weapons2;
	}

	public Weapon2 getW() {
		return w;
	}

	public void setW(Weapon2 w) {
		this.w = w;
	}

	public void attack(Monster2 mon2) {
		System.out.print("몬스터 공격:\t");
		w.attack(mon2);
		
	}
	public void attack2(Monster2 mon2) {
		System.out.print("몬스터 공격2:\t");
		
		int bHp =mon2.getHp();
		int aHp = bHp-w.getPower();
		mon2.setHp(aHp);
		System.out.println(mon2);
	}
	public void chaheWeapon(int weaponIdx) {
		
		if(weaponIdx>=Weapons2.length || weaponIdx <0) {
			weaponIdx=0;
			System.out.println("없는 무기를 선택 기본무기로 변경");
		}
		w=Weapons2[weaponIdx];
		System.out.println("무기를"+w+" 로 변경.");
		
	}
	
	

}
