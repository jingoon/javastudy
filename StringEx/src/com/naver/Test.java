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
		// ���ڿ��� ���ڸ� +������ ������� �ʰ� ǥ���ϴ� ���
		// String.format(���ڿ�,��)
		// %d�� ����, %s���ڿ�, %f�Ǽ�, %t��¥, %c, %x, %%...
		// ǥ�� �ڸ��� ����: %�ڸ���d
		// %5.2f: �Ҽ��� �� �ڸ����� �Ѿ�� �ݿø� �Ѵ�
		// ,�� ǥ��: %,�ڸ���d
		// ������: $-�ڸ���d
		// �ڸ��� ���� �� �� ������ 0���� ä��� ������: %0�ڸ���d
		
		String msg = "ȫ�浿�� " + age + " ���Դϴ�.";
		System.out.println(msg);

		String msg2 = "ȫ�浿�� %d ���Դϴ�.";
		System.out.println(String.format(msg2, age));

		//2020��  3�� 20��
		//2020�� 11��  5��
		// �� ���߱� ���� ���� �ڸ� �� ����
		int month = 3;
		String msg3 = "������ 2020��%2d��20�� �Դϴ�.";			//2ĭ �Ҵ�
		System.out.println(String.format(msg3, month)); 
		int date = 5;
		String msg4 = "������ 2020��11��%-2d���Դϴ�.";			//2ĭ �Ҵ� ���� ����
		System.out.println(String.format(msg4, date));	
		
		// �ݾ� ǥ�� 1,000;
		int money =1000;
		String msg5 ="�� ������� %d���Դϴ�.";
		System.out.println(String.format(msg5, money));
		
		String msg6 ="�� ������� %,d���Դϴ�.";
		System.out.println(String.format(msg6, money));
		
		String msg7 = "�� ������� %,15d ���Դϴ�.";
		System.out.println(String.format(msg7, money));
		
		// �ڸ����� �������ְ�, �̸� �� ��ä���� �� ���� ������ 0���� ä���
		// �ڸ����� 5, ���ڰ� 11�̸� -> 00011
		String msg8 = "�� ���ȣ�� %2d�Դϴ�.";
		System.out.println(String.format(msg8, 7));
		
		String msg9 = "�� ���ȣ�� %02d�Դϴ�.";
		System.out.println(String.format(msg9, 7));
		
		String msg10 = "%d + %d = %d�Դϴ�.";
		System.out.println(String.format(msg10, 3,4,3+4));
		
		String msg11 = "%07.2f%%�Դϴ�.";			
		// .�տ��� %f�� ǥ�� �ڸ����� ��ĭ�� ���� .�ڿ��� 2�ڸ�(�������� �ݿø�)
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
		// Ư�����ع���(delim)�� �̿��Ͽ�
		//���δٸ� �ǹ̸� ���� �ִ� ���ڿ�(=token)�� ����
		String msg = "teacheryo#1234##vip#1000#g#";
		String[] arr = msg.split("#");

		int token = arr.length;
		System.out.println(token);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==================");

		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()]; // �迭���� countTokens ��ū�� ����

		int i = 0;
		while (st.hasMoreTokens()) {
			String token2 = st.nextToken();
			System.out.println(token2); // ��ū�� ��� �������� ���ѵ�
			tArr[i++] = token2;
		}
		for (int j = 0; j < tArr.length; j++) {
			System.out.println(tArr[j]);
		}

	}

	public void me12() {
		// + �����ڴ� ���ڿ����� ����ȴ�.
		// - �����ڴ� ���ڿ��� ������� �ʴ´�.
		// "hello world"����
		// "hello "�� �߶󳻰� "world"�� ���� �ϰ���� ��
		// substring

		String msg = " hello world";
		msg = msg.trim();
		int msgIdx = msg.indexOf("w");
		String msgSub = msg.substring(msgIdx);
		System.out.println(msgSub);

		// msg = "hello world"; ���� ����
		// msgSub = "lo wor"; �� ���
		int idxS = msg.indexOf('l', msg.indexOf('l') + 1); // ���� �ε���
		int idxEnd = msg.indexOf("r"); // �� �ε���
		msgSub = msg.substring(idxS, idxEnd + 1); // idxS�� ����, idxEnd�� ������
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
		// ���ڿ��� �¿� ���� ����, ���ڿ� �߰��� ������ ����, he llo
		// trim()
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
	}

	public void me10() {
		// ���ڿ����� ������ ���� ������ ���θ� Ȯ�� equals()/ equalsIgnoreCase()
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";

		System.out.println(msg1.equals(msg2)); // true
		System.out.println(msg1.equals(msg3)); // false

		System.out.println(msg1.equalsIgnoreCase(msg3)); // true

	}

	public void me9() {
		// Ư�����ڿ��� ����
		String msg = "hello";
		System.out.println(msg.startsWith("h"));
	}

	public void me8() {
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";

		boolean result1 = msg1.endsWith("jpg"); // msg1�� jpg�� �����°�?
		boolean result2 = msg2.endsWith(".txt"); // msg2�� .txt�� �����°�?
		System.out.println(result1 + "  /  " + result2);
	}

	public void me7(String msg) {

		// msg�� "z"�� ��� �ִ��� �˻�
		// msg�� �� ��� �ֳ�?
		// msg�� "el"�� ��� �ֳ�?
		// msg�� "ow"�� ��� �ֳ�?
		// contains() or indexOf()

		boolean result = msg.contains("z");
		int idx = msg.indexOf('z');
		System.out.println(result); // false
		System.out.println(idx); // -1

		System.out.println(msg.indexOf('l'));// 2 ù �ε���
		System.out.println(msg.lastIndexOf('l'));// 9 ������ �ε���
		System.out.println(msg.indexOf('l', msg.indexOf('l') + 1));// (ã�� ���ڿ�, 2��° ã�� ���ڿ�)

		idx = msg.indexOf('l');
		System.out.println(idx); // 2 ù��°

		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx); // 3 �� ��°

		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx); // 9 �� ��°

	}

	public void me6() {
		String msg = "hello";
		// ���ڿ��� Ư�� �ε����� �ִ� ���ڸ� �˰� ���� ��, charAt()
		// msg�� ���� ū �ε����� �ش��ϴ� ���� ���
		System.out.println(msg.charAt(msg.length() - 1));

		// msg ���ڿ��� �� ���ڸ� ��� �� ���ھ� ��� ���
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}

	}

	public void me5() {
		String str = "hello";

		// 1.�迭�� ũ�⸦ �˰� ���� �� ȣ��Ǵ� �Ӽ�?length
		// 2.���ڿ��� ũ�⸦ �˰� ���� �� ����ϴ� �޼���? length()
		System.out.println(str.length());

		// 3. ArrayList<String> list = new ArrayList();
		// list.size();
	}

	public void me4() {
		StringBuffer sb = new StringBuffer();
		// StringŬ������ �Һ��� ������ �����ִ�.

		String msg = "hello";
		msg = "good";
		/*
		 * hello�� ������ �ʰ� ���� good�� �����. �������÷��Ͱ� ���������� �ٷ� �������� �ʴ´�. ���ڿ��� ����ؼ� �����Ǵ� ��� msg
		 * =""; msg +="�ȳ��ϼ���"; msg +="���� ȫ�浿�Դϴ�"; msg +="���� ��� ����־��"; msg +=... ����.
		 * �������ϰ� �߻��Ѵ� �̷��� StringBuffer�� ���
		 */
		sb.append("�ȳ��ϼ���");
		sb.append("���� ȫ�浿�Դϴ�");
		sb.append("���� ��� ����־��");
		msg = sb.toString(); // sb�� String������ ������ �ش�.
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
		// �Ͻ��� ��ü ������(���ͷ�)
		String msg2 = "hello";
	}

	public void me1() {
		// ����� ��ü ������
		String msg = new String("hello");
	}

	public void me0() {
		String s1 = "������";
		String s2 = "������";
		String s3 = "���ٳ�";

		boolean s1EqS2 = s1.equals(s2);
		boolean s1EqS3 = s1.equals(s3);

		StringBuffer sb = new StringBuffer();
		sb.append(false);
		sb.append('c');
		sb.append("������ ");
		sb.append("   *    ");

		String sb2 = sb.toString();
		System.out.println(sb2);

		System.out.println(s1EqS2);
		System.out.println(s1EqS3);

		System.out.println(sb);
	}

	public void me01() {
		StringBuffer sb = new StringBuffer();
		sb.append("�»��� ");
		sb.append("�����ϵ� ");
		sb.append("�ϴþƷ� ");
		sb.append("���̰Ŵ� ");
		sb.append("������ �� ������ ");
		sb.append("�� ������ ");
		sb.append("���Ǹ��� ");
		sb.append("����� �� �ƴ� ������ ");
		sb.append("���� ���� �ϴ��� ");

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
		sb.append("== ������:\t");
		sb.append(a);
		sb.append("�� ");
		sb.append(b);
		sb.append("�� ");
		sb.append(k2);

		StringBuffer sb2 = new StringBuffer();
		sb2.append("eqauls ������:\t");
		sb2.append(a);
		sb2.append("�� ");
		sb2.append(b);
		sb2.append("�� ");
		sb2.append(k);
		String sb3 = sb2.toString();

		System.out.println(sb);
		System.out.println(sb3);
		System.out.println();

	}

	// ���� ���� 5 ~9 ���� 0~9 0~9 ��ȯ�Ǹ鼭 �迭�� ��
	// int�� 3���� arr3�� 3X1X4ũ��
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
