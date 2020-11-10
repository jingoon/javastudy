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
		Command[] coms = {new InsertCommand(), new SelectCommand(), new DeleteCommand(), new UpdateCommand()};
		
		int idx=-1;
		boolean isok = true;
		while(isok) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("0:�Է� 1:��� 2:���� 3:���� 4:����");
			idx=sc.nextInt();
			sc.nextLine();
			if(idx==coms.length) {
				break;
			}
			coms[idx].execute(sc);
			
			
		}
		
		
		sc.close();
	}
}