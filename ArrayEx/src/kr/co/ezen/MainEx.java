package kr.co.ezen;

import com.naver.Car;
import com.naver.Dog;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {

		
		Test t1 = new Test();
		t1.me1();
	//	t1.me11();
		
	//	t1.me12(new Dog[5]);
		Dog[] arrDog = new Dog[3];
	//	t1.me12(arrDog);
		
		t1.me13();
		t1.me2();
		String[] arrStr = {"hello", "world","good","moning" };
		//or String[] arrStr = new ,String[5];
		t1.me22(arrStr);
		Dog[] dogs = new Dog[] {new Dog("도그1"),new Dog("도그2"), new Dog("도그3"), new Dog("도그4")};
		t1.me32(dogs);
	//	t1.me11();
		t1.me22(arrStr);
		
		System.out.println(">>>>>>>>>><<<<<<<<<<<");
		
		
		
		t1.me01();
		t1.me1();
		t1.me13();
		t1.me12(dogs);
		
		System.out.println("/////////////////////////");
		
		Test test1 = new Test();
		Car[] car = new Car[] {new Car("1번차"), new Car("2번차"), new Car("3번차")};
		test1.i4(car);
		test1.i5();
		test1.pibo();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
