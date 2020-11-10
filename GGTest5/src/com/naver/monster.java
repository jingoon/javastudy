package com.naver;

public class monster {
	private int hp;
	

	public monster(int hp) {
		super();
		this.hp = hp;
	}
	

	@Override
	public String toString() {
		return "monster [hp=" + hp + "]";
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
