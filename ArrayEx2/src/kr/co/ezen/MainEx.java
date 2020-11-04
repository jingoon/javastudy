package kr.co.ezen;

import com.naver.Dog;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.me2();
		//t1.me22();
		
		Dog[] dogs= t1.me01();
		
		t1.arrSysO(dogs);
		
		t1.me3();
	}

}
