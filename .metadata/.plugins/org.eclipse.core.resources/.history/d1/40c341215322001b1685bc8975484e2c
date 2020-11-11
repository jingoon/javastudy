package com.naver;

public abstract class Weapon {
	private String name;
	private int power;
	public Weapon() {
		// TODO Auto-generated constructor stub
	}
	public Weapon(int power) {
		super();
		this.power = power;
	}
	
	public final void attack(Monster mon) {
		img();
		int bHp = mon.getHp();
		int aHp = bHp - power;
		mon.setHp(aHp);
		System.out.println("monster의 HP:"+aHp);
	}
	
	public abstract void img();		//추상메서드, 추상메서드가 있으면 추상클레스로 만듬
									
	
	public Weapon(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	@Override
	public String toString() {
		return getName();
	
				
	}
	

}
