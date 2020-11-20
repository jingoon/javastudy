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

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Command> list = new ArrayList<Command>();
		list.add(new EndCommand());
		list.add(new InsertCommand());
		list.add(new SelectCommand());
		list.add(new UpdateCommand());
		list.add(new DeleteCommand());
		
		boolean ok = true;
		int index = -1;
		try {
			
			while(ok) {
				
				System.out.println("메뉴의 번호를 선택하세요");
				System.out.println(list);
				index=sc.nextInt();
				sc.nextLine();
				list.get(index).execute(sc);;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sc.close();
		}
	
	}

}
