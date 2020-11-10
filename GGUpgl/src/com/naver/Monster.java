package com.naver;

public class Monster {
	private int hp;
	private int sheild;

	public Monster(int hp) {
		super();
		this.hp = hp;
	}
	

	public Monster(int hp, int sheild) {
		super();
		this.hp = hp;
		this.sheild = sheild;
	}
	


	public int getSheild() {
		return sheild;
	}


	public void setSheild(int sheild) {
		this.sheild = sheild;
	}


	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public Weapon die() {
		hp=0;
		Weapon item= new Bow("ũ�ν�����", SetUP.CROSBOW_POWER);
		System.out.println("���� óġ/ ������ ���:");
		
		return item;
	}
	

	@Override
	public String toString() {
		return "Monster [hp=" + hp + "]";
	}
	
	

}