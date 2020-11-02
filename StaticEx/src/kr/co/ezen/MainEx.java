package kr.co.ezen;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {

		Test.b=100;
		System.out.println(Test.b);
		Test t1 = new Test();
		t1.a = 100;
		System.out.println(t1.a);
		
	//	t1.b = 500;
	//	System.out.println(t1.b);
		Test.b = 500;
		System.out.println(Test.b); // °°´Ù 
		
		Test t2 = new Test();
		t2.a= 200;
		System.out.println(t2.a);
		
	//	System.out.println(Test.b);
	//	System.out.println(t2.b);   //t1.b, Test.b¶û °°´Ù
		
		Test.me1();
		Test.me11();
		System.out.println("----------");
	}

}
