package com.naver;

public class Test {
	
	public void me4() {
		StringBuffer sb = new StringBuffer();
		//StringŬ������ �Һ��� ������ �����ִ�.
		
		String msg = "hello";
		msg = "good";		
		/* 
		* hello�� ������ �ʰ� ���� good�� �����.
		*  �������÷��Ͱ� ���������� �ٷ� �������� �ʴ´�.
		*  ���ڿ��� ����ؼ� �����Ǵ� ���
		* msg ="";
		* msg +="�ȳ��ϼ���";
		* msg +="���� ȫ�浿�Դϴ�";
		* msg +="���� ��� ����־��";
		* msg +=... ����.
		 �������ϰ� �߻��Ѵ�
		 �̷��� StringBuffer�� ���
		*/
		sb.append("�ȳ��ϼ���");
		sb.append("���� ȫ�浿�Դϴ�");
		sb.append("���� ��� ����־��");
		msg = sb.toString(); // sb�� String������ ������ �ش�.
	}
	
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		
		System.out.println(msg1==msg2); //false
		System.out.println(msg1==msg3); //false
		System.out.println(msg3==msg4); //true
		System.out.println(">>>");
		System.out.println(msg1.equals(msg2)); //true
		System.out.println(msg1.equals(msg3)); //true
		
	}
	public void me2() {
		//�Ͻ��� ��ü ������(���ͷ�)
		String msg2	="hello";
	}
	
	public void me1() {
		//����� ��ü ������
		String msg = new String("hello");
	}
	
	public void me0() {
		String s1 = "������";
		String s2 = "������";
		String s3 = "���ٳ�";
		
		boolean s1EqS2= s1.equals(s2);
		boolean s1EqS3= s1.equals(s3);
		
		StringBuffer sb = new StringBuffer();
		sb.append(false);
		sb.append('c');
		sb.append("������ ");
		sb.append("   *    ");
		
		String sb2 = sb.toString();
		System.out.println(sb2);
		
		
		System.out.println(s1EqS2);
		System.out.println(s1EqS3);
	
		System.out.println(sb);
	}
	
	public void me01() {
		StringBuffer sb = new StringBuffer();
		sb.append("�»��� ");
		sb.append("�����ϵ� ");
		sb.append("�ϴþƷ� ");
		sb.append("���̰Ŵ� ");
		sb.append("������ �� ������ ");
		sb.append("�� ������ ");
		sb.append("���Ǹ��� ");
		sb.append("����� �� �ƴ� ������ ");
		sb.append("���� ���� �ϴ��� ");
		
		System.out.println(sb);
		String s1 = sb.toString();
		System.out.println(s1);
	}
	
	public void me02() {
		
		String a = "a";
		String b = "a";
		String c = new String("a");
		String d = new String("a");
		System.out.println(">>>>>>>");
		me03(a, b);
		me03(a, c);
		me03(a, d);
		me03(b, c);
		me03(b, d);
		me03(c, d);
		
		
		
	}
	public void me03(String a, String b) {
		boolean k = a.equals(b);
		boolean k2= false;
		if(a==b) {
				k2= true;	
		}
		
			StringBuffer sb = new StringBuffer();
			sb.append("== ������:\t");
			sb.append(a);
			sb.append("�� ");
			sb.append(b);
			sb.append("�� ");
			sb.append(k2);
			
			StringBuffer sb2 = new StringBuffer();
			sb2.append("eqauls ������:\t");
			sb2.append(a);
			sb2.append("�� ");
			sb2.append(b);
			sb2.append("�� ");
			sb2.append(k);
			String sb3 = sb2.toString();
					
			
			System.out.println(sb);
			System.out.println(sb3);
			System.out.println();
		
		
	}
		// ���� ���� 5 ~9 ���� 0~9 0~9 ��ȯ�Ǹ鼭 �迭�� ��
		// int�� 3���� arr3�� 3X1X4ũ��
	public void me03() {
		int[][][] arr3= {
				{
					{5,6,7,8}
				},
				{
					{9,0,1,2}
				},
				{
					{3,4,5,6}
				}
		};	
		
		int[][] arr20 = {
				{5,6,7,8}
				};
		int[] arr10 = {5,6,7,8};
	}
	
	public void arrayAdd1(int[] num) {
		for(int i=0; i<num.length;i++) {
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
