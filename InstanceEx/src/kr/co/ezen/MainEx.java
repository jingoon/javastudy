package kr.co.ezen;

import java.util.Date;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car bmw1 = new Car("bmw", "a10", 700000000);
		
		bmw1.showMePrice();
		String bmw1Speed = bmw1.run(300);
		System.out.println(bmw1Speed);
		System.out.println("=== ������ ���� ===");
		bmw1.setPrice(500000000);
		bmw1.showMePrice();
		System.out.println(":::::::::::::::::::::::::");
		
		Dog jindo = new Dog(231, "����", new Date());
		Date jindoBirth = jindo.getBirth();
		System.out.println(jindoBirth);
		System.out.println("::::::::::::::::::::::::::");
		
		jindo.sleep("����");
		
		Team jin = new Team();
		jin.setCaptatain(new Person("22", "ĸƾ", jindo, bmw1));
		
		System.out.println(jin.getCaptatain().getHappy().sleep("����"));
		
		jin.setMember2(new Person("33", "������", null, bmw1));
		jin.mem2PrintCarModelName();
		
		
		
	
	}

}
