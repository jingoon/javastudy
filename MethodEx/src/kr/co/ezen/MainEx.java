package kr.co.ezen;

import com.naver.Dog;
import com.naver.MethodTest2;
import com.naver.MethodTest3;

public class MainEx {
	public static void main(String[] args) {
		
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		mt2.sitDown();
		mt2.callName("park");
		mt2.callName("�̼���");
		mt2.printDan(3);
		//mt2.printDanIf(99);
		mt2.printScore(new String("ȫ�浿"), 55);
		mt2.printScore("������", 100);
		
		MethodTest mtTest = new MethodTest();
		mtTest.me2();
		//mtTest.me3("ȫ�浿", 77, 80, 31);
		
		Test12 t12 = new Test12();	//��ü ���� (�ǹ� ����)
		t12.sayHello();
		t12.printScore("�̼���", 100);
		
		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();
		int re3 = mt5.giveMeTheMoney();
		re2 = mt6.giveMeTheMoney();
		
		System.out.println(mt5.giveMeTheMoney());
		System.out.println(re3);
		
		MethodTest3 mt7 = new MethodTest3();
		Test12 re4 = mt7.getTest12();
	
		MethodTest3 mt8 = new MethodTest3();
		int re5 = mt8.getTest13();
	
		
		
		// �⺻ �ڷ��� ��ȯ 8����
		MethodTest3 ttt = new MethodTest3();
		
		boolean tttBoolean = ttt.getBlooean();
		char tttChar = ttt.getChar();
		byte tttByte = ttt.getByte();
		short tttShort = ttt.getShort();
		int tttInt = ttt.getInt();
		long tttLong = ttt.getLong();
		float tttFloat = ttt.getFloat();
		double tttDouble = ttt.getDouble();
		
		System.out.println(tttBoolean);
		System.out.println(tttChar);
		System.out.println(tttByte);
		System.out.println(tttShort);
		System.out.println(tttInt);
		System.out.println(tttLong);
		System.out.println(tttFloat);
		System.out.println(tttDouble);
		
		MethodTest2 mettest2= ttt.getGiveMeTheMoney();
		
		System.out.println(mettest2);
		
		
		Dog d1 = ttt.getDog();
		System.out.println(d1);
		
		
		
		
		
		
		
		
	}

}
