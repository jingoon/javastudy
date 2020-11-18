package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {

	public static void main(String[] args) {

		Test t1 = new Test();
//		t1.me1();
//		long a =System.currentTimeMillis();
//		t1.me2();
//		long b =System.currentTimeMillis();
//		System.out.println(b-a);
//		t1.me3();
//		 a =System.currentTimeMillis();
//		t1.me4();
//		 b =System.currentTimeMillis();
//		 System.out.println(b-a);
//		t1.me5();
		Test2 t2 = new Test2();
		double a =System.currentTimeMillis();
		t2.me1();
		double b =System.currentTimeMillis();
		System.out.println((b-a)/1000+"段");
		t2.me2();
		a =System.currentTimeMillis();
		System.out.println((a-b)/1000+"段");
		t2.me3();
		b =System.currentTimeMillis();
		System.out.println((b-a)/1000+"段");
		t2.me4();
		a =System.currentTimeMillis();
		System.out.println((a-b)/1000+"段");
		t2.me5();
		b =System.currentTimeMillis();
		System.out.println((b-a)/1000+"段");
		
	
	}

}
