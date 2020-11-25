package kt.co.ezen;

import java.beans.Encoder;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.End;
import com.naver.Insert;
import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Select;

public class MainEx {
	public static void main(String[] args) {
//		MemberDAO dao = new MemberDAO();
//		//insert
//		dao.insert("m010", "ka", "c", null);
//		//select
//		dao.select();
//		//update
//		dao.update("m010", "goo");
//		//delete
//		dao.delete("m010");
		
		//mms와 합치기
		
		Scanner sc = new Scanner(System.in);
		List<Command> list = new ArrayList<Command>();
		list.add(new End());
		list.add(new Insert());
		list.add(new Select());
		
		boolean ok = true;
		while(ok){
		System.out.println("메뉴를 선택하세요");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		int index=sc.nextInt();
		sc.nextLine();
		
		list.get(index).execute(sc);
		}
	
		sc.close();
	}

}
