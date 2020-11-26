package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Update implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 id를 입력하세요");
		String mid=sc.nextLine();
		System.out.println("새로운 name을 입력하세요");
		String name = sc.nextLine();
		System.out.println("새로운 job을 입력하세요");
		String job = sc.nextLine();
		
		System.out.println("출생년도를 입력하세요");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("출생월을 입력하세요");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("출생일을 입력하세요");
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
