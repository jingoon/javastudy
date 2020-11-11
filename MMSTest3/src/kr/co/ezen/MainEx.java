package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.InsertCommand;
import com.naver.SelectCommand;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Command[] coms = {new InsertCommand(),new SelectCommand()};
		
		int idx=0;
		boolean is =true;
		while(is) {
			System.out.println("메뉴를 입력하세요");
			System.out.println("0:회원입력 1:회원선택 2:종료");
			idx=sc.nextInt();
			sc.nextLine();
			if(idx == coms.length) {
				break;
			}
			
			coms[idx].execute(sc);
		
		}
		
		
		
		sc.close();

	
	}
}
