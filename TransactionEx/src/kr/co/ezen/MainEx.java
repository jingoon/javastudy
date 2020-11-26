package kr.co.ezen;

import com.naver.AccountDAO;
import com.naver.DAO_me;

public class MainEx {

	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
	//	dao.transter("kim", "lee", 10000);
		
		DAO_me dm = new DAO_me();
		dm.transter();
	}

}
