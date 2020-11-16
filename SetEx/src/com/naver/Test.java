package com.naver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
		
		int size=set.size();
		System.out.println(size);
		
		
		Iterator<Integer> it =set.iterator();
		List<Integer> list = new ArrayList<Integer>();
		
		while (it.hasNext()) {
			Integer integer =  it.next();
			System.out.println(integer);
			list.add(integer);
		}
		
		// while문 밖에서 data 3만을 출력하려 할 때
		int idx= list.indexOf(3);
		int num = list.get(idx);
		System.out.println(num);
		
		set.remove(4);
		System.out.println(set);
		set.clear();
		
	}

	public void me2() {
		Set<String> set = new HashSet<String>();

		set.add("hello"); // true
//		set.add(new String("hello")); // false
//		set.add("hello"); // false
		set.add("Hello"); // true
//		set.add(new String("Hello")); // false
		set.add("HELLO"); // true
//		set.add(new String("HELLO")); // false .대소문자는 같지 않다
		
		int size=set.size();
		System.out.println(size);
		
		Iterator<String>it=set.iterator();
		while (it.hasNext()) {
			String string =  it.next();
			System.out.println(string);
		}
		//while밖에서 사용
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		int index=list.indexOf("HELLO");
		String msg =list.get(index);
		System.out.println(msg);
		
		//set.remove("HELLO");
		set.remove(new String("HELLO"));
		System.out.println(set);
		set.clear();
	}

	public void me3() {
		Set<Apple> set = new HashSet<Apple>();

		set.add(new Apple("a001", "대구", "사과1", 1500));
		set.add(new Apple("a002", "대전", "사과2", 2000));
		set.add(new Apple("a003", "서울", "사과3", 3000));
//		set.add(new Apple("a002", "부산", "사과4", 500)); // false. id가 같음(hash&equals 오버라이딩 id체크)
		set.add(new Apple("a005", "청송", "사과5", 1000));
		
		int size=set.size();
		System.out.println(size);
		
		Iterator<Apple> it = set.iterator();
		List<Apple> list = new ArrayList<Apple>();
		while (it.hasNext()) {
			Apple apple = (Apple) it.next();
			System.out.println(apple);
			list.add(apple);
		}
		
		int index=list.indexOf(new Apple("a003", null, null, 0));
		Apple apple=list.get(index);
		System.out.println(apple);
		
		set.remove(new Apple("a002", null, null, 0));
		System.out.println(set);
		set.clear();
		
		
	}

	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();

		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
		set.add(new MemberDTO("m002", "kang", 43)); // false id동등성비교
		set.add(new MemberDTO("m005", "choi", 2)); // false

		int size=set.size();
		System.out.println(size);
		
		//배열arr에 set이 갖고 있는 데이터를 저장
		//그 중 id가 m005인 MemberDTO객체를 이용해서
		//그 객체의 age값을 출력
		Iterator<MemberDTO> iter= set.iterator();
		MemberDTO[]	arr = new MemberDTO[set.size()];
		int idx=0;
		while (iter.hasNext()) {
			MemberDTO memberDTO = iter.next();
			arr[idx]= memberDTO;
			idx++;
		}
		for(int i=0;i<arr.length;i++) {
			MemberDTO dto=arr[i];
			if(dto.getId().equals("m005")) {
				System.out.println(dto.getAge());
			}
		}
			
		
		ArrayList list	= new ArrayList();
		list.addAll(set);
		System.out.println(list);
		int index=list.indexOf(new MemberDTO("m005", null, 0));
		System.out.println(list.get(index));
		
//		list = new ArrayList<MemberDTO>(set);
		
		
		
		set.remove(new MemberDTO("m001", "song", 230));// id만 같으면 남어지 값들은 달라도 상관없다(타입이 같으면)
		set.clear(); 		//set객체들만 삭제됨 set은 남아 있다
		System.out.println(set);	// [] 만 출력됨
	}

}
