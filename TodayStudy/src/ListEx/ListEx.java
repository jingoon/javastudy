package ListEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListEx {
	public void me1() {
		List<Apple> list = new ArrayList<Apple>();		// ���������� list����, �ڷ����� Apple�� ��ü�� ��
		list.add(new Apple());
		ArrayList<Apple> list2 = new ArrayList<Apple>();	// ArrayList�� List�� ����Ѵ�. �׷��� �θ�ü�� List�� ��ü�����Ұ�
		
		list.add(new Apple());	//�߰�
		Apple apples = list.get(0);// ù��° �ε��� ������
		System.out.println(apples);// ���
		apples = list.get(list.size()-1);	// ������ �ε��� ������
		System.out.println(apples);// ���
				
		for (int i = 0; i < list.size(); i++) {
			apples = list.get(i);// ������
			System.out.println(apples);
		}
		list.remove(0);// Ư���ε��� ����
		
		for (int i =list.size()-1;i>=0;i--) {
			list.remove(i);//�ϳ��� ��� ���� �ڿ�������*
		}
		
		list.clear();// �ѹ��� ��� ����
		
	}
	
	public void me2() {
		List<Integer> list = new ArrayList<Integer>();	//������ ���� �� �÷��������ӿ�ũ List ����
		list.add(3);	// ������ list.add(new Integer(3)); = �⺻�ڷ����� �����ڷ���(WrapperŬ����) ���� �ۼ��ؾ�������
		list.add(4);	// AutoBoxing���� �����ϰ� �ۼ�
		list.add(5);
		list.add(6);
		
		int a= list.get(0);	// ù��° �ε��� ����, AutoUnBoxing���� Integer a =list.get(0);�� �����ϰ� �ۼ�
		list.get(list.size()-1);	//������ �ε��� ����
	}

	public void me3() {
		List<Double> list = new ArrayList<Double>();
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		
	}
	public void me4() {
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		
	}
	public void me5() {
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}));
	}
	public void me6() {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(new HashMap<String, Object>());
		
		for(int i=0; i>list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.get(0);
		list.remove(0);
		list.clear();
		
	}
	public List<MemberDTO> me7() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("m001", "kim", 5));
		list.add(new MemberDTO("m002", "lee", 12));
		list.add(new MemberDTO("m003", "park", 55));
		list.add(new MemberDTO("m004", "choi", 53));
		return list;
	}
	public void me8() {
		List<Apple> list = new ArrayList<Apple>();
		
		list.add(new Apple("a001", "����", "���", 1500));
		list.add(new Apple("a002", "����", "���", 1000));
		list.add(new Apple("a003", "�뱸", "���", 2000));
		list.add(new Apple("a004", "�λ�", "���", 3000));
		list.add(new Apple("a005", "������", "���", 5000));
		for (int i = 0; i <list.size(); i++) {
			if (i == 0) {
				continue;
			}
				//list�� �ִ� ����� ����:�̸� �� ��� ���
				System.out.println(list.get(i));
				//�� idx�� 0�� ��� �������
				
			
		}
		// ����Ʈ�� �ִ� ��ü�� ���̵� a003�� 004�� �����͸� ����
		//��λ���
		list.remove(new Apple("a004",null,null,0));
		list.remove(new Apple("a003",null,null,0));
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		
	}
	
}
