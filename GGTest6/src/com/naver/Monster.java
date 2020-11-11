package com.naver;

public class Monster {
	private int hp;
	private String name;
	private int exp;
	
	public Monster() {
		this.name="����";
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public Monster(int hp) {
		super();
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public void die() {
		System.out.println("���Ͱ� ����");
	}

	@Override
	public String toString() {
		return name+"["+hp+"]";
	}

	

}
