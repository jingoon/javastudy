package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Update implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է��ϼ���");
		String mid=sc.nextLine();
		System.out.println("���ο� name�� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("���ο� job�� �Է��ϼ���");
		String job = sc.nextLine();
		
		System.out.println("����⵵�� �Է��ϼ���");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("������� �Է��ϼ���");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("������� �Է��ϼ���");
		int date = sc.nextInt();
		sc.nextLine();
		
		
			
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis());
		
		MemberDAO dao = new MemberDAO();
//		if (year<0 && year>cal.getTime().getYear()) {
//			birth=null;
//		}
//		if(month )
	
			System.out.println(cal.getTime().getYear());
		dao.update(mid, name, job, birth);
		
	}

	@Override
	public String toString() {
		return "4.Update";
	}

	
}
