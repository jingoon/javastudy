package kr.co.ezen;

import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test3.StaticInnerClass;

import study.my.Test01;

import com.naver.Test5;

public class MainEx {

	public static void main(String[] args) {
		
		Test2.MemberClass mc1 = new Test2().new MemberClass();
		mc1.mc1();
		
		Test3.StaticInnerClass sic1 = new Test3.StaticInnerClass();  
		// new는 StaticInnerClass()의 새로운 객체(클래스는 객체가 필요함static이지만)
		// Static 상수는 클래스명.상수명 으로 객체없이 접근함
		sic1.sic();
		
		Test5 t1 = new Test5();
		t1.ano.me1();
		
		Test01 t01 = new Test01();
		t01.me2();
		t01.ano.me1();
		t01.me2();

	}

}
