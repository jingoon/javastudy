package com.naver;

public class Test4 {
	public void me1() {
		int a =10;
		class LocalInnerClass{ // 접근제한자 쓸수 없다.
			public void lic() {		//보안에 강력하다..(클래스 메서드 안에 로컬클래스 안에 메서드)
				System.out.println(a);
			}
		}
		LocalInnerClass lic1 = new LocalInnerClass();
		lic1.lic();
	}
}
