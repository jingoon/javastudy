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
		// new�� StaticInnerClass()�� ���ο� ��ü(Ŭ������ ��ü�� �ʿ���static������)
		// Static ����� Ŭ������.����� ���� ��ü���� ������
		sic1.sic();
		
		Test5 t1 = new Test5();
		t1.ano.me1();
		
		Test01 t01 = new Test01();
		t01.me2();
		t01.ano.me1();
		t01.me2();

	}

}