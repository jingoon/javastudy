package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;



public class MainEx {
	public static void main(String[] args) {
//		// 현재 thread객체. 객체의 이름출력
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name);
		
//		1.Test클래스를 Thread클래스로 만들었음.
//		2.Test클래스를 이용해서 Thread 객체를 만들었음
//		3.Test클래스를 이용해서 Thread를 만들겠음		
//		

		System.out.println("main start");
		
		Test t1 = new Test();
		Test2 t2 = new Test2();
		Test3 r3 = new Test3();
		Test4 r4 = new Test4();
		
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		
	//	t1.run(); main thread다. 아직 thread안만듬
		t1.start();	//Thread를 만들었음.
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("main end");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//실행내용 
				System.out.println("통신을 구현할 때, 자주쓰는 thread");
				
			}
		}).start();
		
		
		
		
		
		
		
		
		
		
	}

}
