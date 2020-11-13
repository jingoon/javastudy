package kr.co.ezen;

import java.util.List;

import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {

		Test t1= new Test();
		System.out.println("==1==");
		t1.me1();
		System.out.println("==2==");
		t1.me2();
		System.out.println("==7==");
		List<MemberDTO> list = t1.me7();
		String name = list.get(1).getName();
		System.out.println(name);
		System.out.println("==8==");
		t1.me8();
	
		
		

	}

}
