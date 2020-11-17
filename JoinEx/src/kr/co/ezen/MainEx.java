package kr.co.ezen;

import com.naver.Test;
import com.naver.ZZZ;

public class MainEx {

	public static void main(String[] args) {
		Thread ct =Thread.currentThread();
		String name = ct.getName();
		System.out.println(name);
		
		System.out.println("main start");
		
		Test t1 = new Test("문도");
		Test t2 = new Test("로봇");
		ZZZ t3 = new ZZZ(t1, "미니언");
				
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();		// t1은 메인보다 먼저 데드
			t2.join(); 		// t2는 메인보다 먼저 데드
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("main end");
	}

}
