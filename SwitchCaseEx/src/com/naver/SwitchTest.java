package com.naver;

public class SwitchTest {
	
	public SwitchTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void month(int month) {
		if(month<=12 && month>0) {
			switch (month) {
			case 2:
				System.out.println(month+"���� 28��");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"���� 30��");
				break;
			default:
				System.out.println(month+"���� 31��");
				break;
			}
		}else {
			System.out.println("1���� 1~12������ ����");
		}
	}
	
	public void monthFor() {
		for(int i=1;i<13;i++) {
			month(i);
		}
		
	}
	
	public void studentScore(int score){
		char result = '��';
		if(score<=100 &&score>=0) {
			switch (score/10) {
			case 10:
			case 9:
				result = '��';
				break;
			case 8:
				result ='��';
				break;
			case 7:
				result = '��';
				break;
			case 6:
				result = '��';
				break;
			case 5:
				result = '��';
				break;
			}
			System.out.println(result);
		}else {
			System.out.println("������ 0~100�������� ");
		}
	}

	
	
	
	
	
	
}
