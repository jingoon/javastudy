package com.naver;

public class Board {
	private String todayPost;
	private boolean isOk;

	public Board() {
		// TODO Auto-generated constructor stub
	}
	

	public Board(String todayPost, boolean isOk) {
		super();
		this.todayPost = todayPost;
		this.isOk = isOk;
	}

	public String getTodayPost() {
		if(!isOk) {					// if가 없어도 실행하지만 계속 기다리기만 할때가 있다.
			synchronized (this) {
				try {
					wait();			// 멈춤
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return todayPost;
	}

	public void setTodayPost(String todayPost) {
		this.todayPost = todayPost;
		
		synchronized (this) {
			notify();
		}
	}

	
	

}
