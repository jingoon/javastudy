package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.EndCommand;
import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.SelectBymid;
import com.naver.UpdateCommand;
import com.naver.insertCommand;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		List<Command> coms = new ArrayList<Command>();
		coms.add(new EndCommand());
		coms.add(new UpdateCommand());
		coms.add(new insertCommand());
		
		
		while (true) {
			System.out.println("�޴��� �����ϼ���");
					
			for (int i = 0; i < coms.size(); i++) {
				System.out.print(coms.get(i));
				
			}
			int index=sc.nextInt();
			sc.nextLine();
			System.out.println();
			coms.get(index).execute(sc);
			
		}
		
		
		
		
	}

}
