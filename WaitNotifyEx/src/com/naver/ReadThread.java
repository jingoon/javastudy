package com.naver;

public class ReadThread extends Thread{
	private Board board;
	
	
	
	public ReadThread() {
		// TODO Auto-generated constructor stub
	}

	public ReadThread(Board board) {
		super();
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@Override
	public void run() {
		
		System.out.println(board.getTodayPost());
	}
	

}
