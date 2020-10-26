package co.kr.ezen;

import com.naver.Cat;
import com.naver.Dog;
import com.naver.Test2;
import com.naver.Test3;

public class MianEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t2 = new Test2();
		t2.printInt(34);
		t2.printBoolean(true);
		t2.printCat(new Cat());
		
		System.out.println(":::::::::::::::::::::");
		
		Test3 t3 = new Test3();
		t3.printDa();
		t3.printDa(new Dog());
		t3.printDa(new Cat());
	}

}
