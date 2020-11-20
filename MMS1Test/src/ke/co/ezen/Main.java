package ke.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DB;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.MemberDTO;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Command> commands = new ArrayList<Command>();
		commands.add(new EndCommand());
		commands.add(new InsertCommand());
		commands.add(new SelectCommand());
		commands.add(new UpdateCommand());
		commands.add(new DeleteCommand());
		int index;
		boolean menu= true;
		try {
			while(menu) {
				System.out.println("메뉴의 번호를 입력하세요");
				System.out.println(commands);
				index = sc.nextInt();
				sc.nextLine();
				commands.get(index).command(sc);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}

}
