package study.my;

import com.naver.Inter1;

public class Test01 {
	public Test01() {
		new Inter1() {
			
			@Override
			public void me1() {
				System.out.println("�����ڷ� �ǽɽ�����");
			}
		}.me1();	//������ �ѹ��� ���� ȣ�⵵ �ȵǴ� �ٷλ��
	}
	
	public Inter1 ano = new Inter1() { //������ interface�� �̸��� �ڷ��� ������
		
		@Override
		public void me1() {
			System.out.println("ȣ�� ���� �͸�?");
			
		}
	};
	
	public void me2() {
		System.out.println("�Ϲ� �޼���");
	}
}

