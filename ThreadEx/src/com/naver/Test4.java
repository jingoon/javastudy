package com.naver;

public class Test4 extends Unit implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Test4: "+i*100);
			try {
				Thread.sleep(1000);		//1ÃÊ¸¶´Ù ½®´Ù
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
