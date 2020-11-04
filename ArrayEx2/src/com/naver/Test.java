package com.naver;

public class Test {

	public void me5() {
		//가변형 배열
		int[][] arr = new int[3][];
		//0 : 1,2,3,4
		//1: 0,2,4
		//2: 1,3,5,7,9
		arr[0]= new int[] {1,2,3,4};
		arr[1]= new int[] {0,2,4};
		arr[2]= new int[] {1,3,5,7,9};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; i++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	public void me4() {
		int[][] arr = new int[3][10];

		// 0: 1~10
		// 1: 0,2,4,6,8,..,18
		// 2: 1,3,5,7,9,..,19
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; i++) {
				if (i == 0) {
					arr[i][j] += 1;
				} else if (i == 1) {
					arr[i][j] *= 2;
				} else {
					arr[i][j] = i * 2 + 1;
				}
			}
		}

	}

	public void me3() {
		int[][] arr1 = { { 4, 1, 0 }, { 4, 1, 8 }, { 4, 7, 1 } };

		String[][] arr2 = { { "good", "oh", "my" }, { "god", "thank", "you" } };

		// 최종 값은 5 ~9 다음 0~9 0~9 순환되면서 배열에 들어감
		// int형 3차원 arr3은 3X1X4크기
		int[][][] arr3 = {
				{ 
						{ 5, 6, 7, 8 },
						},
				{ 
						{ 9, 0, 1, 2 },
						}, 
				{
						{ 3, 4, 5, 6 }
						}

		};

		// arr3의 마지막 index의 요솟값의 1번째 요솟값 출력
		int[] arr30= arr3[arr3.length-1][0];
		arrSysO(arr30);
		System.out.println(">>>>>>>>>>>>");

		// 최종 값은 5 ~9 다음 0~9 0~9 순환되면서 배열에 들어감
		// int형 2차원 배열 arr4는 5x3크기
		int[][] arr4 = { { 5, 6, 7 }, { 8, 9, 0 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// arr4의 [2][1]의 요솟값을 100으로 수정 (가로~~세로~)
		arr4[2][1] = 100;

		// arr4의 3번째 요소값의 최종 요솟값을 구하라.
		for (int i = 0; i < arr4[2].length; i++) {
			int result = arr4[2][i];
			System.out.println(result);
		}
	}

	public void me22() {
		int[][] arr = new int[5][4];

		// arr의 모든 요솟값을 출력.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			// arr의 최종 요솟값을 모두 출력
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

		// arr의 0번 요솟값 의 인덱스가 2인 요소값을 출력
		System.out.println(arr[0][2]);

		// arr의 가장 큰 인덱스의 요소값의 가장 작은 인덱스의 요소값을 100으로 설정
		arr[arr.length - 1][0] = 100;

		// arr의 가장 큰 인덱스의 요소값의 가장 작은 인덱스의 요소값을 출력
		System.out.println(arr[arr.length - 1][0]);

	}

	public void me21() {
		// 최종 요솟값의 자료형이 Dog인 2차원 배열 arr의 크기는 10이고,
		// 그 안에 있는 배열의 크기는 2이다.
		Dog[][] arr = new Dog[10][2];

		// arr의 모든 요소값(arr요소값의 자료형 Dog[])을 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			// arr의 최종 요소값을 모두 출력
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

	public void me2() {
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}

	public void me1() {
		// 2차원 배열
		int[][] arr;
	}

	public void arrSysO(Dog[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}

	public void arrSysO(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void arrSysO(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// String 변수로 이름을 선언하고 #으로 구분한다
	// String 배열에 split("#")으로 나눈 문자열 선언과 대입.
	// Dog 배열을 선언(String배열의 크기(길이)만큼 생성), 
	// Dog 배열의 각 요소의 name(dog 멤버변수)에 String배열의 각 요소를 대입
	// (Dog 배열을 반환하여 각 요소출력 메서드)각 요소의 name을 출력
	public Dog[] me01() {
		String dogName = "진돌이#진순이#개똥이#삽살개#멍멍이#갑순이#흑구#백구";
		String[] dogNames = dogName.split("#");

		Dog[] dogs = new Dog[dogNames.length]; // 배열의 생성? 객체의 생성은 아닌듯

		for (int i = 0; i < dogNames.length; i++) {
			dogs[i] = new Dog(dogNames[i]); // 이거 없으면 NullPointerException
			// dogs[i].setName(dogNames[i]); 이건 나중에 수정 할 때,
		}
		System.out.println(dogs.length);

		return dogs;
	}
	
	public void me02() {
		// 최종 값은 5 ~9 다음 0~9 0~9 순환되면서 배열에 들어감
		// int형 3차원 arr3은 3X1X4크기
		
		// arr3의 마지막 index의 요솟값의 1번째 요솟값 출력
		
		// 최종 값은 5 ~9 다음 0~9 0~9 순환되면서 배열에 들어감
				// int형 2차원 배열 arr4는 5x3크기
		
		// arr4의 [2][1]의 요솟값을 100으로 수정 (가로~~세로~)

		// arr4의 3번째 요소값의 최종 요솟값을 구하라.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
