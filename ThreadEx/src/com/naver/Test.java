package com.naver;

public class Test extends Thread{ // thread ���
	@Override
	public void run() {	// thread�����ڵ�
		me1();
	}
	public void me1() {
		for(int i=0; i<10;i++) {
			System.out.println("Test1: "+i);
			try {
				Thread.sleep(1000);	// 1/1000s�� ���鼭 ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
