package com.naver;

import java.util.StringTokenizer;

public class Test {
	
	public void me15() {
		String msg1	 ="hello";
		String msg2	="Hello";
		String msg3 = "HELLO";
		
		String s1= msg1.toUpperCase();
		System.out.println(s1);
		String s2 =msg3.toLowerCase();
		System.out.println(s2);
		
	}

	public void me14(int age) {
		// 문자열과 숫자를 +연산을 사용하지 않고 표현하는 방법
		// String.format(문자열,값)
		// %d는 정수, %s문자열, %f실수, %t날짜, %c, %x, %%...
		// 표현 자릿수 지정: %자릿수d
		// %5.2f: 소수점 뒷 자리수가 넘어가면 반올림 한다
		// ,를 표현: %,자릿수d
		// 좌정렬: $-자릿수d
		// 자릿수 지정 후 빈 공간을 0으로 채우고 싶으면: %0자릿수d
		
		String msg = "홍길동은 " + age + " 살입니다.";
		System.out.println(msg);

		String msg2 = "홍길동은 %d 살입니다.";
		System.out.println(String.format(msg2, age));

		//2020년  3월 20일
		//2020년 11월  5일
		// 줄 마추기 공백 포함 자릿 수 지정
		int month = 3;
		String msg3 = "오늘은 2020년%2d월20일 입니다.";			//2칸 할당
		System.out.println(String.format(msg3, month)); 
		int date = 5;
		String msg4 = "오늘은 2020년11월%-2d일입니다.";			//2칸 할당 왼쪽 정렬
		System.out.println(String.format(msg4, date));	
		
		// 금액 표기 1,000;
		int money =1000;
		String msg5 ="내 전재산은 %d원입니다.";
		System.out.println(String.format(msg5, money));
		
		String msg6 ="내 전재산은 %,d원입니다.";
		System.out.println(String.format(msg6, money));
		
		String msg7 = "내 전재산은 %,15d 원입니다.";
		System.out.println(String.format(msg7, money));
		
		// 자릿수를 지정해주고, 이를 다 못채웠을 때 앞의 공백을 0으로 채우기
		// 자릿수가 5, 숫자가 11이면 -> 00011
		String msg8 = "내 등번호는 %2d입니다.";
		System.out.println(String.format(msg8, 7));
		
		String msg9 = "내 등번호는 %02d입니다.";
		System.out.println(String.format(msg9, 7));
		
		String msg10 = "%d + %d = %d입니다.";
		System.out.println(String.format(msg10, 3,4,3+4));
		
		String msg11 = "%07.2f%%입니다.";			
		// .앞에는 %f의 표현 자리갯수 빈칸은 으로 .뒤에는 2자리(남어지는 반올림)
		System.out.println(String.format(msg11, 52.627));
		System.out.println(String.format(msg11, 52.624));
		
	}

