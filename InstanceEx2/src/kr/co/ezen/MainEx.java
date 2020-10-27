package kr.co.ezen;

import com.naver.Bow;
import com.naver.Hand;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Spear;
import com.naver.Sword;

public class MainEx {

	public static void main(String[] args) {
		

		Monster mon = new Monster();
		Bow bow = new Bow();
		Sword sword = new Sword();
		Hand hand = new Hand();
		Spear spear = new Spear();
		
		Hero char1 = new Hero(hand);
		char1.attack(mon);
		
		char1.setBow(bow);
		char1.attackBow(mon);
		
		char1.setSpear(spear);
		char1.attackSpear(mon);
		
		char1.setSword(sword);
		char1.attackSword(mon);
		
				
		
		
		
		
	}

}
