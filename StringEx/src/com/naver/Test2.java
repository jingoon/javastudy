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

		idx = msg.indexOf('l'); // ù l�� idx
		System.out.println(idx);

		int lastIdx = msg.lastIndexOf('l');
		System.out.println(lastIdx);

		idx = msg.indexOf('l',idx+1);
		System.out.println(idx); // �ι�° l�� idx

		idx = msg.indexOf('l',idx+1);
		System.out.println(idx); // ����° l�� idx

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
		// Ư�� ���ڿ��� ����
		String msg = "hello";

		boolean result = msg.startsWith("h");
		System.out.println(result);
	}

	public void me10() {
		// ���ڿ����� ������ ���� ������ ���� Ȯ��
		// equals(), equalsIgnoerCase
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";

		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equalsIgnoreCase(msg3));
	}

	public void me11() {
		// ���ڿ��� �¿� ��������
		// .trim()
		String msg = "      he       llo       ";
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);

	}

	public void me12() {
		// + �����ڴ� ���ڿ����� ����� -�� �ȵ�
		// "hello world"����
		// "hello "�� �߶󳻰� "world"�� ��ȯ
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
		// Ư�� ���� ���� (delim)�� �̿��Ͽ�
		// ���δٸ� �ǹ̸� ���� �ִ� ���ڿ�(token)�� ����
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
		// ���ڿ��� ������ ǥ��
		// String format(���ڿ�, ��) args ��������
		// %d %s %f %t %c %x %%
		// ǥ���ڸ��� ����: %�ڸ���d
		// ������: %-�ڸ���d
		// �Ҽ��ڸ���: %���ڸ���.�Ҽ��������ڸ���d
		// �Ҽ��� ���� �ڸ����� �ݿø�
		// ,�� ǥ��(ex 1,000��): %,�ڸ���d
		// �ڸ��� ���� �� ������� 0���� ä��: %0�ڸ���d

		String msg = "ȫ�浿" + num[0] + " ���Դϴ�.";
		String msg2 = "ȫ�浿�� %d ���Դϴ�.";
		System.out.println(String.format(msg2, num[0]));

		// �ڸ��� �������� �ٸ��߱�
		String msg3 = "������ 2020��%2d��20�� �Դϴ�.";
		System.out.println(String.format(msg3, num[1]));
		String msg4 = "������ 2020��11��%-4d�� �Դϴ�.";
		System.out.println(String.format(msg4, num[2]));

		// �ݾ׿� ,ǥ��
		String msg5 = "�� ������� %d���Դϴ�.";
		System.out.println(String.format(msg5, num[3]));
		String msg6 = "�� ������� %,d���Դϴ�.";
		System.out.println(String.format(msg6, num[3]));
		String msg7 = "�� ������� %,15d���Դϴ�.";
		System.out.println(String.format(msg7, num[3]));

		// �ڸ����� ������ 0���� ä���
		String msg8 = "�� ���ȣ�� %2d�Դϴ�.";
		System.out.println(String.format(msg8, num[4]));
		String msg9 = "�� ���ȣ�� %02d�Դϴ�.";
		System.out.println(String.format(msg9, num[4]));

		// ���� �Ű�����
		String msg10 = "%d+%d = %d�Դϴ�.";
		System.out.println
		(String.format(msg10, num[5], num[6], num[7]));

		// �Ҽ����� �ڸ���, %ǥ��
		String msg11 = "%5.2f%%�Դϴ�.";
		System.out.println(String.format(msg11, 52.627));
		System.out.println(String.format(msg11, 52.627));

	}

	public void me15() {

		String msg1 = "hello";
		String msg2 = "Hello";
		String msg3 = "HELLO";

		// ��ҹ��ڷ� ����
		String s1 = msg1.toUpperCase();
		System.out.println(s1);
		String s2 = msg2.toLowerCase();
		System.out.println(s2);

	}

}
