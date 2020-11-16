package com.naver;

import java.util.Arrays;
import java.util.List;

public class Hero {
	List<Weapon> listw;
	Weapon w;
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	public Hero(List<Weapon> listw, Weapon w) {
		super();
		this.listw = listw;
		this.w = w;
	}

	public List<Weapon> getListw() {
		return listw;
	}

	public void setListw(List<Weapon> listw) {
		this.listw = listw;
	}

	public Weapon getW() {
		return w;
	}
	public void setW(Weapon w) {
		this.w = w;
	}
	public void attack(Monster mon) {
		w.attack(mon);
	}
	public void chageWeapon(int idx) {
			try {
				idx=listw.size()-1;
			} catch (Exception e) {
				w= listw.get(0);
			}
	
		System.out.println(String.format("[%s],[%d]·Î º¯°æµÊ", w,w.getPower()));
	}
	
	

}
