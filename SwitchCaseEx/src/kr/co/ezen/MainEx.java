package kr.co.ezen;

import com.naver.SwitchTest;
import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		
		Test t1 =new Test();
		t1.me1(4);
		t1.me1(3);
		t1.me1(0);
		System.out.println("=============");
		t1.m2(3);
		t1.m2(4);
		System.out.println("=============");
		t1.me3(100);
		t1.me3(24);
		t1.me6(13);
		t1.me60(13);
		t1.me60(11);
		t1.me7(100);
		t1.me7(90);
		t1.me7(10);
		t1.me7(-10);
		t1.me7(101);
		t1.me8("ø°¿Ã", "∫Ò");
		t1.me9(5);
		t1.me9(5);
		t1.me9(5);
		
		SwitchTest si = new SwitchTest();
		si.month(13);
		si.monthFor();
		si.studentScore(101);
		si.studentScore(99);
		si.studentScore(-99);
		
	}

}
