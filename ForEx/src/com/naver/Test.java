package com.naver;

public class Test {
	
	
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public void me1() {
		for(int i=0; i < 10 ;i++ ) {
			System.out.println("hello world");
		}
	}
	
	
	public void me2() {
		for(int i=0; i<101;i++) {
			System.out.println(i);
		}
	}
	
	public void m6() {
		for(int i=100;i>=0;i--) {
			System.out.println(i);
		}
		
	}
		
	public void m3() {//0.2.4.6.8...51개
		for(int i=0;i<51;i++) {
			int a = i*2;
			System.out.println(a);
		}
	}
	
	public void m4() {//1.3.5.7.9...51개
		for(int i=0;i<51;i++) {
			int a=i*2+1;
			System.out.println(a);
		}
	}
	
	public void m4(int n) {
		for(int i=0;i<n;i++) {
			int a=i*2 +1;
			System.out.println(a);
		}
	}
	
	public void dan(int dan) {
		for(int i=1;i<10;i++) {
			
			System.out.println(dan +"x"+i+"="+(dan*i));
		}
	}
	
	public void isSossu(int num) {//소수 판별
		
		for(int i=2;i<num+1;i++) {
			if(num%i==0) {
				if(i==num) {
					System.out.println("소수");
				}else {
					System.out.println("소수가아님");
					break;
				}
			}
			
		}
		
	}
	public void isSossu2(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("소수아님");				
				break;
			}else if(i==num-1) {
				System.out.println("소수임");
			}
		}
	}
	public void isSouu2For(int n) {
		for (int i = 0; i < n; i++) {
			isSossu2(n);
		}
	}
	
	public void m5() {
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	public void m5(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	public void gugudan() {
		for(int i=2;i<10;i++) {
			System.out.println(i+ "단");
			dan(i);
			System.out.println();
		}
		
	}
	
	public void printStar(int n) {
		for (int i = 0; i < n; i++) {
			m5(i+1);
		}
		
	}
	
	
	public void halfDimond(int n) {
		
		for(int i =0;i<n;i++) {
			if(i+1<n/2) {
				m5(i+1);
			}else {
				m5(n-i-1);
			}
		}
	}
		
	public void gugudan2(int n) {
		for(int j=1;j<10;j++) {
			dan2(2, 6, j);			//k단 부터 n-1단 까지 (j곱)
		}
			System.out.println();
		for(int j=1;j<10;j++) {
			dan2(6,10,j);			//5~10-1단까지(j곱)
		}
		
	}
	
	public void dan2(int k,int n,int j) { // k~n까지
		
			for(int i=k;i<n;i++) {
				System.out.print(i+"x"+j+"="+j*i+"\t");
			}
			System.out.println();
			
	}
	
	public void isSossu3(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("소수아님");
				break;
			}else if(num-1==i) {
				System.out.println("소수임");
			}
		}
	}
	public void star(int num) {
		for(int i=0; i<num;i++) {
			System.out.print('#');
		}
		System.out.println();
	}
	
	public void dimond2(int num) {
		for(int i=0;i<num;i++) {
			if(i+1<num/2) {
				m5(i*2+1);
			}else {
				m5(num-i-1);
			}
			
		}
	}
	
	public void me7(int num) {   
		for(int i=0;i<10;i++){
			if(num%3==0) {		//num값이 3의 배수이면 for문 실행 안함
				System.out.println("3의 배수가 검출, 가장 가까운 반복문중단.");
				break;
			}
		}
	}
	
	public void me71() {
		for(int i=10;i>=0;i--) {
			System.out.println("외부for문 시작");
			
			for(int j =100; j<105;j++) {
				if(i%2==0) {			//i값이 2의 배수이면 for(j)문 실행 안함
					break;
				}
				System.out.println(i+":"+j);
			}
			System.out.println("외부for문 종료");
			System.out.println();
		}
		System.out.println("111");
	}
	public void me8() {
		for(int i=0;i<10;i++) {
			if(i%5==0){			// for문 중 i가 5의 배수일 때 for문 중 그 회차만 실행 안함
				continue;
			}
			System.out.println(i);
		}
	}
	

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
