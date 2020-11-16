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
		set.add(1); // false��ȯ . ������add�ȵ�
		
		int size=set.size();
		System.out.println(size);
		
		
		Iterator<Integer> it =set.iterator();
		List<Integer> list = new ArrayList<Integer>();
		
		while (it.hasNext()) {
			Integer integer =  it.next();
			System.out.println(integer);
			list.add(integer);
		}
		
		// while�� �ۿ��� data 3���� ����Ϸ� �� ��
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
//		set.add(new String("HELLO")); // false .��ҹ��ڴ� ���� �ʴ�
		
		int size=set.size();
		System.out.println(size);
		
		Iterator<String>it=set.iterator();
		while (it.hasNext()) {
			String string =  it.next();
			System.out.println(string);
		}
		//while�ۿ��� ���
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

		set.add(new Apple("a001", "�뱸", "���1", 1500));
		set.add(new Apple("a002", "����", "���2", 2000));
		set.add(new Apple("a003", "����", "���3", 3000));
//		set.add(new Apple("a002", "�λ�", "���4", 500)); // false. id�� ����(hash&equals �������̵� idüũ)
		set.add(new Apple("a005", "û��", "���5", 1000));
		
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
		set.add(new MemberDTO("m002", "kang", 43)); // false id�����
		set.add(new MemberDTO("m005", "choi", 2)); // false

		int size=set.size();
		System.out.println(size);
		
		//�迭arr�� set�� ���� �ִ� �����͸� ����
		//�� �� id�� m005�� MemberDTO��ü�� �̿��ؼ�
		//�� ��ü�� age���� ���
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
		
		
		
		set.remove(new MemberDTO("m001", "song", 230));// id�� ������ ������ ������ �޶� �������(Ÿ���� ������)
		set.clear(); 		//set��ü�鸸 ������ set�� ���� �ִ�
		System.out.println(set);	// [] �� ��µ�
	}

}
