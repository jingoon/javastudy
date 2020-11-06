package kr.co.ezen;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;
import com.test.Bow2;
import com.test.Gun2;
import com.test.Hero2;
import com.test.Monster2;
import com.test.Sword2;
import com.test.Weapon2;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monster mon = new Monster(100);
		System.out.println(mon);
		Weapon[] weapons = {new Bow("È°",1), 
							new Sword("°Ë",5),
							new Gun("ÃÑ",10)
							};
		Weapon w = weapons[2];
		
		Hero spyderman = new Hero(weapons, w);
		
		spyderman.attack(mon);
		spyderman.attack(mon);
		spyderman.chageWeapon(0);
		spyderman.chageWeapon(1);
		System.out.println("\\\\\\");
				
		Monster2 mon2 = new Monster2(500);
		Weapon2 bow = new Bow2("±âº»È°", 1);
		Weapon2	bow1 = new Bow2("È°", 3);
		Weapon2 sword = new Sword2("°Ë", 5);
		Weapon2	gun	=	new Gun2("ÃÑ", 12);
		Weapon2[] Weapons2 = { bow, bow1,sword, gun};
		
		Hero2 char1 = new Hero2(Weapons2, bow);
		char1.attack(mon2);
		char1.chaheWeapon(2);
		char1.attack(mon2);
		char1.chaheWeapon(3);
		char1.attack(mon2);
		char1.chaheWeapon(5);
		char1.attack(mon2);
		char1.attack2(mon2);
		char1.chaheWeapon(3);
		char1.attack2(mon2);
		char1.attack2(mon2);
		char1.attack2(mon2);
		
		
		
	}

}
