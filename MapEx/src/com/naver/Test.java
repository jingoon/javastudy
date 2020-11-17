package com.naver;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public void me1() {
		/*
		 * 1.Map, HashMap 2.map 객체를 만드세요. 단, key: String, Value: Integer
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		// map에 데이터 입력 put
		map.put("중력가속도", 9);
		map.put("우리집 비밀번호", 12345);
		map.put("서울과 부산간의 거리", 300);

		System.out.println(map);

		int g = map.get("중력가속도");
		System.out.println(g);
		int password = map.get("우리집 비밀번호");
		System.out.println(password);
		int leng = map.get("서울과 부산간의 거리");
		System.out.println(leng);

		map.replace("서울과 부산간의 거리", 280);
		System.out.println(map);
		//keySet()사용 key와 value를 출력
		Set<String> set = map.keySet();
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int val = map.get(key);
			System.out.println(key + ":" + val);
		}
		//values()사용 value를 출력
		Collection<Integer> val = map.values();
		Iterator<Integer> itVal = val.iterator();
		while (itVal.hasNext()) {
			Integer integer =  itVal.next();
			System.out.println(integer);
		}
	}

	public void me2() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang"); // 기존 value값을 변경

		System.out.println(map.get(1));
		System.out.println(map.get(0));
		System.out.println(map.get(2));

		System.out.println(map);

		map.replace(1, "kim");
		System.out.println(map);

		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int key = it.next();
			String val = map.get(key);
			System.out.println(key + ":" + val);
		}
	}

	public void me3() {
		// 실무용
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exe1");
		list1.add("genesis");
		list1.add("grandure");

		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("지프");

		map.put("현대차", list1);
		map.put("기아차", list2);

		List<String> hc = map.get("현대차");
		System.out.println(hc);
		for (int i = 0; i < hc.size(); i++) {
			System.out.println(hc.get(i));
		}
		System.out.println(map);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key= it.next();
			List<String> val = map.get(key);
			System.out.println(key +":"+val);
		}
		
		Collection<List<String>> val=map.values();
		Iterator<List<String>> listVal = val.iterator();
		while (listVal.hasNext()) {
			List<String> list = listVal.next();
			System.out.println(list);
		}

	}

	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();

		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "누렁이", "진도인", 3));
		list1.add(new Dog("d002", "백구", "진도인2", 4));

		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "독일인1", 3));
		list2.add(new Dog("d004", "타크", "독일인2", 2));

		map.put("진돗개", list1);
		map.put("세퍼드", list2);

		List<Dog> jindo = map.get("진돗개");
		System.out.println(jindo);
		for (int i = 0; i < jindo.size(); i++) {
			Dog dog = jindo.get(i);
			String id = dog.getId();
			System.out.println(id);
		}
		System.out.println(map.get("세퍼드"));
		System.out.println(map);

	}

	public void me5(String fileName) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");

		// 파일명.확장자를 입력했을 때 확장자를 비교해 map의 value값을 출력하라(대소문자 구별없이)
		int index = fileName.lastIndexOf(".");
		String key = fileName.substring(index + 1); // .다음 문자부터 반환
		String msg = map.get(key.toLowerCase());// 소문자로 변환
		if (msg == null) { // map에 없는 key를 입력하면 value로 null을 반환함
			System.out.println("시스템파일");
		} else {
			System.out.println(msg);
		}
		// 비교가 아니라.. 그냥 대입해버림. 그리고 있으면 출력 없으면 null
		map.replace("txt", "텍스트파일");
		System.out.println(map);
	}

}
