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
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		String msg=sdf.format(c.getTime());
		String msg2=sdf.format(c.getTimeInMillis());
		
		System.out.println(msg);
		System.out.println(msg2);
		
		
	}

	public void me8() {
		//자바에서는 Calendar클래스를 쓰자.
		//그러나 DB에서는 Calendar클래스보다는 Date 클래스를 많이 사용한다
		//따라서 반드시 두 타입을 변환할 수 있어야 한다.
		
		Calendar c = Calendar.getInstance();
	//me	System.out.println(c); 				
		Date d = new Date(c.getTimeInMillis()); // 1970년 1월 1일 0시 0분 0.000초 부터 0으로 시작(미국시간)
	//me	System.out.println(d);
		c.setTime(d);
		System.out.println(c);//질문) 캘린더에 데이터타입 d를 넣어서 set하면 c의 값이 어떻게 바뀌는건가?
		
	//me	Date d3 =c.getTime();
	//me	System.out.println(d3);
		Date d2 = new Date();
		System.out.println(d2);
		
		System.out.println(System.currentTimeMillis()); // 1/1000초 의 long값
		
	}
	
	public void me7() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());	//현재날짜 Date반환
		
		c.roll(Calendar.DATE, 20);			//20일 후 날자가 어떻게 바뀌나?(날자정보만 변경됨)
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//요일
		
		
		
	}
	public void me61() {
		
		Calendar c = Calendar.getInstance();
		//20일 후의 날짜정보 방법1
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE, 20);
		//20일 후의 날자정보 방법2
		Calendar c2 = (Calendar) c.clone();
		c2.add(Calendar.DATE, 20);
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
	public void me6() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		//2020.11.12
		//20일 후
		c.add(Calendar.DATE, 20);	
		// add()는 calendar객체의 정보를 변경, 특정 필드의 값에 주어진 값을 더해서 변경(중요)
		// 변경인스턴스 , +일월년
		System.out.println(c.getTime());  // java.util
		
		
	}
	
	public void me5() { // 중요하지 않음 공부안해도됨 
		Scanner sc = new Scanner(System.in);
		
		try {
			/*
			System.out.println("연도를 입력하세요.");
			int year = sc.nextInt();
			sc.nextLine();
			
			System.out.println("월을 입력하세요");
			int month = sc.nextInt();
			sc.nextLine();
			*/
			int year=2020;
			int month=10;
			
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(year+"년 "+month+"월");
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
		// 1950년 2월의 마지막 날은 며칠까지 있나? 그날은 무슨요일?
		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR,1950);
		c.set(Calendar.MONTH, 1);
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);		//데이오브먼스는 데이트와 같다
		c.set(1950, 1, maxDate);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));				//요일 정보 1234567 = 일월화수목금토
		System.out.println();
		
		
	}
	
	public void m4() {
		Calendar c = Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);	// 해당월 마지막일 (30.31)을 반환
		System.out.println(maxDate);
		System.out.println();
	}
	
	public void me32() {
		//1. 1950년 6월 25일은 무슨요일인가?
		
		Calendar c = Calendar.getInstance();
		c.set(1950, 6-1, 25);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	
		
	}
	
	public void me31() {
		Calendar c	= Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.MAY); // 5-1로 대신할 수 있음
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
		
		//c를 이용해 연도 정보 추출
		int year = c.get(Calendar.YEAR); //상수, 클래스명.~~
		//월정보
		int month = c.get(Calendar.MONTH)+1;
		//일정보
		int date = c.get(Calendar.DATE);
		//요일 정보
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
	}
	
	public void me1() {
		//1. Calendar  클래스 객체 생성 방법
		Calendar c = Calendar.getInstance(); // 현재시각(추상객체는 객체 생성불가,캘릭더 클래스의 겟인스턴스)
	}

}
