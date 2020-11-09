package kr.co.test2;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Monster mon = new Monster(150);
		System.out.println(mon);
		Weapon[] weapons = {new Bow("Ȱ",5),	new Sword("��", 7), new Gun("��", 10)};
		Weapon w = weapons[2];
		Hero spyderman = new Hero(weapons, w);
		
		boolean isTrue = true;
		int menu = 0;
		int weaponIndex = 0;
		while(isTrue) {
			System.out.println("���� �� �ϳ��� �����ϼ���.");
			System.out.println("0:����, 1:���⺯��, 2:����");
			
			menu = sc.nextInt();
			
			if(menu==2) {
				break;
			}else if(menu==0) {
				spyderman.attack(mon);
			}else if(menu==1) {
				System.out.println("���⸦ �����ϼ���");
				
				for(int i =0; i<weapons.length;i++) {
					System.out.print(i);
					System.out.print(":"+weapons[i]+", ");
				}
				System.out.println();
				
				weaponIndex = sc.nextInt();
				sc.nextLine();
				spyderman.chageWeapon(weaponIndex);
				
			}
		
							
		}
		
		
		sc.close();
		System.out.println("end");
	}

}