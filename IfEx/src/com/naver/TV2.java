package com.naver;

public class TV2 {
	private int vol;
	private int ch;
	private boolean power;
	
	public TV2() {
		vol = 0;
		ch = 0;
		power = false;
	}
	public void volUp() {
		
		if(!power) {
			return;
		}
		vol++;
		if(vol>100) {
			vol=100;
		}
		System.out.println("vol.U:"+vol);
		
		
	}
	public void volDown() {
		if(!power) {
			return;
		}
		vol--;
		if(vol<0) {
			vol=0;
		}
		System.out.println("vol.D:"+vol);
	}
	public void chUp() {
		if(!power) {
			return;
		}
		ch++;
		if(ch>999) {
			ch=0;
			System.out.println("ch.U:"+ch);
		}
		
	}
	public void chDown() {
		if(!power) {
			return;
		}
		ch--;
		if(ch<0) {
			ch=999;
			System.out.println("ch.D:"+ch);
		}
		
	}
	public void power() {
		if(!power) {
			power =true;
		}else {
			power = false;
		}
	}
	public void tvInfo() {
		if(!power) {
			System.out.println("전원이 꺼져있습니다.");
			
		}else {
			System.out.println("현재 ch: "+ch+", "+"vol: "+vol);
		}
	}

	public TV2(int vol, int ch, boolean power) {
		super();
		this.vol = vol;
		this.ch = ch;
		this.power = power;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	

}
