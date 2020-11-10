package co.kr.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.SetUp;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(SetUp.MONSTER_HP);
		System.out.println(+mon.getHp());
		Weapon[] weapons = {new Bow("Ȱ", SetUp.BOW_POWER),new Sword("��", SetUp.SWORD_POWER), new Gun("��", SetUp.GUN_POWER)};
		Weapon w= weapons[0];
		Hero h1 = new Hero("����1", weapons, w);
		
		int menu=0;
		int weaponIndex=0;
		boolean is = true;
		while(is) {
			System.out.println("1:����, 2:���⺯��, 3:����");
			menu= sc.nextInt();
			if(menu==3) {
				break;
			}else if(menu==1) {
				h1.attack(mon);
			}else if(menu ==2) {
				for(int i = 0; i< weapons.length;i++) {
				System.out.print(String.format("%d:%s ", i,weapons[i]));
				
				}
				System.out.println();
				weaponIndex = sc.nextInt();
				h1.chageWeapon(weaponIndex);
			}
		}
		sc.close();
		System.out.println("end");
	}

}
