package com.naver;

public class Team {
	private Person member1;
	private Person member2;
	private Person member3;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(Person member1, Person member2, Person member3) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
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

	public Person getMember3() {
		return member3;
	}

	public void setMember3(Person member3) {
		this.member3 = member3;
	}

	

}
