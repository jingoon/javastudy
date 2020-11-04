package com.naver;

public class Test {

	public void me5() {
		//������ �迭
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

		// ���� ���� 5 ~9 ���� 0~9 0~9 ��ȯ�Ǹ鼭 �迭�� ��
		// int�� 3���� arr3�� 3X1X4ũ��
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

		// arr3�� ������ index�� ��ڰ��� 1��° ��ڰ� ���
		int[] arr30= arr3[arr3.length-1][0];
		arrSysO(arr30);
		System.out.println(">>>>>>>>>>>>");

		// ���� ���� 5 ~9 ���� 0~9 0~9 ��ȯ�Ǹ鼭 �迭�� ��
		// int�� 2���� �迭 arr4�� 5x3ũ��
		int[][] arr4 = { { 5, 6, 7 }, { 8, 9, 0 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// arr4�� [2][1]�� ��ڰ��� 100���� ���� (����~~����~)
		arr4[2][1] = 100;

		// arr4�� 3��° ��Ұ��� ���� ��ڰ��� ���϶�.
		for (int i = 0; i < arr4[2].length; i++) {
			int result = arr4[2][i];
			System.out.println(result);
		}
	}

	public void me22() {
		int[][] arr = new int[5][4];

		// arr�� ��� ��ڰ��� ���.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			// arr�� ���� ��ڰ��� ��� ���
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

		// arr�� 0�� ��ڰ� �� �ε����� 2�� ��Ұ��� ���
		System.out.println(arr[0][2]);

		// arr�� ���� ū �ε����� ��Ұ��� ���� ���� �ε����� ��Ұ��� 100���� ����
		arr[arr.length - 1][0] = 100;

		// arr�� ���� ū �ε����� ��Ұ��� ���� ���� �ε����� ��Ұ��� ���
		System.out.println(arr[arr.length - 1][0]);

	}

	public void me21() {
		// ���� ��ڰ��� �ڷ����� Dog�� 2���� �迭 arr�� ũ��� 10�̰�,
		// �� �ȿ� �ִ� �迭�� ũ��� 2�̴�.
		Dog[][] arr = new Dog[10][2];

		// arr�� ��� ��Ұ�(arr��Ұ��� �ڷ��� Dog[])�� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			// arr�� ���� ��Ұ��� ��� ���
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
		// 2���� �迭
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

	// String ������ �̸��� �����ϰ� #���� �����Ѵ�
	// String �迭�� split("#")���� ���� ���ڿ� ����� ����.
	// Dog �迭�� ����(String�迭�� ũ��(����)��ŭ ����), 
	// Dog �迭�� �� ����� name(dog �������)�� String�迭�� �� ��Ҹ� ����
	// (Dog �迭�� ��ȯ�Ͽ� �� ������ �޼���)�� ����� name�� ���
	public Dog[] me01() {
		String dogName = "������#������#������#��찳#�۸���#������#�汸#�鱸";
		String[] dogNames = dogName.split("#");

		Dog[] dogs = new Dog[dogNames.length]; // �迭�� ����? ��ü�� ������ �ƴѵ�

		for (int i = 0; i < dogNames.length; i++) {
			dogs[i] = new Dog(dogNames[i]); // �̰� ������ NullPointerException
			// dogs[i].setName(dogNames[i]); �̰� ���߿� ���� �� ��,
		}
		System.out.println(dogs.length);

		return dogs;
	}
	
	public void me02() {
		// ���� ���� 5 ~9 ���� 0~9 0~9 ��ȯ�Ǹ鼭 �迭�� ��
		// int�� 3���� arr3�� 3X1X4ũ��
		
		// arr3�� ������ index�� ��ڰ��� 1��° ��ڰ� ���
		
		// ���� ���� 5 ~9 ���� 0~9 0~9 ��ȯ�Ǹ鼭 �迭�� ��
				// int�� 2���� �迭 arr4�� 5x3ũ��
		
		// arr4�� [2][1]�� ��ڰ��� 100���� ���� (����~~����~)

		// arr4�� 3��° ��Ұ��� ���� ��ڰ��� ���϶�.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
