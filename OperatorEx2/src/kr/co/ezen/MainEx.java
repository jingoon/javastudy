package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;

public class MainEx {
	public static void main(String[] args) {
		
		
		
		Test t1 = new Test();
		boolean result= t1.me1(3, 4);
		System.out.println(result);
		
		boolean result1 = t1.m2(300L, 400L);
		System.out.println(result1);
		
		String result2 = t1.me3(3.0f, 4.0f);
		System.out.println(result2);
		
		char result3 = t1.me31(4949, 4932);
		System.out.println(result3);
		
		byte a=-4,b=-4;
		boolean result4 = t1.me4(a, b);
		//or
		t1.me4((byte)3,(byte) -5); // 괄호속에 자료형 입력
		System.out.println(result4);
		
		t1.me5((short) -32768,(short) 32767);
		t1.me51(result, result1);
		t1.me6(false, true);
		
		System.out.println("===========================================");
		
		Test2 t2 = new Test2();
		t2.k1(true, true);
		t2.k1(true, false);
		t2.k1(false, true);
		t2.k1(false, false);
		System.out.println("===========================================");
		t2.k2(true, true);
		t2.k2(true, false);
		t2.k2(false, true);
		t2.k2(false, false);
		System.out.println("=============================================");
		t2.k3(true);
		t2.k3(false);
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		
		t2.switchBoolean();
		t2.switchBoolean();
		System.out.println("=============================================");

		t2.kTest(2, 15); // i/4+15
		System.out.println("==================================");
		
		Test3 t3 = new Test3();
				
		t3.plus111();
		t3.plus111();
		t3.plus111();
		System.out.println(t3.getA());
		
		System.out.println("========");
		t3.plus211();
		t3.plus211();
		t3.plus211();
		System.out.println(t3.getC());
	//	System.out.println("===231=======");
	//	t3.plus2222();
	//	t3.plus1111();
	//	t3.plus3333();
	//	System.out.println("===132===");
	//	t3.plus1111();
	//	t3.plus3333();
	//	t3.plus2222();
	//	System.out.println("===123===");
	//	t3.plus1111();
	//	t3.plus2222();
	//	t3.plus3333();
	//	System.out.println("===312===");
	//	t3.plus3333();
	//	t3.plus1111();
	//	t3.plus2222();
		System.out.println("===213===");
		t3.plus2222();
		t3.plus1111();
		t3.plus3333();
		
		System.out.println("============================================");
		Test5 t5 = new Test5();
		t5.h1();
		t5.h2();
		t5.h3();
		t5.h4();
		t5.h5(0);
		t5.h5(1);
		t5.h5(2);
		t5.h6(0);
		t5.h6(1);
		t5.h6(2);
		
		System.out.println("0000000000000");
		
		t3.p1();
		t3.p1();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
