package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("k7", "����34��1234", 4000);
	//	car1.showMePrice();
		Car car2 = new Car("BMW", "����33��9876", 5000);
		Car car3 = new Car("sm5", "���31��1234", 4000);
		
		Car car4 = new Car("sm6", "4", 4000);
		Car car5 = new Car("sm7", "5", 5000);
		Car car6 = new Car("sm8", "6", 6000);
		
		
		
		
		Dog dog1 = new Dog(1, "happy", new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3, "�鱸", new Date(Calendar.getInstance().getTimeInMillis()));
		
		Dog dog4 = new Dog(4, "Ȳ��", new Date());
		Dog dog5 = new Dog(5, "�汸", new Date());
		Dog dog6 = new Dog(6, "�屸", new Date());
		
		Person captain = new Person("p1", "a������", dog1, car1);
		Person member1 = new Person("p2", "������", dog2, car2);
		Person member2 = new Person("p3", "�̼���", dog3, car3);
		
		Person captain2 = new Person("p4", "b������", dog4, car4);
		Person member3 = new Person("p5", "������", dog5, car5);
		Person member4 = new Person("p6", "ȫ�浿", dog6, car6);
			
		Team aTeam = new Team(captain, member1, member2);
		Team bteam = new Team(captain2, member3, member4);
		
		aTeam.fight(bteam);
			
		bteam.fightMem1(aTeam);
		
		aTeam.fightMem2Dog(bteam);
		
		aTeam.raceCarCaptain(bteam);
		
		//a���� x�� b���� y�� ���� ����
		aTeam.raceCar(aTeam.getCaptain(), bteam.getMember1());
		aTeam.raceCar(member2, member4);
		//�� �ο�
		aTeam.vsTeamDog(captain2, member4);
		//�� ����
		aTeam.vsTeamCarRaceMem1(aTeam, bteam);
		//�� �ڶ�
		String vsPrice = aTeam.vsTeamCarPrice(bteam);
		System.out.println(vsPrice);
			
		
	
		
		
		
		
		
	/*	
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
		
	
		
		Team jin = new Team();
		jin.setCaptain(new Person("22", "ĸƾ", jindo, bmw1));
		
		System.out.println(jin.getCaptain().getHappy().sleep("����"));
		
		jin.setMember2(new Person("33", "������", null, bmw1));
		jin.mem2PrintCarModelName();
	*/
		
		
		
		
	
	}

}