	public void me131(String msg) {

		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] arr = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i++] = st.nextToken();
		}
		me00(arr);

	}

	public void me00(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void me13() {
		// 특정기준문자(delim)를 이용하여
		//서로다른 의미를 갖고 있는 문자열(=token)을 분할
		String msg = "teacheryo#1234##vip#1000#g#";
		String[] arr = msg.split("#");

		int token = arr.length;
		System.out.println(token);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==================");

		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()]; // 배열생성 countTokens 토큰의 갯수

		int i = 0;
		while (st.hasMoreTokens()) {
			String token2 = st.nextToken();
			System.out.println(token2); // 토큰의 사용 스코프가 제한됨
			tArr[i++] = token2;
		}
		for (int j = 0; j < tArr.length; j++) {
			System.out.println(tArr[j]);
		}

	}

	public void me12() {
		// + 연산자는 문자열에도 적용된다.
		// - 연산자는 문자열에 적용되지 않는다.
		// "hello world"에서
		// "hello "를 잘라내고 "world"만 남게 하고싶을 때
		// substring

		String msg = " hello world";
		msg = msg.trim();
		int msgIdx = msg.indexOf("w");
		String msgSub = msg.substring(msgIdx);
		System.out.println(msgSub);

		// msg = "hello world"; 에서 추출
		// msgSub = "lo wor"; 을 출력
		int idxS = msg.indexOf('l', msg.indexOf('l') + 1); // 시작 인덱스
		int idxEnd = msg.indexOf("r"); // 끝 인덱스
		msgSub = msg.substring(idxS, idxEnd + 1); // idxS는 포함, idxEnd는 미포함
		System.out.println(msgSub);

	}

	public void me111(String msg) {

		msg = msg.trim();
		int msgHafIdx = msg.indexOf(" ");
		String msgHaf21 = msg.substring(msgHafIdx + 1);

		System.out.println(msg);
		System.out.println(msgHaf21);
	}

	public void me11() {
		String msg = "      he      llo         ";
		// 문자열의 좌우 공백 제거, 문자열 중간의 공백은 유지, he llo
		// trim()
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
	}

	public void me10() {
		// 문자열끼리 데이터 값이 같은지 여부를 확인 equals()/ equalsIgnoreCase()
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";

		System.out.println(msg1.equals(msg2)); // true
		System.out.println(msg1.equals(msg3)); // false

		System.out.println(msg1.equalsIgnoreCase(msg3)); // true

	}

	public void me9() {
		// 특정문자열로 시작
		String msg = "hello";
		System.out.println(msg.startsWith("h"));
	}

	public void me8() {
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";

		boolean result1 = msg1.endsWith("jpg"); // msg1은 jpg로 끝나는가?
		boolean result2 = msg2.endsWith(".txt"); // msg2는 .txt로 끝나는가?
		System.out.println(result1 + "  /  " + result2);
	}

	public void me7(String msg) {

		// msg에 "z"가 들어 있는지 검사
		// msg에 가 들어 있나?
		// msg에 "el"가 들어 있나?
		// msg에 "ow"가 들어 있나?
		// contains() or indexOf()

		boolean result = msg.contains("z");
		int idx = msg.indexOf('z');
		System.out.println(result); // false
		System.out.println(idx); // -1

		System.out.println(msg.indexOf('l'));// 2 첫 인덱스
		System.out.println(msg.lastIndexOf('l'));// 9 마지막 인덱스
		System.out.println(msg.indexOf('l', msg.indexOf('l') + 1));// (찾는 문자열, 2번째 찾은 문자열)

		idx = msg.indexOf('l');
		System.out.println(idx); // 2 첫번째

		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx); // 3 두 번째

		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx); // 9 세 번째

	}

	public void me6() {
		String msg = "hello";
		// 문자열의 특정 인덱스에 있는 문자를 알고 싶을 때, charAt()
		// msg의 가장 큰 인덱스에 해당하는 문자 출력
		System.out.println(msg.charAt(msg.length() - 1));

		// msg 문자열의 각 문자를 모두 한 글자씩 모두 출력
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}

	}

	public void me5() {
		String str = "hello";

		// 1.배열의 크기를 알고 싶을 때 호출되는 속성?length
		// 2.문자열의 크기를 알고 싶을 때 사용하는 메서드? length()
		System.out.println(str.length());

		// 3. ArrayList<String> list = new ArrayList();
		// list.size();
	}

	public void me4() {
		StringBuffer sb = new StringBuffer();
		// String클래스는 불변적 성격을 갖고있다.

		String msg = "hello";
		msg = "good";
		/*
		 * hello가 변하지 않고 새로 good이 생긴다. 가비지컬렉터가 삭제하지만 바로 삭제하지 않는다. 문자열이 계속해서 누적되는 경우 msg
		 * =""; msg +="안녕하세요"; msg +="저는 홍길동입니다"; msg +="저는 어디 살고있어요"; msg +=... 누적.
		 * 성능저하가 발생한다 이럴때 StringBuffer를 사용
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

		System.out.println(msg1 == msg2); // false
		System.out.println(msg1 == msg3); // false
		System.out.println(msg3 == msg4); // true
		System.out.println(">>>");
		System.out.println(msg1.equals(msg2)); // true
		System.out.println(msg1.equals(msg3)); // true

	}

	public void me2() {
		// 암시적 객체 생성법(리터럴)
		String msg2 = "hello";
	}

	public void me1() {
		// 명시적 객체 생성법
		String msg = new String("hello");
	}

	public void me0() {
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = "가다나";

		boolean s1EqS2 = s1.equals(s2);
		boolean s1EqS3 = s1.equals(s3);

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
		boolean k2 = false;
		if (a == b) {
			k2 = true;
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
		int[][][] arr3 = { { { 5, 6, 7, 8 } }, { { 9, 0, 1, 2 } }, { { 3, 4, 5, 6 } } };

		int[][] arr20 = { { 5, 6, 7, 8 } };
		int[] arr10 = { 5, 6, 7, 8 };
	}

	public void arrayAdd1(int[] num) {
		for (int i = 0; i < num.length; i++) {

		}

	}

}
