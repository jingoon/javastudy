package com.naver;

public class Hero {
	private Bow bow;
	private Spear spear;
	private Sword sword;
	private Hand hand;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Hero(Hand hand) {
		super();
		this.hand = hand;
	}


	public Hand getHand() {
		return hand;
	}


	public void setHand(Hand hand) {
		this.hand = hand;
	}


	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		
		this.sword = sword;
		System.out.println("∞À¿ª µÏ¥œ¥Ÿ");
	}

	public Hero(Spear spear) {
		super();
		this.spear = spear;
	}

	public Hero(Bow bow) {
		super();
		this.bow = bow;
	}
	
	public Spear getSpear() {
		
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
		System.out.println("√¢¿ª µÏ¥œ¥Ÿ.");
	}

	public Bow getBow() {
		return bow;
	}
	public void setBow(Bow bow) {
		this.bow = bow;
		System.out.println("»∞¿ª µÏ¥œ¥Ÿ.");
	}
	
	public void attack(Monster mon) {
	
		hand.attack(mon);
		
	}
	public void attackBow(Monster mon) {
		
		bow.attack(mon);
		
	}
	public void attackSpear(Monster mon) {
		
		spear.attack(mon);
		
	}
	public void attackSword(Monster mon) {
		sword.attack(mon);
	}
	
}
