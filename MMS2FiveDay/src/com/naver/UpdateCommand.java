package com.naver;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class UpdateCommand implements Command{
	String name;
	String mid;
	String job;
	Date birth;
	MemberDTO mdto;
	Calendar cal = Calendar.getInstance();
	
	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		System.out.println("회원 수정을 시작합니다.");
		System.out.println("1: name으로 조회");
		System.out.println("2: mid으로 조회");
		int k=sc.nextInt();
		sc.nextLine();
		
		switch (k) {
		case 1:
			System.out.println("조회할 회원 name를 입력하세요.");
			this.name = sc.nextLine();
			
			list =dao.selectByNmae(name);
			if(list==null) {
				System.out.println("존재하지 않는 이름입니다.");
				System.out.println(	"	dao.select();	");
			}else {
				for (int i = 0; i < list.size() ; i++) {
					System.out.println(list.get(i));
				}
			}
			
		default:
			System.out.println("조회할 회원 mid를 입력하세요.");
			this.mid=sc.nextLine();
			this.mdto = dao.selectBymid(mid);
			if(mdto==null) {
				System.out.println("존재하지 않는 mid 입니다.");
				break;
			}else {
				System.out.println(mdto);
			}
			System.out.println("이름을 변경하시겠습니까?");
			System.out.println("0:변경안함 , 1:변경");
			int yes= sc.nextInt();
			sc.nextLine();
			if(yes==1) {
				System.out.println("변경 name를 입력하세요.");
				name = sc.nextLine();
			}else {
				name=mdto.getName();
			}
			System.out.println("직업을 변경하시겠습니까?");
			System.out.println("0:변경안함, 1:변경");
			yes= sc.nextInt();
			sc.nextLine();
			if(yes==1) {
				System.out.println("변경 job을 입력하세요");
				job = sc.nextLine();
			}else {
				job=mdto.getJob();
			}
			System.out.println("생일을 변경하시겠습니까?");
			System.out.println("0:변경안함 , 1:변경");
			yes= sc.nextInt();
			sc.nextLine();
			if(yes==1) {
				System.out.println("birth를 변경 합니다");
				birth = birth(sc);
				
			}
				birth=mdto.getBirth();		
			
			
		}
		
		if(mdto==null) {
			return;
		}
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		dao.update(dto);
		
	
	}
	
	
	public Date birth(Scanner sc) {
		
		int year= year(sc);		
		
		int month=month(sc);
		
		int date=date(sc);
		
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis());
		return birth;
	}
	public int year(Scanner sc) {
		System.out.println("출생년도를 입력하세요");
		System.out.println("1800 ~ "+cal.get(Calendar.YEAR));
		int year = sc.nextInt();
		sc.nextLine();
		if(year<1800 || year>cal.get(Calendar.YEAR )) {
			System.out.println("범위를 벗어났습니다");
			System.out.println("올해 년도로 임시저장 합니다.");
			year=cal.get(Calendar.YEAR);
		}
		return year;
	}
	
	public int month(Scanner sc) {
		System.out.println("출생월을 입력하세요");
		System.out.println("1 ~ 12");
		int month = sc.nextInt()-1;
		sc.nextLine();
		if(month>13 || month<=0) {
			System.out.println("범위를 벗어났습니다");
			System.out.println("현재 월로 임시저장 합니다.");
			month=cal.get(Calendar.MONTH);
		}
		return month;
	}
	
	public int date(Scanner sc) {
		System.out.println("출생일을 입력하세요");
		int date = sc.nextInt();
		sc.nextLine();
		if(date<=0 || date> cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
			System.out.println("범위를 벗어났습니다");
			System.out.println("현재 월로 임시저장 합니다.");
			date=cal.get(Calendar.DATE);
		}
		return date;
	}
	


	@Override
	public String toString() {
		return "1. 수정 ";
	}
	
	
	
	
	

}
