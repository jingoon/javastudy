package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("k7", "서울34자1234", 4000);
	//	car1.showMePrice();
		Car car2 = new Car("BMW", "서울33사9876", 5000);
		Car car3 = new Car("sm5", "경기31자1234", 4000);
		
		Car car4 = new Car("sm6", "4", 4000);
		Car car5 = new Car("sm7", "5", 5000);
		Car car6 = new Car("sm8", "6", 6000);
		
		
		
		
		Dog dog1 = new Dog(1, "happy", new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3, "백구", new Date(Calendar.getInstance().getTimeInMillis()));
		
		Dog dog4 = new Dog(4, "황구", new Date());
		Dog dog5 = new Dog(5, "흑구", new Date());
		Dog dog6 = new Dog(6, "장구", new Date());
		
		Person captain = new Person("p1", "a팀주장", dog1, car1);
		Person member1 = new Person("p2", "김유신", dog2, car2);
		Person member2 = new Person("p3", "이순신", dog3, car3);
		
		Person captain2 = new Person("p4", "b팀주장", dog4, car4);
		Person member3 = new Person("p5", "김좌진", dog5, car5);
		Person member4 = new Person("p6", "홍길동", dog6, car6);
			
		Team aTeam = new Team(captain, member1, member2);
		Team bteam = new Team(captain2, member3, member4);
		
		aTeam.fight(bteam);
			
		bteam.fightMem1(aTeam);
		
		aTeam.fightMem2Dog(bteam);
		
		aTeam.raceCarCaptain(bteam);
		
		//a팀의 x와 b팀의 y의 차가 경주
		aTeam.raceCar(aTeam.getCaptain(), bteam.getMember1());
		aTeam.raceCar(member2, member4);
		//개 싸움
		aTeam.vsTeamDog(captain2, member4);
		//차 경주
		aTeam.vsTeamCarRaceMem1(aTeam, bteam);
		//돈 자랑
		String vsPrice = aTeam.vsTeamCarPrice(bteam);
		System.out.println(vsPrice);
			
		
	
		
		
		
		
		
	/*	
		Car bmw1 = new Car("bmw", "a10", 700000000);
		
		bmw1.showMePrice();
		String bmw1Speed = bmw1.run(300);
		System.out.println(bmw1Speed);
		System.out.println("=== 수정된 가격 ===");
		bmw1.setPrice(500000000);
		bmw1.showMePrice();
		System.out.println(":::::::::::::::::::::::::");
		
		Dog jindo = new Dog(231, "진도", new Date());
		Date jindoBirth = jindo.getBirth();
		System.out.println(jindoBirth);
		System.out.println("::::::::::::::::::::::::::");
		
	
		
		Team jin = new Team();
		jin.setCaptain(new Person("22", "캡틴", jindo, bmw1));
		
		System.out.println(jin.getCaptain().getHappy().sleep("마당"));
		
		jin.setMember2(new Person("33", "차부자", null, bmw1));
		jin.mem2PrintCarModelName();
	*/
		
		
		
		
	
	}

}
