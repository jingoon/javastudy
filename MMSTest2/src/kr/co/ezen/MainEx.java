package kr.co.ezen;

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
		Command[] coms = {	new InsertCommand(), 
							new SelectCommand(), 
							new DeleteCommand(), 
							new UpdateCommand(),
							new EndCommand() };

		int idx = -1;
		boolean isok = true;
		while (isok) {
			System.out.println("메뉴를 선택하세요");
			// System.out.println("0:입력 1:출력 2:삭제 3:수정 4:종료");
			for (int i = 0; i < coms.length; i++) {
				System.out.print(i + ":" + coms[i].toString() + "  ");
			}
			System.out.println();
			idx = sc.nextInt();
			sc.nextLine();

			coms[idx].execute(sc);

		}

		sc.close();
	}
}
