package com.naver;

public class Test2 {
	public Test2() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * my1 //0.1.2.3.4.5...10
	2 // 2.4.6.8...46
	21// 39.97.96.94..21
	dan2// n�� 
	3// *�� n�� ���
	31// 3�� ȣ���ؼ� n��°�� ���� �þ�� * ���
	32// 3�� ȣ���ؼ� n��° �ٱ��� �þ�� Ȧ�� b(char "@")�� ���
	gugudan2// dan2�� ȣ��, ������ ���
	pibo // 1.1.2.3.5.8.13.21... 
	 ->�Ǻ���ġ ���� ��� n��° �Ǻ���ġ��p(n) = p(n-1)+p(n-2)
	 */
	
	public void my1() {
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	public void my2() {
		int i =0;
		while(i<47) {
			System.out.println(i);
			i+=2;
		}
	}
	public void my21() {
		int i=39;
		while(i>=21) {
			System.out.println(i);
			i--;
		}
	
	}
	public void dan2(int dan) {
		int i=1;
		while(i<10) {
			StringBuffer sd = new StringBuffer();
			sd.append(dan);
			sd.append("x");
			sd.append(i);
			sd.append("= ");
			sd.append(dan*i);
			String dan2 = sd.toString();
			System.out.println(dan2);
			
			i++;
		}
	}
	public void my3(int num, String a) {
		int i =0;
		while(i<num) {
			System.out.print(a);
			i++;
		}
		System.out.println();
	}
	public void my31(int num) {
		int i = 0;
		while(i<num) {
			my3(i+1,"@");
			i++;
		}
		System.out.println();
	}
	
	public void my32(int num) {
		int i=0;
		while(i<num) {
			if(i%2!=0) {
			
			}else {
				my3(i+1,"#");
			}
			i++;
		}
	}
	public void gugudan2() {
		int i=2;
		while(i<10) {
			System.out.println(i+"��" );
			dan2(i);
			i++;
		}
	}
	public void pibo() {
		int a=1;
		int b=1;
		int i=0;
		while(i<15) {
			int c= a+b;
			if(i==15-1) {
				System.out.println(c);
			}
			a = b;
			b = c;
			
			i++;
			
		//	a b c 
		//	- a b c
		//	- - a b c 
		}
	}
	
	public void my4() {
		int i=0;
		while(i<10) {
			if(i%4==0 || i==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
	public int soSSu(int i) {
		int result=0;
		
		return result;
	}
	public void my41() {
		int i=99;
		while(i>=0) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
