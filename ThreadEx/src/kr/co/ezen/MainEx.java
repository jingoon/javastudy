package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;



public class MainEx {
	public static void main(String[] args) {
//		// ���� thread��ü. ��ü�� �̸����
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name);
		
//		1.TestŬ������ ThreadŬ������ �������.
//		2.TestŬ������ �̿��ؼ� Thread ��ü�� �������
//		3.TestŬ������ �̿��ؼ� Thread�� �������		
//		

		System.out.println("main start");
		
		Test t1 = new Test();
		Test2 t2 = new Test2();
		Test3 r3 = new Test3();
		Test4 r4 = new Test4();
		
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		
	//	t1.run(); main thread��. ���� thread�ȸ���
		t1.start();	//Thread�� �������.
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("main end");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//���೻�� 
				System.out.println("����� ������ ��, ���־��� thread");
				
			}
		}).start();
		
		
		
		
		
		
		
		
		
		
	}

}
