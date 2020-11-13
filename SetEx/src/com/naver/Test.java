package com.naver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1); // true
		set.add(2); // true
		set.add(3); // true
		set.add(4); // true
		set.add(5); // true
		set.add(1); // false반환 . 데이터add안됨
	}

	public void me2() {
		Set<String> set = new HashSet<String>();

		set.add("hello"); // true
		set.add(new String("hello")); // false
		set.add("hello"); // false
		set.add("Hello"); // true
		set.add(new String("Hello")); // false
		set.add("HELLO"); // true
		set.add(new String("HELLO")); // false .대소문자는 같지 않다

	}

	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		Apple apple = new Apple("k1", "의정부", "햇사과", 3000);

		set.add(new Apple("a001", "대구", "사과1", 1500));
		set.add(new Apple("a002", "대전", "사과2", 2000));
		set.add(new Apple("a003", "서울", "사과3", 3000));
		set.add(new Apple("a002", "부산", "사과4", 500)); // false. id가 같음(hash&equals 오버라이딩 id체크)
		set.add(new Apple("a005", "청송", "사과5", 1000));
		set.add(apple);
		

	}

	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();

		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
		set.add(new MemberDTO("m002", "kang", 43)); // false id동등성비교
		set.add(new MemberDTO("m005", "choi", 2)); // false

	}

}
