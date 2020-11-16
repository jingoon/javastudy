package com.naver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test {
	private static int STATRT=1;
	private static int LAST=45;
	private static int SIZE=6;
	
	public void lotto() {
		Random rnd = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < SIZE) {
			int num = rnd.nextInt(LAST - STATRT +1)+STATRT;
			set.add(num);
		}
		//���������� ����
		List<Integer>list = new ArrayList<Integer>();
		Iterator<Integer> it =set.iterator();
		while (it.hasNext()) {
			Integer integer =  it.next();
			list.add(integer);
		}
		Collections.sort(list);
		System.out.println(list);
	}
	
	public void lotto2() {
		Random r = new Random(System.currentTimeMillis());
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < SIZE) {	// set.size() ���������� ����
			long n=r.nextLong();
			Random r2 = new Random(n);
			int num = r2.nextInt(LAST - STATRT +1)+STATRT;
			set.add(num);			// �߰��� �Ǹ� size()�� Ŀ����
		}
		System.out.println(set);
		// �⺻�ڷ��� �����ϱ�
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(set);
		Collections.sort(list);
		System.out.println(list);
		
	}
	// List�� ����� lotto�����
	public void lotto3() {
		Random r = new Random();
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < LAST+1; i++) {
			list.add(i);
		}
		while (list.size()> LAST-SIZE) {
			int n = r.nextInt(LAST - STATRT +1)+STATRT;
			if(n<list.size()) {
				int k=list.get(n);
				list.remove(n);
				System.out.print(k+" ");
			}else {
			}
		}
	}
}
