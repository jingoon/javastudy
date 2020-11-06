package com.naver;

public class Hero {
	
	Weapon[] weapons;
	Weapon w;
	public Hero() {
		weapons = new Weapon[]{new Bow("기본활",1), 
							new Sword("기본검",2),
							new Gun("기본총",5)
							};
		w= weapons[2];
	}
	

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}


	public void attack(Monster mon) {
		
		w.attack(mon);
		
		
	}
	
	public void chageWeapon(int weaponIdx) {
		
		if(weaponIdx>=weapons.length || weaponIdx < 0) {
			weaponIdx=weapons.length-1;
		}
		
		w= weapons[weaponIdx];
		System.out.println(w+"로 변경되었습니다.");
	}
}
