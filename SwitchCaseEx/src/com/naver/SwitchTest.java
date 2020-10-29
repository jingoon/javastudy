package com.naver;

public class SwitchTest {
	
	public SwitchTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void month(int month) {
		if(month<=12 && month>0) {
			switch (month) {
			case 2:
				System.out.println(month+"월은 28일");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"월은 30일");
				break;
			default:
				System.out.println(month+"월은 31일");
				break;
			}
		}else {
			System.out.println("1년은 1~12월까지 있음");
		}
	}
	
	public void monthFor() {
		for(int i=1;i<13;i++) {
			month(i);
		}
		
	}
	
	public void studentScore(int score){
		char result = '수';
		if(score<=100 &&score>=0) {
			switch (score/10) {
			case 10:
			case 9:
				result = '수';
				break;
			case 8:
				result ='우';
				break;
			case 7:
				result = '미';
				break;
			case 6:
				result = '양';
				break;
			case 5:
				result = '가';
				break;
			}
			System.out.println(result);
		}else {
			System.out.println("성적은 0~100점까지로 ");
		}
	}

	
	
	
	
	
	
}
