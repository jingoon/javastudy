package com.naver;

public class LocalEx {
	//�������, �����尪
	boolean a; 
	char b;		
	byte c;
	short d;
	int e;
	long f;
	float g;
	double h;
	
	public LocalEx() {	// ������
		
		//���� ����
		boolean aa = true;	// ���� �ʱ�ȭ
		boolean aaa = false; 
		aa= false; // �������� ����
		aaa= true;
		
		char bb = '��';
		bb= '��';
		
		byte cc =0; //�ʱ�ȭ
		cc = 127; 	// ���� ����
		
		short dd = 0;
		dd = 200;
		
		int ee = 323000;
		ee = 4000;
		
		long ff = 4000000000L;
		ff = 50000000000L;
		
		float gg = 5.32f;
		gg = 3.55f;
		double hh = 33.33;
		hh = 3.14;
		
		System.out.println(a);
		System.out.println(ee);
		System.out.println(aaa);
		System.out.println(aa);
		System.out.println(":::::::::::::::");
		test();
		
							
		
	}
	
	public void test() { //�޼���
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

}
