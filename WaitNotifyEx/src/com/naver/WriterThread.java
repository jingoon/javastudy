package com.naver;
public class WriterThread extends Thread{
	
	private Board board;
	
	public WriterThread() {
		// TODO Auto-generated constructor stub
	}

	public WriterThread(Board board) {
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
		board.setTodayPost("다쓰고나서 읽어주세요");
	}
	
}
