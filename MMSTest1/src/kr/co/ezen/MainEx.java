package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Command[] coms = {new InsertCommand(),
						new SelectCommand(),
						new UpdateCommand(),
						new DeleteCommand()};
		
		int idx=0;
		boolean is =true;
		
		while(is) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("0:회원입력 1:회원출력 2:회원수정 3:회원삭제 4:종료");
			idx =sc.nextInt();
			sc.nextLine();
			if(idx == coms.length) {
				break;
			}
			
				
				coms[idx].execut(sc);
			
			
		}
		
		
		sc.close();
		System.out.println("end");
	}
	
	
}
