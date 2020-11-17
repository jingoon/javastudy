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
		 * 1.Map, HashMap 2.map ��ü�� ���弼��. ��, key: String, Value: Integer
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		// map�� ������ �Է� put
		map.put("�߷°��ӵ�", 9);
		map.put("�츮�� ��й�ȣ", 12345);
		map.put("����� �λ갣�� �Ÿ�", 300);

		System.out.println(map);

		int g = map.get("�߷°��ӵ�");
		System.out.println(g);
		int password = map.get("�츮�� ��й�ȣ");
		System.out.println(password);
		int leng = map.get("����� �λ갣�� �Ÿ�");
		System.out.println(leng);

		map.replace("����� �λ갣�� �Ÿ�", 280);
		System.out.println(map);
		//keySet()��� key�� value�� ���
		Set<String> set = map.keySet();
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int val = map.get(key);
			System.out.println(key + ":" + val);
		}
		//values()��� value�� ���
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
		map.put(1, "kang"); // ���� value���� ����

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
		// �ǹ���
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
		list2.add("����");

		map.put("������", list1);
		map.put("�����", list2);

		List<String> hc = map.get("������");
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
		list1.add(new Dog("d001", "������", "������", 3));
		list1.add(new Dog("d002", "�鱸", "������2", 4));

		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "������1", 3));
		list2.add(new Dog("d004", "Ÿũ", "������2", 2));

		map.put("������", list1);
		map.put("���۵�", list2);

		List<Dog> jindo = map.get("������");
		System.out.println(jindo);
		for (int i = 0; i < jindo.size(); i++) {
			Dog dog = jindo.get(i);
			String id = dog.getId();
			System.out.println(id);
		}
		System.out.println(map.get("���۵�"));
		System.out.println(map);

	}

	public void me5(String fileName) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");

		// ���ϸ�.Ȯ���ڸ� �Է����� �� Ȯ���ڸ� ���� map�� value���� ����϶�(��ҹ��� ��������)
		int index = fileName.lastIndexOf(".");
		String key = fileName.substring(index + 1); // .���� ���ں��� ��ȯ
		String msg = map.get(key.toLowerCase());// �ҹ��ڷ� ��ȯ
		if (msg == null) { // map�� ���� key�� �Է��ϸ� value�� null�� ��ȯ��
			System.out.println("�ý�������");
		} else {
			System.out.println(msg);
		}
		// �񱳰� �ƴ϶�.. �׳� �����ع���. �׸��� ������ ��� ������ null
		map.replace("txt", "�ؽ�Ʈ����");
		System.out.println(map);
	}

}
