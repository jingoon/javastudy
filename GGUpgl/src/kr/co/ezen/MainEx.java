package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.SetUP;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(SetUP.MONSTER_HP,SetUP.MONSTER_SHEILD);
		System.out.println(mon);
		
		Weapon[] weapons = {new Bow("활", SetUP.BOW_POWER), new Sword("검", SetUP.SWORD_POWER), new Gun("총", SetUP.GUN_POWER)};
		Weapon w= weapons[0];
		Hero h1 = new Hero(weapons, w);
		
		int menu =0;
		int idx2=0;
		boolean is = true;
		while(is) {
			System.out.println("메뉴를 고르세요");
			System.out.println("1:공격 2:무기변경 3:종료");
			menu = sc.nextInt();
			if(menu==3) {
				break;
			}else if(menu==1) {
				if(mon.getHp()>0) {
					h1.attack(mon);
				}else {
					weapons[0] =mon.die();		
				}
			
			}else if(menu==2) {
				for(int i=0; i<weapons.length;i++) {
					System.out.print(String.format("%d : %s  ", i, weapons[i]));	// 목록 갱신 바로 안됨
				}
				System.out.println();
				idx2 = sc.nextInt();
				h1.chageWeapon(idx2);
			}
		}
		
		sc.close();
		System.out.println("end");
	}
	

}
