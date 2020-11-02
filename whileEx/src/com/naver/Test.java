package com.naver;

public class Test {

	public void me1() {
		int i=0;
		while(i<101) {
			System.out.println(i);
			i++;
		}
	}
	
	public void me11(){
		int i=100;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
	}
	public void me2() {
		int i = 0;
		while(i<47) {
			System.out.println(i);
			
			i +=2;
			
		}
	}
	public void m21() {
		int i=99;
		while(i>=21) {
			System.out.println(i);
			i-=2;
			
		}
	}
	public void dan(int dan) {
		int i=1;
		while(i<10) {
			StringBuffer sd = new StringBuffer();
			sd.append(dan);						
			sd.append("x");
			sd.append(i);
			sd.append("=");
			sd.append(dan*i);
			String msg = sd.toString();
			System.out.println(msg);			
	//		System.out.println(dan+"x"+i+"="+i*dan);
			i++;
		}
		System.out.println();
	}
	public void me3() {
		int i=0;
		while(i<10) {
			char a='*';
			System.out.print(a);
			i++;
		}
		System.out.println();
	}
	
	public void me31(int n) {
		int i=0;
		char a= '*';
		while(i<n) {
			System.out.print(a);
			i++;
		}
		System.out.println();
	}
	
	public void me31(int n, String a) {
		int i=0;
		while(i<n) {
			System.out.print(a);
			i++;
		}
		
	}
	
	
	public void gugudan() {
		int j=2;
		while(j<10) {
			
			System.out.println("< "+j+" ´Ü>");
			dan(j);
			j++;
		}
		System.out.println();
		
	}
	
	public void printStar(int n) {
		int i =0 ;
		while(i<n) {
			me31(i+1);
			i++;
		}
	}
	//È¦ ¼ö º° Âï±â
	public void printStar2(int n) {
		//È¦ ¼ö º° Âï±â1
		//dimond
		int i =0;
		while(i<n) {
			if(i%2 == 0) {
				int j = (9-i)/2;
				System.out.println();
				me31(j," ");
				me31(i+1, "*");
				me31(j," ");
				
			}else {
	//			System.out.println("Â¦¼öÃâ·Â·Â¾ÈÇÔ");
			}
			i++;
		}
		
	}
	
	
	
	//ÇÇº¸³ªÄ¡¼ö
	public void printPibo() {
		int a = 1;
		int b= 1;
		for(int i=0;i<15;i++) {
			int c = a+b;
			System.out.println(c);
			a= b;
			b=c;
		}
	}
	
	public void me4() {
		int i=0;
		while(i<10) {
			if(i%5==0 &&i!=0) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("me4 ³¡");
	}
	
	public void me5() {
		int i=0;
		while(i<10) {
			if(i !=0 && i%5==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			
		}
	}
	
	
}
