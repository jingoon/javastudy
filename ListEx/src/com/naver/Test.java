package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public void me1() {
		List<Apple> list = new ArrayList<Apple>(); // 자료형이 Apple인 객체만 들어감
		list.add(new Apple());

		Apple iphone12 = list.get(0); // 상자에서 사과꺼내기

		// list에 들어있는 모든 요소값을 출력

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public void me2() {
		// list객체를 만들어주세요. 단, 제네릭 타입은 3,4,5,6을 입력할 수 있게
		List<Integer> list = new ArrayList<Integer>();
		//정수형 값이 들어갈 컬렉션프레임워크 List 생성
		list.add(new Integer(3));
		list.add(new Integer(4));
		// 원래는 list.add(new Integer(4)); = 기본자료형의 참조자료형(Wrapper클래스) 으로 작성해야하지만
		list.add(5); // AutoBoxing으로 간단하게 작성
		list.add(6);

		//AutoUnBoxing으로 Integer a =list.get(0);을 간소하게 작성
		int a= list.get(0);	// 첫번째 인덱스 추출
		list.get(list.size()-1);	//마지막 인덱스 추출

		for (int i = 0; i < list.size(); i++) { // 모든 요소 출력
			int num2 = list.get(i);
			System.out.println(num2);
		}

		list.set(1, 100); // 특정인덱스 값 변경
		System.out.println(list);

		// list.remove(new Integer(100)); // 값을 가진 객체를 삭제함
		// list.remove(1); //삭제후 빈자리를 뒤에 인덱스가 채운다.
		// list.remove(2);
		list.remove(2); // 큰 인덱스~ 작은 인덱스 순으로 삭제해야 의도되로 삭제됨
		list.remove(1);
		System.out.println(list); // list를 sysout하면 이쁘게 출력됨

	}

	public void me3() {
		// list 객체를 만드세요. 단, 3.5, 4.1, 9.8을 입력
		List<Double> list = new ArrayList<Double>();
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);

		double num = list.get(1);

		for (int i = 0; i < list.size(); i++) {
			num = list.get(i);
			System.out.println(num);
		}

		list.set(list.size() - 1, 1.1); // 마지막 요소값의 변경

		// list에 있는 데이러틑 반복문을 이용해서 전부 삭제
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}

	}

	public void me4() {
		// list 객체를 만드세요 단, new StringBuffer()를 담을 수 있음.
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());

		// list에 들어있는 모든 데이터를 출력하세요 -> 모든데이터 == 반복문을 사용
		for (int i = 0; i < list.size(); i++) { // length, size
			StringBuffer sb = list.get(i);
			System.out.println(sb);
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			list.get(i);
		}

	}

	public void me5() {
		// list 객체 만드세요. 단, thread를 담을 수 있음
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread());
		list.add(new Thread(new Runnable() { // 익명의 내부클래스

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		}));

		for (int i = 0; i < list.size(); i++) {
			Thread t = list.get(i);
			System.out.println(t);
		}

	}

	public void me6() {
		// list 객체를 만드시오. 단, Map<String, Object>를 담을 수 있음
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		list.add(new HashMap<String, Object>());

		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> mso = list.get(i);
			System.out.println(mso);
		}

		list.clear(); // 모두 삭제, 상자는 남아있음

	}
	public List<MemberDTO> me7() {
		//main()에서 me7호출 ,반환되는 데이터중 두번째 객체의 이름 출력
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m001","kim",5));
		list.add(new MemberDTO("m002","lee",12));
		list.add(new MemberDTO("m003","park",53));
		list.add(new MemberDTO("m004","kang",55));
		list.add(new MemberDTO("m005","choi",11));
		
		list.set(0, new MemberDTO("m001","han",7));
		list.remove(new MemberDTO(null, null, 55));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}
	public void me8() {
		List<Apple> list = new ArrayList<Apple>();
		
		list.add(new Apple("a001","대구","사과1",1500));
		list.add(new Apple("a002","대전","사과2",2000));
		list.add(new Apple("a005","청송","사과5",1000));
		list.add(new Apple("a003","서울","사과3",3000));
		list.add(new Apple("a004","부산","사과4",2500));
		System.out.println(">>>>>>>>>>>>>>>>>");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(">>>>>>>>>>>>>>>>>");
		
		//list에 있는 사과의 지역:이름 을 모두 출력
		for (int j = 0; j < list.size(); j++) {
			Apple ap =list.get(j);
			System.out.println(ap);
		}
		//단 idx가 0인 경우 출력제외
		System.out.println();
		for (int j = 0; j < list.size(); j++) {
			Apple ap =list.get(j);
			if(j == 0){
				continue;
			}
			System.out.println(ap);
		}
		// 리스트에 있는 객체중 아이디가 a003과 004인 데이터를 삭제
		
		list.remove(new Apple("a003", null, null, 0));
		list.remove(new Apple("a004", null, null, 0));
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
	
		
	}

}
