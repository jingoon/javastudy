package kr.co.ezen;

import java.util.Scanner;

import javax.jws.WebParam;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Sword;
import com.naver.Weapon;
import com.naver.monster;

public class MainEx {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		monster mon = new monster(100);
		System.out.println(mon);
		
		Weapon[] weapons = {new Bow("활", 5), new Sword("검", 10), new Gun("총", 20)};
		Weapon	w= weapons[0];
		
		Hero	h1 = new Hero(weapons, w);
		
		int menu =0;
		int idx= 0;
		boolean is = true;
		
		while(is) {
			System.out.println("메뉴를 선택");
			System.out.println("1:공격 2:무기변경 3:중지");
			menu=sc.nextInt();
			if(menu==3) {
				break;
			}else if(menu==1) {
				h1.attack(mon);
			}else if(menu==2) {
				for(int i=0;i<weapons.length;i++) {
					System.out.print(String.format("%d: %s ", i,weapons[i]));
				}
				idx = sc.nextInt();
				System.out.println("");
				h1.ChageWeapon(idx);
			}
		}
		
		
		
		sc.close();
		System.out.println("end");
	}
}
