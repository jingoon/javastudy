package study.main;

import study.my.Test1;
import study.my.Test2;
import study.my.Test3;
import study.my.Test4;
import study.my.Test5;
import study.my.Test6;

public class MainEx {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.t1();
		
		Test2 t2 = new Test2();
		t2.me1();
		
		Test2.MemberClass tm1 = new Test2().new MemberClass();
		tm1.mc1();
		
		Test3.StaticInnerClass ts1 = new Test3.StaticInnerClass();
		ts1.sic();
		
		Test3 t3 = new Test3();
		t3.me1();
		
		Test4 t4 = new Test4();
		t4.me1();
		t4.me2();
		
		Test5 t5 = new Test5();
		t5.ano.inter();
					
		Test6 t6 = new Test6();
		t6.me2();
		
		
		
	}

}
