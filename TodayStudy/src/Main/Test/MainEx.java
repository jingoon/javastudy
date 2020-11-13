package Main.Test;

import java.util.List;

import Calendar.CalendarEx;
import ListEx.ListEx;
import ListEx.MemberDTO;

public class MainEx {

	public static void main(String[] args) {
		
		CalendarEx c1 = new CalendarEx();
		c1.me2();
		c1.me3();
		c1.me4();
		c1.me6();
		
		ListEx l1 = new ListEx();
		List<MemberDTO> list = l1.me7();
		System.out.println(list.get(2).getName());
		
		l1.me8();
		
		

	}

}
