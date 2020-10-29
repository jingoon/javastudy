package kr.co.ezen;

import com.naver.Person;
import com.naver.TV;
import com.naver.TV2;
import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.me1();
		t1.me2(60);
		System.out.println("----------");
		t1.me3(5);
		String me4 = t1.me4(3);
		System.out.println(me4);
		t1.me5(23493);
		t1.me6(3);
		char me7 = t1.me7(66);
		System.out.println(me7);
		System.out.println("------------------");
		TV tv1 = new TV(10,15, false);
		tv1.powerOn();
		System.out.println(tv1.getPower());
		System.out.println(tv1.getVol());
		tv1.volDown();
		System.out.println(tv1.getVol());
		tv1.setVol(100);
		tv1.setCh(999);
		tv1.chUp();
		System.out.println(tv1.getCh());
		System.out.println(tv1.getPower());
		tv1.chDown();
		tv1.powerOff();
		tv1.tvInfo();
		tv1.powerOn();
	//	tv1.powerOff();
		tv1.volDown();
		tv1.volDown();
		tv1.vloUp();
		tv1.vloUp();
		tv1.vloUp();
		tv1.chUp();
		tv1.chUp();
		tv1.chDown();
		tv1.chDown();
		tv1.chDown();
		tv1.tvInfo();
		
		TV2 tv = new TV2();
		tv.tvInfo();
		tv.power();
		tv.tvInfo();
		tv.volDown();
		tv.chDown();
		tv.volUp();
		System.out.println("=======================");
		
		Person kim = new Person(tv1);
		
		kim.tvOn();
		kim.tvOff();
		kim.tvOn();
		kim.getTv1().tvInfo();
		kim.getTv1().chUp();
		kim.getTv1().volDown();
		kim.getTv1().setVol(50);
		kim.getTv1().tvInfo();
		
		
		
		
		
		
	}

}
