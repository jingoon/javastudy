package Calendar;

import java.sql.Date;
import java.util.Calendar;

public class CalendarEx {
	
	public void me2() {
		Calendar c = Calendar.getInstance();
		int year =c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(String.format("%s년%s월%s일%s요일", year,month,date,day ));
	
	}
	public void me3() {
		Calendar c = Calendar.getInstance();
		c.set(1950, Calendar.MAY, 25);
		int day=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}
	public void me4() {
		Calendar c= Calendar.getInstance();
		c.set(1950, Calendar.FEBRUARY, 25);
		int maxdate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxdate);
		c.set(Calendar.DATE,maxdate);
		int maxday=c.get(Calendar.DAY_OF_WEEK);
		//System.out.println(maxday);
		
		String[] days= {"일","월","화" ,"수" ,"목" ,"금" ,"토"};
		for(int i=0;i<days.length;i++) {
			if(maxday-1==i) {
				System.out.println(days[i]+"요일");
			}
		}
	}
	public void me6() {
		Calendar c = Calendar.getInstance();
		c.set(2020, Calendar.DECEMBER, 12);
		c.add(Calendar.DATE, 20);
		
		System.out.println(c.getTime());
		
		Calendar d = (Calendar) c.clone();
		
		
		
	}
	
	public void me7() {
		
	}
	

	
}
