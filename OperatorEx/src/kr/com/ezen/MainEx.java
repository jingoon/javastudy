package kr.com.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {
	public static void main(String[] args) {
		
		Test t1 = new Test();
	//	t1.me4();
		System.out.println("======================");
		t1.me41(0, 3);
		t1.me41(1, 3);
		t1.me41(2, 3);
		t1.me41(3, 3);
		t1.me41(4, 3);
		t1.me41(5, 3);
		t1.me41(6, 3);
		t1.me41(7, 3);
		System.out.println("=====================");

		t1.me51(0, 3);
		t1.me51(1, 3);
		t1.me51(2, 3);
		t1.me51(3, 3);
		t1.me51(4, 3);
		System.out.println("=====================");
		
		Test2 t2 = new Test2();
		t2.s1();
		System.out.println("===================");
		t2.s12();
		t2.s2();
		t2.s3();
		t2.s4();
		t2.s5();
		
		
		
	}

}
