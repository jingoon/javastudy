package study.my;

public class Test6 {
	public Test6() {	//�̰Ÿ����δ� ȣ���� �ȵ� �ٸ� �޼��� �ʿ�
		new Inter1() {
			
			@Override
			public void inter() {
				System.out.println("�����ھȿ��� new inter1() {};");
				
			}
		}.inter();// 1ȸ�� ���
	}
	
	public void me2() {
		System.out.println("me2()�� �ƹ��͵� ȣ������ ����");
		
	}

}