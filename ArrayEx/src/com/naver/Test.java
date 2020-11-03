package com.naver;

public class Test {

	public Test() {
	}

	public void me0() {
	}

	public int[] me01() {
		int[] arr = { 3, 6, 3, 7 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr;
	}

	public void me1() {
		// �ڷ���[] ������ = new �ڷ���[�迭�� ũ��];
		// length�� �迭�� �Ӽ����� �ݺ����� ���� ��, �������� �迭�� ũ�� ��� ���
		// arrInt[] �� �ε����� ���� ����.
		int[] arrInt = new int[4];

		// arrInt�� 0,1,2,3�� �Է�
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}

		// arrInt�� 0,2,4,6�� �Է�
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] *= 2;
		}

		// arrInt�� 1,3,5,7�� �Է�
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 2 + 1;
		}

		System.out.println(arrInt.length);
		System.out.println(">>>");

		arrInt[0] = 100;
		arrInt[1] = 200;
		arrInt[2] = 300;
		arrInt[3] = 400;
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[3]);
		System.out.println("<<<");

		// arrInt�� ���� �ִ� ��� ��Ұ��� for�� �̿��� ���
		System.out.println("**********");
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}

	}

	public void me11() {
		// �迭�� ũ�Ⱑ 100�� StringBuffer���� 1���� �迭 arrSb�� ����
		// arrSb�� �迭 ũ�� ���
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println(":::::::::");
		// arrSb�� 51��°(index 50) ��Ұ� ���
		System.out.println(arrSb[50]);
		StringBuffer sb1 = new StringBuffer();
		// arrSb�� �ε����� 1���� ���� sb1��ü�� ����
		arrSb[1] = sb1;
		System.out.println(":::::::::");
		System.out.println(arrSb.length);

		// arrSb�� ������ �ִ� ��� ��Ұ��� ���
		// ��, ��� ������ �ε����� ū ������ ���
		for (int i = arrSb.length - 1; i >= 0; i--) {
			System.out.println(arrSb[i]);
		}
	}

	public void me12(Dog[] dogs) {
		// Test class�� me12()���� �Ķ���ͷ� �Ѿ�� �迭 �������� ũ�� ���
		System.out.println(dogs.length);
		/*
		 * t1.me12(new Dog[5]); Dog[] arrDog = new Dog[3]; t1.me12(arrDog);
		 */

		// dogs�� ���� ū �ε��� ��Ұ��� null�� ����
		dogs[dogs.length - 1] = new Dog("��");

		// dogs �迭�� �ִ� ��� dog��ü(�����)�� ���
		System.out.println("||||||||||");
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);

		}
		dogs[0] = null;
		// dogs �迭�� �ִ� ��� dog��ü(�����)�� �̸��� ���
		for (int i = 0; i < dogs.length; i++) {

			// String dogName =dogs[i].getName();
			// System.out.println(dogName);

			// ***** �ٽ� �غ��� ***

			// Dog dog = dogs[i];
			if (dogs[i] == null) {
				continue;
			} else {
				String name = dogs[i].getName();
				System.out.println(name);
			}
			dogs[1].setName("����2");
			System.out.println(dogs[1].getName());

		}

	}

	public void me13() {
		// data.split("#")�� ��ȯ���� arrData�� �ް�
		// arrData�� ũ�⸦ ���
		String data = "reacheryo#1#seoul#226#-1";
		String[] arrData = data.split("#");

		// #�� �������� 1���� �迭�� ������
		System.out.println(arrData.length);
		arrData[arrData.length - 1] = "100";
		arrData[0] = "ezen";
		System.out.println("+++++++++++++");
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		// arrData�� ��� ��Ұ� ���
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		// arrData�� ��� ��Ұ� ù���� ��� charAt(index)���
		for (int i = 0; i < arrData.length; i++) {
			String msg = arrData[i];
			char c = msg.charAt(0);
			System.out.println(c);
			// System.out.println(arrData[i].charAt(0));
		}

	}

	public void me2() {
		// �迭 ����2, ũ�⸦ ���
		// 2. �ڷ���[] �迭�� = {��1,��2,��3....};
		int[] arrInt = { 1, 4, 6 };
		System.out.println(arrInt.length);
		System.out.println();
		// 2��° ��Ұ�
		System.out.println(arrInt[1]);
		// �ε����� 1�� ��Ұ� ����
		arrInt[1] = 333;
		// arrInt�� ������ �ִ� ��� ��Ұ� ���
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		// arrInt�� ������ �ִ� ��� ��Ұ� ���.
		// ��, �ε���1�� ��Ұ� ��±���
		for (int i = 0; i < arrInt.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(arrInt[i]);
		}

		// arrInt�� ������ �ִ� ��� ��Ұ� ���.
		// ��, ��Ұ��� 6�̸� ��±���
		for (int i = 0; i < arrInt.length; i++) {
			int num = arrInt[i];
			if (num == 6) {
				continue;
			}
			System.out.println(num);

		}

	}

	public void me21() {
		// �ڷ����� Dog�� 1���� �迭 arrDog�� ����(�ι�° ���)
		// �迭�� ũ��� 2, �迭�� ũ�� ���
		Dog[] arrDog = { new Dog(), new Dog() };
		// or
		// Dog a = new Dog();
		// Dog b = new Dog();
		// Dog[] arrDog2 = {a,b};

		System.out.println(arrDog.length);
		// arrdog�� ���� ū �ε����� ��Ұ��� null�� ����
		arrDog[arrDog.length - 1] = null;

		// arrDog�� ��� ��Ұ��� ����Ͻÿ�
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		// arrDog�� �ε����� 1�� ��Ұ��� name�� ���.
		// ��, �ش� ��Ұ��� null�� �ƴ� ��쿡��
		if (arrDog[1] != null) {
			String dogName = arrDog[1].getName();
			System.out.println(dogName);
		}
	}

	public void me22(String[] arrStr) {
		// arrStr�� ũ��(length)�� ���
		// ���ο��� ȣ��
		System.out.println(arrStr.length);

		// arrStr index�� 1�� ���� ���� "12"�� ����
		arrStr[1] = "12";
		// arrStr�� index�� 1�� ���� ���� ���
		// ������ �迭�� ��
		String s1 = arrStr[1];
		System.out.println(s1);

		int[][] arr2Int = { { 1, 3, 5, 7 }, { 0, 2, 3, 6 } };
		int[] arr0 = arr2Int[0];
		int arr01 = arr0[1];
		int arr0arr1 = arr2Int[0][1];
		// arr01 == arr0arr1

		// 1���� �迭�� ��
		System.out.println(arrStr[1]);

	}

	public void me3() {
		// 3��° �迭 ���� ���
		int[] arrInt = new int[] { 1, 2, 3, 4 };
		System.out.println(arrInt.length);

	}

	public void me31() {
		// 3��° ������� arrFloat ����
		// �� = 3.14, 4.2, 9.8
		float[] arrFloat = new float[] { 3.14f, 4.2f, 9.8f };
		System.out.println(arrFloat.length);
	}

	public void me32(Dog[] dogs) {
		// dogs�� ũ�⸦ int�� ������ �����ϰ� ���
		int size = dogs.length;
		System.out.println(size);
	}

	/////////////////////////////////////////////
	public void i1() {
		int[] iArry1 = new int[3];
		int[] iArry2 = { 3, 7, 2 };
		int[] iArry3 = new int[] { 3, 7, 8 };

		System.out.println(iArry1.length);
		int size = iArry2.length;
		System.out.println(size);

		iArry3[iArry3.length - 1] = 99;
	}

	public Car[] cars() {
		Car[] cars1 = new Car[5];
		Car[] cars2 = { new Car(), new Car(), new Car() };
		Car[] cars3 = new Car[] { new Car(), new Car() };

		int size = cars1.length;
		System.out.println(size);

		return cars2;
	}

	public void i2(Car[] cars) {
		System.out.println(cars.length);
		Car k7 = new Car();
		cars[0] = k7;

	}

	public void i3() {
		String data = "abc#bcd#efg#123#456#789#=`-1";
		String[] arrData = data.split("#");
		// String[] data = new String[] { , ,....};

		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}

	}

	public void i4(Car[] car) {
		car[0] = null;
		System.out.println(car.length);
		for (int i = 0; i < car.length; i++) {
			if (car[i] == null) {
				continue;
			}
			System.out.println(car[i]);
			System.out.println(car[i].getCarName());
		}

	}

	public void i5() {
		String dataCar = "1����#2����#3����#4����#5����";
		String[] arrDataCar = dataCar.split("#");
		System.out.println(arrDataCar.length);
		arrDataCar[1] = null;
		for (int i = 0; i < arrDataCar.length; i++) {
			if (arrDataCar[i] == null) {
				continue;
			}

			System.out.println(arrDataCar[i]);

		}

	}

	public void pibo() {
		

	}
	//////////////////////////////////////

}
