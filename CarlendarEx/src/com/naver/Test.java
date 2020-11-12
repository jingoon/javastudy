package com.naver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	
	
	public void me9() {
		System.out.println(String.format("%4d,%3s", 33,"hel"));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� dd�� hh�� mm�� ss��");
		String msg=sdf.format(c.getTime());
		String msg2=sdf.format(c.getTimeInMillis());
		
		System.out.println(msg);
		System.out.println(msg2);
		
		
	}

	public void me8() {
		//�ڹٿ����� CalendarŬ������ ����.
		//�׷��� DB������ CalendarŬ�������ٴ� Date Ŭ������ ���� ����Ѵ�
		//���� �ݵ�� �� Ÿ���� ��ȯ�� �� �־�� �Ѵ�.
		
		Calendar c = Calendar.getInstance();
	//me	System.out.println(c); 				
		Date d = new Date(c.getTimeInMillis()); // 1970�� 1�� 1�� 0�� 0�� 0.000�� ���� 0���� ����(�̱��ð�)
	//me	System.out.println(d);
		c.setTime(d);
		System.out.println(c);//����) Ķ������ ������Ÿ�� d�� �־ set�ϸ� c�� ���� ��� �ٲ�°ǰ�?
		
	//me	Date d3 =c.getTime();
	//me	System.out.println(d3);
		Date d2 = new Date();
		System.out.println(d2);
		
		System.out.println(System.currentTimeMillis()); // 1/1000�� �� long��
		
	}
	
	public void me7() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());	//���糯¥ Date��ȯ
		
		c.roll(Calendar.DATE, 20);			//20�� �� ���ڰ� ��� �ٲ?(���������� �����)
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//����
		
		
		
	}
	public void me61() {
		
		Calendar c = Calendar.getInstance();
		//20�� ���� ��¥���� ���1
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE, 20);
		//20�� ���� �������� ���2
		Calendar c2 = (Calendar) c.clone();
		c2.add(Calendar.DATE, 20);
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
	public void me6() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		//2020.11.12
		//20�� ��
		c.add(Calendar.DATE, 20);	
		// add()�� calendar��ü�� ������ ����, Ư�� �ʵ��� ���� �־��� ���� ���ؼ� ����(�߿�)
		// �����ν��Ͻ� , +�Ͽ���
		System.out.println(c.getTime());  // java.util
		
		
	}
	
	public void me5() { // �߿����� ���� ���ξ��ص��� 
		Scanner sc = new Scanner(System.in);
		
		try {
			/*
			System.out.println("������ �Է��ϼ���.");
			int year = sc.nextInt();
			sc.nextLine();
			
			System.out.println("���� �Է��ϼ���");
			int month = sc.nextInt();
			sc.nextLine();
			*/
			int year=2020;
			int month=10;
			
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(year+"�� "+month+"��");
			System.out.println(String.format("%3s%3s%3s%3s%3s%3s%3s", "SU","MO","TU","WE","TH","FR","SA"));
			for(int i=1; i<firstDateDay;i++) {
				System.out.print("   ");
			}
			for(int i =1; i<lastDate+1;i++) {
				
				System.out.print(String.format(" %2d", i));
				if((i+firstDateDay-1) %Calendar.SATURDAY ==0) {
					System.out.println();
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
	
	
	public void me41() {
		// 1950�� 2���� ������ ���� ��ĥ���� �ֳ�? �׳��� ��������?
		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR,1950);
		c.set(Calendar.MONTH, 1);
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);		//���̿���ս��� ����Ʈ�� ����
		c.set(1950, 1, maxDate);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));				//���� ���� 1234567 = �Ͽ�ȭ�������
		System.out.println();
		
		
	}
	
	public void m4() {
		Calendar c = Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);	// �ش�� �������� (30.31)�� ��ȯ
		System.out.println(maxDate);
		System.out.println();
	}
	
	public void me32() {
		//1. 1950�� 6�� 25���� ���������ΰ�?
		
		Calendar c = Calendar.getInstance();
		c.set(1950, 6-1, 25);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	
		
	}
	
	public void me31() {
		Calendar c	= Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.MAY); // 5-1�� ����� �� ����
		System.out.println(c);
	}
	
	
	public void me3() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(1950, 6-1, 25);
		System.out.println(c1);
		System.out.println(c2);
	}
	
	public void me2() {
		
		Calendar c = Calendar.getInstance();
		
		//c�� �̿��� ���� ���� ����
		int year = c.get(Calendar.YEAR); //���, Ŭ������.~~
		//������
		int month = c.get(Calendar.MONTH)+1;
		//������
		int date = c.get(Calendar.DATE);
		//���� ����
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
	}
	
	public void me1() {
		//1. Calendar  Ŭ���� ��ü ���� ���
		Calendar c = Calendar.getInstance(); // ����ð�(�߻�ü�� ��ü �����Ұ�,Ķ���� Ŭ������ ���ν��Ͻ�)
	}

}
