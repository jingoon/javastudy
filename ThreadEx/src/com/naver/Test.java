package com.naver;

public class Test extends Thread{ // thread 상속
	@Override
	public void run() {	// thread실행코드
		me1();
	}
	public void me1() {
		for(int i=0; i<10;i++) {
			System.out.println("Test1: "+i);
			try {
				Thread.sleep(1000);	// 1/1000s식 쉬면서 출력
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
