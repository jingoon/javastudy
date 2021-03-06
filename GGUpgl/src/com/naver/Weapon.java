package com.naver;

public abstract class Weapon {
	private String name;
	private int power;
	public Weapon(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	@Override
	public String toString() {
		return name;
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
	public	abstract void img();
	
	public void attack(Monster mon) {
		img();
		int lastPower = power - mon.getSheild();
		if(lastPower<=0) {
			lastPower =0;
			System.out.println("공격이 빗나갑니다. 무기를 변경하세요");
		}else {
			int monhp = mon.getHp() - lastPower;
			mon.setHp(monhp);
			System.out.println("몬스터의 남은 체력: "+monhp);
		}
		if(mon.getHp()<=0) {
			mon.die();
						
		}
		
	}
	
	

}
