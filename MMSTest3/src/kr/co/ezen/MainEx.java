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
			System.out.println("�޴��� �Է��ϼ���");
			System.out.println("0:ȸ���Է� 1:ȸ������ 2:����");
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
