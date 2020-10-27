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
		System.out.println(member1dog.sleep("��"));
	}
	
	public void mem2PrintCarModelName() {
	/*	
		Car myCar = member2.getK7();				// ���2�� �ڵ���(k7)
		String mem2CarName = myCar.getModelName();	//�ڵ���(k7)�� �𵨳���
		System.out.println(mem2CarName);			
	*/	
		String mem2CarName = member2.getK7().getModelName();	//���2�� �ڵ����� �𵨳���
		System.out.println(mem2CarName);
	}
	
	public char getCaptainCarModelNameFirstChar() {
		String charCap = captain.getK7().getModelName();
		char c = charCap.charAt(0);
		
		return c;
	}
	
	// ���1�� ���� �ִ� ���� �ܺο��� �Է��ϴ� ���� ����
	public void changeMember1Dog(Dog dog) {
		member1.setHappy(dog);
			
	}
	// ���1�� ���� �ִ� ���� �̸��� �ܺο��� �Է��ϴ� �̸����� ����
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
		String aTeamCaptainName = this.captain.getName();	//ȣ���� �޼���
		String bTeamCaptainName = otherteam.captain.getName();
		System.out.println(aTeamCaptainName+"�� "+ bTeamCaptainName+"�� �ο��");
		
	}
	public void fightMem1(Team otherTeam) {
		// TODO Auto-generated method stub
		String aTeamMember1 = this.member1.getName();
		String bTeamMember1 = otherTeam.member1.getName();
		System.out.println(aTeamMember1+ "�� "+ bTeamMember1+ "�� �ο�ϴ�.");
		
	}


	public void fightMem2Dog(Team otherTeam) {
		// TODO Auto-generated method stub
		String aTeamMem2Dog = this.member2.getHappy().getName();
		String otherTeamMem2Dog = otherTeam.getMember2().getHappy().getName();
		System.out.println(aTeamMem2Dog+ "�� "+ otherTeamMem2Dog+ "�� ���ο�ϴ�.");
		
	}


	public void raceCarCaptain(Team otherteam) {
		// TODO Auto-generated method stub
		String aTCaptainCarName = this.captain.getK7().getModelName();
		String bTCCName = otherteam.captain.getK7().getModelName();
		System.out.println(aTCaptainCarName+ "��(��) "+ bTCCName+"�� �����մϴ�.");
		
	}


	public void raceCar(Person aTMember, Person bTMember) {
		// TODO Auto-generated method stub
		String a= aTMember.getK7().getModelName();
		String b = bTMember.getK7().getModelName();
		System.out.println(a +"��"+b );
		
	}


	public void vsTeamDog(Person person, Person person2) {
		// TODO Auto-generated method stub
		String dog1 = person.getHappy().getName();
		String dog2 = person2.getHappy().getName();
		System.out.println(dog1 +"�� "+ dog2+"�� ���ο�");
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
		String c = "a���� �� �ڵ��� ������ "+ a+"�̰�, "+"b���� �� �ڵ��� ������ "+b+"�Դϴ�." ;
		
		return c;
		
	}
	
	


	
	

}
