package com.naver;

import kr.co.ezen.Test12;
import com.naver.MethodTest2;

public class MethodTest3 {
	public MethodTest3() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog getDog() {
		System.out.println(" dog 객체를 반환합니다.");
		return new Dog();
	}

	public Test12 getTest12() {
		return new Test12();
	}
	
	public int getTest13() {
		return 99;
	}
	// 기본 자료형 반환 8
	public boolean getBlooean() {
		return true;
	}
	
	public char getChar() {
		return 'a';
	}
	
	public byte getByte() {
		return 127;
	}
	public short getShort() {
		return 32760;
	}
	public int getInt() {
		return 1900000;
	}
	
	public long getLong() {
		return 2300000000L;
	}
	public float getFloat() {
		return 3.241f;
	}
	public double getDouble() {
		return 3.141592;
	}
	public MethodTest2 getGiveMeTheMoney() {
		return new MethodTest2();
	}
	
	
	
	
	
	
	
	
	
}
