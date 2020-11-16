package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
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
		
		List<Weapon> listw = new ArrayList<Weapon>();
		listw.add(new Bow("Ȱ", SetUP.BOW_POWER));
		listw.add(new Sword("��", SetUP.SWORD_POWER));
		listw.add(new Gun("��", SetUP.GUN_POWER));
		
		Weapon w= listw.get(0);
		Hero h1 = new Hero(listw, w);
		
		int menu =0;
		int idx2=0;
		boolean is = true;
		while(is) {
			System.out.println("�޴��� ������");
			System.out.println("1:���� 2:���⺯�� 3:����");
			menu = sc.nextInt();
		//	����,���⺯��,���� command
				System.out.println();
				idx2 = sc.nextInt();
				h1.chageWeapon(idx2);
		}
		sc.close();
		System.out.println("end");
	
	}

}
