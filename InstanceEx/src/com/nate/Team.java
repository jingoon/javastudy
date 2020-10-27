package com.nate;

import com.naver.Car;
import com.naver.Person;

import kr.co.ezen.Dog;

public class Team {
	
	private Person captain;
	private Person member1;
	private Person member2;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Team(Person captain, Person member1, Person member2) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}
	public void showCaptainCarPrice() {
		Car captainCar = captain.getK7();
		captainCar.showMePrice();
		
		}
	public void mem1Sleep(String where) {
		member1.sleep(where);
		
		Dog member1dog = member1.getHappy();
		System.out.println(member1dog.sleep("방"));
	}
	
	public void mem2PrintCarModelName() {
	/*	
		Car myCar = member2.getK7();				// 멤버2의 자동차(k7)
		String mem2CarName = myCar.getModelName();	//자동차(k7)의 모델네임
		System.out.println(mem2CarName);			
	*/	
		String mem2CarName = member2.getK7().getModelName();	//멤버2의 자동차의 모델네임
		System.out.println(mem2CarName);
	}
	
	public char getCaptainCarModelNameFirstChar() {
		String charCap = captain.getK7().getModelName();
		char c = charCap.charAt(0);
		
		return c;
	}
	
	// 멤버1이 갖고 있는 개를 외부에서 입력하는 개로 변경
	public void changeMember1Dog(Dog dog) {
		member1.setHappy(dog);
			
	}
	// 멤버1이 갖고 있는 개의 이름을 외부에서 입력하는 이름으로 변경
	public void changeMember1DogName(String dogName) {
		member1.getHappy().setName(dogName);
	}
	
	
	public Person getCaptain() {
		return captain;
	}
	public void setCaptain(Person captain) {
		this.captain = captain;
	}
	public Person getMember1() {
		return member1;
	}
	public void setMember1(Person member1) {
		this.member1 = member1;
	}
	public Person getMember2() {
		return member2;
	}
	public void setMember2(Person member2) {
		this.member2 = member2;
	}
	public void fight(Team otherteam) {
		// TODO Auto-generated method stub
		String aTeamCaptainName = this.captain.getName();	//호출한 메서드
		String bTeamCaptainName = otherteam.captain.getName();
		System.out.println(aTeamCaptainName+"과 "+ bTeamCaptainName+"이 싸운다");
		
	}
	public void fightMem1(Team otherTeam) {
		// TODO Auto-generated method stub
		String aTeamMember1 = this.member1.getName();
		String bTeamMember1 = otherTeam.member1.getName();
		System.out.println(aTeamMember1+ "과 "+ bTeamMember1+ "이 싸웁니다.");
		
	}


	public void fightMem2Dog(Team otherTeam) {
		// TODO Auto-generated method stub
		String aTeamMem2Dog = this.member2.getHappy().getName();
		String otherTeamMem2Dog = otherTeam.getMember2().getHappy().getName();
		System.out.println(aTeamMem2Dog+ "와 "+ otherTeamMem2Dog+ "가 개싸웁니다.");
		
	}


	public void raceCarCaptain(Team otherteam) {
		// TODO Auto-generated method stub
		String aTCaptainCarName = this.captain.getK7().getModelName();
		String bTCCName = otherteam.captain.getK7().getModelName();
		System.out.println(aTCaptainCarName+ "과(와) "+ bTCCName+"가 경주합니다.");
		
	}


	public void raceCar(Person aTMember, Person bTMember) {
		// TODO Auto-generated method stub
		String a= aTMember.getK7().getModelName();
		String b = bTMember.getK7().getModelName();
		System.out.println(a +"와"+b );
		
	}


	public void vsTeamDog(Person person, Person person2) {
		// TODO Auto-generated method stub
		String dog1 = person.getHappy().getName();
		String dog2 = person2.getHappy().getName();
		System.out.println(dog1 +"과 "+ dog2+"의 개싸움");
	}


	public void vsTeamCarRaceMem1(Team aTeam, Team bteam) {
		// TODO Auto-generated method stub
		String at = aTeam.member1.getK7().getModelName();
		String bt = bteam.member1.getK7().getModelName();
		System.out.println(at +" vs "+ bt);
		
	}


	public String vsTeamCarPrice(Team bteam) {
		// TODO Auto-generated method stub
		int a = this.captain.getK7().getPrice() + this.member1.getK7().getPrice() + this.member2.getK7().getPrice();
		int b = bteam.captain.getK7().getPrice() + bteam.member1.getK7().getPrice() + bteam.member2.getK7().getPrice();
		String c = "a팀의 총 자동차 가격은 "+ a+"이고, "+"b팀의 총 자동차 가격은 "+b+"입니다." ;
		
		return c;
		
	}
	
	


	
	

}
