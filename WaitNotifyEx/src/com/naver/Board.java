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
		if(!isOk) {					// if�� ��� ���������� ��� ��ٸ��⸸ �Ҷ��� �ִ�.
			synchronized (this) {
				try {
					wait();			// ����
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
