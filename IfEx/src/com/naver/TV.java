package com.naver;

public class TV {
	private int vol;
	private int ch;
	private boolean power;
	
	public TV() {
		ch=0;
		vol=10;
		power=false;
	}
	
	
	public void vloUp() {
		
		if(!power) {
			return; //해당 메서드 종료
		}
		
		vol++;
		if(power && vol>100) {
			vol=100;
		}
		System.out.println("vol.U:"+vol);
		
	}
	public void volDown() {
		
		if(power) {
			--vol;
			if(power && vol<0) {
				vol=0;
			}
			System.out.println("vol.D:"+vol);
		}
			
	}
	public void chUp() {
		if(!power) {
			return; //해당 메서드 종료
		}
		ch++;
		if(power&&ch>999) {
			ch=0;
		}
		System.out.println("ch.U:"+ch);
	}
	public void chDown() {
		if(!power) {
			return; //해당 메서드 종료
		}
		--ch;
		if(power&&ch<0) {
			ch=999;
		}
		System.out.println("ch.D:"+ch);
	}
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
		
	}
	public void tvInfo() {
		if(!power) {
			System.out.print("vol:"+ vol +"\t"+"ch:"+ ch+"\n");
			System.out.println("tv1의 전원이 꺼져있습니다.");
			return;
		}
		System.out.print("vol:"+ vol +"\t"+"ch:"+ ch+"\n");
		
	}

	public TV(int vol, int ch, boolean power) {
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

	public boolean getPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	

}
