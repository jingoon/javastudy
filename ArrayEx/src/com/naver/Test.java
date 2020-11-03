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
		// 자료형[] 변수명 = new 자료형[배열의 크기];
		// length는 배열의 속성으로 반복문을 돌릴 때, 직접적인 배열의 크기 대신 사용
		// arrInt[] 각 인덱스에 정수 대입.
		int[] arrInt = new int[4];

		// arrInt에 0,1,2,3을 입력
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}

		// arrInt에 0,2,4,6을 입력
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] *= 2;
		}

		// arrInt에 1,3,5,7을 입력
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

		// arrInt가 갖고 있는 모든 요소값을 for를 이용해 출력
		System.out.println("**********");
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}

	}

	public void me11() {
		// 배열의 크기가 100인 StringBuffer형의 1차월 배열 arrSb를 생성
		// arrSb의 배열 크기 출력
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println(":::::::::");
		// arrSb의 51번째(index 50) 요소값 출력
		System.out.println(arrSb[50]);
		StringBuffer sb1 = new StringBuffer();
		// arrSb의 인덱스가 1번인 곳에 sb1객체를 대입
		arrSb[1] = sb1;
		System.out.println(":::::::::");
		System.out.println(arrSb.length);

		// arrSb가 가지고 있는 모든 요소값을 출력
		// 단, 출력 순서는 인덱스가 큰 값부터 출력
		for (int i = arrSb.length - 1; i >= 0; i--) {
			System.out.println(arrSb[i]);
		}
	}

	public void me12(Dog[] dogs) {
		// Test class의 me12()에서 파라미터로 넘어온 배열 데이터의 크기 출력
		System.out.println(dogs.length);
		/*
		 * t1.me12(new Dog[5]); Dog[] arrDog = new Dog[3]; t1.me12(arrDog);
		 */

		// dogs의 가장 큰 인덱스 요소값을 null로 설정
		dogs[dogs.length - 1] = new Dog("널");

		// dogs 배열에 있는 모든 dog객체(모든요소)를 출력
		System.out.println("||||||||||");
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);

		}
		dogs[0] = null;
		// dogs 배열에 있는 모든 dog객체(모든요소)의 이름를 출력
		for (int i = 0; i < dogs.length; i++) {

			// String dogName =dogs[i].getName();
			// System.out.println(dogName);

			// ***** 다시 해보기 ***

			// Dog dog = dogs[i];
			if (dogs[i] == null) {
				continue;
			} else {
				String name = dogs[i].getName();
				System.out.println(name);
			}
			dogs[1].setName("독스2");
			System.out.println(dogs[1].getName());

		}

	}

	public void me13() {
		// data.split("#")의 반환값을 arrData로 받고
		// arrData의 크기를 출력
		String data = "reacheryo#1#seoul#226#-1";
		String[] arrData = data.split("#");

		// #을 기준으로 1차형 배열로 나눠짐
		System.out.println(arrData.length);
		arrData[arrData.length - 1] = "100";
		arrData[0] = "ezen";
		System.out.println("+++++++++++++");
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		// arrData의 모든 요소값 출력
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		// arrData의 모든 요소값 첫글자 출력 charAt(index)사용
		for (int i = 0; i < arrData.length; i++) {
			String msg = arrData[i];
			char c = msg.charAt(0);
			System.out.println(c);
			// System.out.println(arrData[i].charAt(0));
		}

	}

	public void me2() {
		// 배열 생성2, 크기를 출력
		// 2. 자료형[] 배열명 = {값1,값2,값3....};
		int[] arrInt = { 1, 4, 6 };
		System.out.println(arrInt.length);
		System.out.println();
		// 2번째 요소값
		System.out.println(arrInt[1]);
		// 인덱스가 1인 요소값 수정
		arrInt[1] = 333;
		// arrInt가 가지고 있는 요든 요소값 출력
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		// arrInt가 가지고 있는 모든 요소값 출력.
		// 단, 인덱스1인 요소값 출력금지
		for (int i = 0; i < arrInt.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(arrInt[i]);
		}

		// arrInt가 가지고 있는 모든 요소값 출력.
		// 단, 요소값이 6이면 출력금지
		for (int i = 0; i < arrInt.length; i++) {
			int num = arrInt[i];
			if (num == 6) {
				continue;
			}
			System.out.println(num);

		}

	}

	public void me21() {
		// 자료형이 Dog인 1차원 배열 arrDog를 생성(두번째 방법)
		// 배열의 크기는 2, 배열의 크기 출력
		Dog[] arrDog = { new Dog(), new Dog() };
		// or
		// Dog a = new Dog();
		// Dog b = new Dog();
		// Dog[] arrDog2 = {a,b};

		System.out.println(arrDog.length);
		// arrdog의 가장 큰 인덱스의 요소값을 null로 수정
		arrDog[arrDog.length - 1] = null;

		// arrDog의 모든 요소값을 출력하시오
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		// arrDog의 인덱스가 1인 요소값의 name을 출력.
		// 단, 해당 요소값이 null이 아닌 경우에만
		if (arrDog[1] != null) {
			String dogName = arrDog[1].getName();
			System.out.println(dogName);
		}
	}

	public void me22(String[] arrStr) {
		// arrStr의 크기(length)를 출력
		// 메인에서 호출
		System.out.println(arrStr.length);

		// arrStr index가 1인 곳의 값을 "12"로 변경
		arrStr[1] = "12";
		// arrStr의 index가 1인 곳의 값을 출력
		// 다차원 배열일 때
		String s1 = arrStr[1];
		System.out.println(s1);

		int[][] arr2Int = { { 1, 3, 5, 7 }, { 0, 2, 3, 6 } };
		int[] arr0 = arr2Int[0];
		int arr01 = arr0[1];
		int arr0arr1 = arr2Int[0][1];
		// arr01 == arr0arr1

		// 1차원 배열일 때
		System.out.println(arrStr[1]);

	}

	public void me3() {
		// 3번째 배열 생성 방법
		int[] arrInt = new int[] { 1, 2, 3, 4 };
		System.out.println(arrInt.length);

	}

	public void me31() {
		// 3번째 방법으로 arrFloat 생성
		// 값 = 3.14, 4.2, 9.8
		float[] arrFloat = new float[] { 3.14f, 4.2f, 9.8f };
		System.out.println(arrFloat.length);
	}

	public void me32(Dog[] dogs) {
		// dogs의 크기를 int형 변수명에 대입하고 출력
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
		String dataCar = "1번차#2번차#3번차#4번차#5번차";
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
