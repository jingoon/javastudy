package kr.co.ezen;

import com.naver.Board;
import com.naver.ReadThread;
import com.naver.WriterThread;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board board = new Board();
		
		WriterThread wt = new WriterThread(board);
		ReadThread rc = new ReadThread(board);
		
		
		rc.start();
		wt.start();
		
		try {
			rc.join();
			wt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
