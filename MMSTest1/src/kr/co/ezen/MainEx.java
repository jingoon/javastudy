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
			System.out.println("�޴��� �����ϼ���");
			System.out.println("0:ȸ���Է� 1:ȸ����� 2:ȸ������ 3:ȸ������ 4:����");
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