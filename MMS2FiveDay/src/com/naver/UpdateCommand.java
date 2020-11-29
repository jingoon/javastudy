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
		System.out.println("ȸ�� ������ �����մϴ�.");
		System.out.println("1: name���� ��ȸ");
		System.out.println("2: mid���� ��ȸ");
		int k=sc.nextInt();
		sc.nextLine();
		
		switch (k) {
		case 1:
			System.out.println("��ȸ�� ȸ�� name�� �Է��ϼ���.");
			this.name = sc.nextLine();
			
			list =dao.selectByNmae(name);
			if(list==null) {
				System.out.println("�������� �ʴ� �̸��Դϴ�.");
				System.out.println(	"	dao.select();	");
			}else {
				for (int i = 0; i < list.size() ; i++) {
					System.out.println(list.get(i));
				}
			}
			
		default:
			System.out.println("��ȸ�� ȸ�� mid�� �Է��ϼ���.");
			this.mid=sc.nextLine();
			this.mdto = dao.selectBymid(mid);
			if(mdto==null) {
				System.out.println("�������� �ʴ� mid �Դϴ�.");
				break;
			}else {
				System.out.println(mdto);
			}
			System.out.println("�̸��� �����Ͻðڽ��ϱ�?");
			System.out.println("0:������� , 1:����");
			int yes= sc.nextInt();
			sc.nextLine();
			if(yes==1) {
				System.out.println("���� name�� �Է��ϼ���.");
				name = sc.nextLine();
			}else {
				name=mdto.getName();
			}
			System.out.println("������ �����Ͻðڽ��ϱ�?");
			System.out.println("0:�������, 1:����");
			yes= sc.nextInt();
			sc.nextLine();
			if(yes==1) {
				System.out.println("���� job�� �Է��ϼ���");
				job = sc.nextLine();
			}else {
				job=mdto.getJob();
			}
			System.out.println("������ �����Ͻðڽ��ϱ�?");
			System.out.println("0:������� , 1:����");
			yes= sc.nextInt();
			sc.nextLine();
			if(yes==1) {
				System.out.println("birth�� ���� �մϴ�");
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
		System.out.println("����⵵�� �Է��ϼ���");
		System.out.println("1800 ~ "+cal.get(Calendar.YEAR));
		int year = sc.nextInt();
		sc.nextLine();
		if(year<1800 || year>cal.get(Calendar.YEAR )) {
			System.out.println("������ ������ϴ�");
			System.out.println("���� �⵵�� �ӽ����� �մϴ�.");
			year=cal.get(Calendar.YEAR);
		}
		return year;
	}
	
	public int month(Scanner sc) {
		System.out.println("������� �Է��ϼ���");
		System.out.println("1 ~ 12");
		int month = sc.nextInt()-1;
		sc.nextLine();
		if(month>13 || month<=0) {
			System.out.println("������ ������ϴ�");
			System.out.println("���� ���� �ӽ����� �մϴ�.");
			month=cal.get(Calendar.MONTH);
		}
		return month;
	}
	
	public int date(Scanner sc) {
		System.out.println("������� �Է��ϼ���");
		int date = sc.nextInt();
		sc.nextLine();
		if(date<=0 || date> cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
			System.out.println("������ ������ϴ�");
			System.out.println("���� ���� �ӽ����� �մϴ�.");
			date=cal.get(Calendar.DATE);
		}
		return date;
	}
	


	@Override
	public String toString() {
		return "1. ���� ";
	}
	
	
	
	
	

}
