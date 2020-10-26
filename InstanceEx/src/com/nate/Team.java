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
		System.out.println(member1dog.sleep("¹æ"));
	}
	
	public void mem2PrintCarModelName() {
		
		String mem2CarName = member2.getK7().getModelName();
		System.out.println(mem2CarName);
	}
	
	
	
	
	public Person getCaptatain() {
		return captain;
	}
	public void setCaptatain(Person captain) {
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
	

}
