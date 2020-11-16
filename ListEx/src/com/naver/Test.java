package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public void me1() {
		List<Apple> list = new ArrayList<Apple>(); // �ڷ����� Apple�� ��ü�� ��
		list.add(new Apple());

		Apple iphone12 = list.get(0); // ���ڿ��� ���������

		// list�� ����ִ� ��� ��Ұ��� ���

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public void me2() {
		// list��ü�� ������ּ���. ��, ���׸� Ÿ���� 3,4,5,6�� �Է��� �� �ְ�
		List<Integer> list = new ArrayList<Integer>();
		//������ ���� �� �÷��������ӿ�ũ List ����
		list.add(new Integer(3));
		list.add(new Integer(4));
		// ������ list.add(new Integer(4)); = �⺻�ڷ����� �����ڷ���(WrapperŬ����) ���� �ۼ��ؾ�������
		list.add(5); // AutoBoxing���� �����ϰ� �ۼ�
		list.add(6);

		//AutoUnBoxing���� Integer a =list.get(0);�� �����ϰ� �ۼ�
		int a= list.get(0);	// ù��° �ε��� ����
		list.get(list.size()-1);	//������ �ε��� ����

		for (int i = 0; i < list.size(); i++) { // ��� ��� ���
			int num2 = list.get(i);
			System.out.println(num2);
		}

		list.set(1, 100); // Ư���ε��� �� ����
		System.out.println(list);

		// list.remove(new Integer(100)); // ���� ���� ��ü�� ������
		// list.remove(1); //������ ���ڸ��� �ڿ� �ε����� ä���.
		// list.remove(2);
		list.remove(2); // ū �ε���~ ���� �ε��� ������ �����ؾ� �ǵ��Ƿ� ������
		list.remove(1);
		System.out.println(list); // list�� sysout�ϸ� �̻ڰ� ��µ�

	}

	public void me3() {
		// list ��ü�� ���弼��. ��, 3.5, 4.1, 9.8�� �Է�
		List<Double> list = new ArrayList<Double>();
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);

		double num = list.get(1);

		for (int i = 0; i < list.size(); i++) {
			num = list.get(i);
			System.out.println(num);
		}

		list.set(list.size() - 1, 1.1); // ������ ��Ұ��� ����

		// list�� �ִ� ���̷��z �ݺ����� �̿��ؼ� ���� ����
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}

	}

	public void me4() {
		// list ��ü�� ���弼�� ��, new StringBuffer()�� ���� �� ����.
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());

		// list�� ����ִ� ��� �����͸� ����ϼ��� -> ��絥���� == �ݺ����� ���
		for (int i = 0; i < list.size(); i++) { // length, size
			StringBuffer sb = list.get(i);
			System.out.println(sb);
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			list.get(i);
		}

	}

	public void me5() {
		// list ��ü ���弼��. ��, thread�� ���� �� ����
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread());
		list.add(new Thread(new Runnable() { // �͸��� ����Ŭ����

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		}));

		for (int i = 0; i < list.size(); i++) {
			Thread t = list.get(i);
			System.out.println(t);
		}

	}

	public void me6() {
		// list ��ü�� ����ÿ�. ��, Map<String, Object>�� ���� �� ����
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		list.add(new HashMap<String, Object>());

		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> mso = list.get(i);
			System.out.println(mso);
		}

		list.clear(); // ��� ����, ���ڴ� ��������

	}
	public List<MemberDTO> me7() {
		//main()���� me7ȣ�� ,��ȯ�Ǵ� �������� �ι�° ��ü�� �̸� ���
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m001","kim",5));
		list.add(new MemberDTO("m002","lee",12));
		list.add(new MemberDTO("m003","park",53));
		list.add(new MemberDTO("m004","kang",55));
		list.add(new MemberDTO("m005","choi",11));
		
		list.set(0, new MemberDTO("m001","han",7));
		list.remove(new MemberDTO(null, null, 55));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}
	public void me8() {
		List<Apple> list = new ArrayList<Apple>();
		
		list.add(new Apple("a001","�뱸","���1",1500));
		list.add(new Apple("a002","����","���2",2000));
		list.add(new Apple("a005","û��","���5",1000));
		list.add(new Apple("a003","����","���3",3000));
		list.add(new Apple("a004","�λ�","���4",2500));
		System.out.println(">>>>>>>>>>>>>>>>>");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(">>>>>>>>>>>>>>>>>");
		
		//list�� �ִ� ����� ����:�̸� �� ��� ���
		for (int j = 0; j < list.size(); j++) {
			Apple ap =list.get(j);
			System.out.println(ap);
		}
		//�� idx�� 0�� ��� �������
		System.out.println();
		for (int j = 0; j < list.size(); j++) {
			Apple ap =list.get(j);
			if(j == 0){
				continue;
			}
			System.out.println(ap);
		}
		// ����Ʈ�� �ִ� ��ü�� ���̵� a003�� 004�� �����͸� ����
		
		list.remove(new Apple("a003", null, null, 0));
		list.remove(new Apple("a004", null, null, 0));
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
	
		
	}

}
