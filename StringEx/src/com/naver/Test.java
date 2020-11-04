package com.naver;

public class Test {
	
	public void me4() {
		StringBuffer sb = new StringBuffer();
		//String클래스는 불변적 성격을 갖고있다.
		
		String msg = "hello";
		msg = "good";		
		/* 
		* hello가 변하지 않고 새로 good이 생긴다.
		*  가비지컬렉터가 삭제하지만 바로 삭제하지 않는다.
		*  문자열이 계속해서 누적되는 경우
		* msg ="";
		* msg +="안녕하세요";
		* msg +="저는 홍길동입니다";
		* msg +="저는 어디 살고있어요";
		* msg +=... 누적.
		 성능저하가 발생한다
		 이럴때 StringBuffer를 사용
		*/
		sb.append("안녕하세요");
		sb.append("저는 홍길동입니다");
		sb.append("저는 어디 살고있어요");
		msg = sb.toString(); // sb를 String형으로 변경해 준다.
	}
	
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		
		System.out.println(msg1==msg2); //false
		System.out.println(msg1==msg3); //false
		System.out.println(msg3==msg4); //true
		System.out.println(">>>");
		System.out.println(msg1.equals(msg2)); //true
		System.out.println(msg1.equals(msg3)); //true
		
	}
	public void me2() {
		//암시적 객체 생성법(리터럴)
		String msg2	="hello";
	}
	
	public void me1() {
		//명시적 객체 생성법
		String msg = new String("hello");
	}
	
	public void me0() {
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = "가다나";
		
		boolean s1EqS2= s1.equals(s2);
		boolean s1EqS3= s1.equals(s3);
		
		StringBuffer sb = new StringBuffer();
		sb.append(false);
		sb.append('c');
		sb.append("말말말 ");
		sb.append("   *    ");
		
		String sb2 = sb.toString();
		System.out.println(sb2);
		
		
		System.out.println(s1EqS2);
		System.out.println(s1EqS3);
	
		System.out.println(sb);
	}
	
	public void me01() {
		StringBuffer sb = new StringBuffer();
		sb.append("태산이 ");
		sb.append("높다하되 ");
		sb.append("하늘아래 ");
		sb.append("뫼이거늘 ");
		sb.append("오르고 또 오르면 ");
		sb.append("못 오를리 ");
		sb.append("없건마는 ");
		sb.append("사람이 제 아니 오르고 ");
		sb.append("뫼만 높다 하더라 ");
		
		System.out.println(sb);
		String s1 = sb.toString();
		System.out.println(s1);
	}
	
	public void me02() {
		
		String a = "a";
		String b = "a";
		String c = new String("a");
		String d = new String("a");
		System.out.println(">>>>>>>");
		me03(a, b);
		me03(a, c);
		me03(a, d);
		me03(b, c);
		me03(b, d);
		me03(c, d);
		
		
		
	}
	public void me03(String a, String b) {
		boolean k = a.equals(b);
		boolean k2= false;
		if(a==b) {
				k2= true;	
		}
		
			StringBuffer sb = new StringBuffer();
			sb.append("== 연산결과:\t");
			sb.append(a);
			sb.append("와 ");
			sb.append(b);
			sb.append("는 ");
			sb.append(k2);
			
			StringBuffer sb2 = new StringBuffer();
			sb2.append("eqauls 연산결과:\t");
			sb2.append(a);
			sb2.append("와 ");
			sb2.append(b);
			sb2.append("는 ");
			sb2.append(k);
			String sb3 = sb2.toString();
					
			
			System.out.println(sb);
			System.out.println(sb3);
			System.out.println();
		
		
	}
		// 최종 값은 5 ~9 다음 0~9 0~9 순환되면서 배열에 들어감
		// int형 3차원 arr3은 3X1X4크기
	public void me03() {
		int[][][] arr3= {
				{
					{5,6,7,8}
				},
				{
					{9,0,1,2}
				},
				{
					{3,4,5,6}
				}
		};	
		
		int[][] arr20 = {
				{5,6,7,8}
				};
		int[] arr10 = {5,6,7,8};
	}
	
	public void arrayAdd1(int[] num) {
		for(int i=0; i<num.length;i++) {
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
