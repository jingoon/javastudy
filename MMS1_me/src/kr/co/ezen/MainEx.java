package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Command> list = new ArrayList<Command>();
		list.add(new InsertCommand());
		list.add(new SelectCommand());
		list.add(new DeleteCommand());
		list.add(new UpdateCommand());
		list.add(new EndCommand());		
		
		boolean isOk = true;
		
		int idx=-1;
		
		try {
			while(isOk) {
				System.out.println("메뉴를 선택하시오.");
			//	System.out.println("0:회원입력, 1:회원조회, 2:삭제, 3:수정, 4:종료");
				for(int i=0;i<list.size();i++) {
					Command com = list.get(i);
					System.out.print(i+ ":" +com+"  ");
				}
				System.out.println();
				idx = sc.nextInt();
				sc.nextLine();
				
				list.get(idx).execute(sc);
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		sc.close();
		}
	}

}
