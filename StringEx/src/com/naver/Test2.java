package com.naver;

import java.util.StringTokenizer;

public class Test2 {

	public void me5() {
		String msg = "hello";
		System.out.println(msg.length());
	}

	public void me6() {
		String msg = "hello";
		System.out.println(msg.charAt(msg.length() - 1));
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}

	public String hello() {
		String hello = "hello";
		return hello;
	}

	public void me7(String msg) {
		boolean result = msg.contains("he");
		int idx = msg.indexOf('k');
		System.out.println(result); // true
		System.out.println(idx); // -1

		idx = msg.indexOf('l'); // 첫 l의 idx
		System.out.println(idx);

		int lastIdx = msg.lastIndexOf('l');
		System.out.println(lastIdx);

		idx = msg.indexOf('l',idx+1);
		System.out.println(idx); // 두번째 l의 idx

		idx = msg.indexOf('l',idx+1);
		System.out.println(idx); // 세번째 l의 idx

	}

	public void me8() {

		String msg1 = "abcd.jpg";
		String msg2 = "defg.txt";
		boolean result1 = msg1.endsWith("jpg");
		boolean result2 = msg2.endsWith("txt");
		System.out.println(result1);
		System.out.println(result2);

	}

	public void me9() {
		// 특정 문자열로 시작
		String msg = "hello";

		boolean result = msg.startsWith("h");
		System.out.println(result);
	}

	public void me10() {
		// 문자열끼리 데이터 값이 같은지 여부 확인
		// equals(), equalsIgnoerCase
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";

		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equalsIgnoreCase(msg3));
	}

	public void me11() {
		// 문자열의 좌우 공백제거
		// .trim()
		String msg = "      he       llo       ";
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);

	}

	public void me12() {
		// + 연산자는 문자열에도 적용됨 -는 안됨
		// "hello world"에서
		// "hello "를 잘라내고 "world"를 반환
		// substring
		String msg = " hello world";
		msg = msg.trim();
		int idxS = msg.indexOf("w");
		String sub = msg.substring(idxS);
		System.out.println(sub);
		// sub = "lo wor";
		idxS = msg.indexOf("l");
		idxS = idxS + 1;
		int idxE = msg.indexOf("r");
		idxE = idxE + 1;
		sub = msg.substring(idxS, idxE);
		System.out.println(sub);

	}

	public void me13() {
		// 특정 기준 문자 (delim)을 이용하여
		// 서로다른 의미를 갖고 있는 문자열(token)을 분할
		String msg = "String#Tokenizer#new#st.#";
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] arr = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i++] = st.nextToken();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}

	public void me14(Object... num) {
		// 문자열과 숫자의 표현
		// String format(문자열, 값) args 가변인자
		// %d %s %f %t %c %x %%
		// 표현자릿수 지정: %자릿수d
		// 좌정렬: %-자릿수d
		// 소수자릿수: %총자릿수.소수점이하자리수d
		// 소수점 이하 자릿수는 반올림
		// ,의 표현(ex 1,000원): %,자릿수d
		// 자릿수 지정 후 빈공간을 0으로 채움: %0자릿수d

		String msg = "홍길동" + num[0] + " 살입니다.";
		String msg2 = "홍길동은 %d 살입니다.";
		System.out.println(String.format(msg2, num[0]));

		// 자릿수 공백포함 줄마추기
		String msg3 = "오늘은 2020년%2d월20일 입니다.";
		System.out.println(String.format(msg3, num[1]));
		String msg4 = "오늘은 2020년11월%-4d일 입니다.";
		System.out.println(String.format(msg4, num[2]));

		// 금액에 ,표기
		String msg5 = "내 전재산은 %d원입니다.";
		System.out.println(String.format(msg5, num[3]));
		String msg6 = "내 전재산은 %,d원입니다.";
		System.out.println(String.format(msg6, num[3]));
		String msg7 = "내 전재산은 %,15d원입니다.";
		System.out.println(String.format(msg7, num[3]));

		// 자릿수의 공백을 0으로 채우기
		String msg8 = "내 등번호는 %2d입니다.";
		System.out.println(String.format(msg8, num[4]));
		String msg9 = "내 등번호는 %02d입니다.";
		System.out.println(String.format(msg9, num[4]));

		// 가변 매개변수
		String msg10 = "%d+%d = %d입니다.";
		System.out.println
		(String.format(msg10, num[5], num[6], num[7]));

		// 소수점의 자리수, %표현
		String msg11 = "%5.2f%%입니다.";
		System.out.println(String.format(msg11, 52.627));
		System.out.println(String.format(msg11, 52.627));

	}

	public void me15() {

		String msg1 = "hello";
		String msg2 = "Hello";
		String msg3 = "HELLO";

		// 대소문자로 변경
		String s1 = msg1.toUpperCase();
		System.out.println(s1);
		String s2 = msg2.toLowerCase();
		System.out.println(s2);

	}

}
