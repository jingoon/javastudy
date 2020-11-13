package ListEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListEx {
	public void me1() {
		List<Apple> list = new ArrayList<Apple>();		// 다형성으로 list생성, 자료형이 Apple인 객체만 들어감
		list.add(new Apple());
		ArrayList<Apple> list2 = new ArrayList<Apple>();	// ArrayList는 List를 상속한다. 그래서 부모객체인 List가 객체생성불가
		
		list.add(new Apple());	//추가
		Apple apples = list.get(0);// 첫번째 인덱스 꺼내기
		System.out.println(apples);// 출력
		apples = list.get(list.size()-1);	// 마지막 인덱스 꺼내기
		System.out.println(apples);// 출력
				
		for (int i = 0; i < list.size(); i++) {
			apples = list.get(i);// 모두출력
			System.out.println(apples);
		}
		list.remove(0);// 특정인덱스 삭제
		
		for (int i =list.size()-1;i>=0;i--) {
			list.remove(i);//하나씩 모두 삭제 뒤에서부터*
		}
		
		list.clear();// 한번에 모두 삭제
		
	}
	
	public void me2() {
		List<Integer> list = new ArrayList<Integer>();	//정수형 값이 들어갈 컬렉션프레임워크 List 생성
		list.add(3);	// 원래는 list.add(new Integer(3)); = 기본자료형의 참조자료형(Wrapper클래스) 으로 작성해야하지만
		list.add(4);	// AutoBoxing으로 간단하게 작성
		list.add(5);
		list.add(6);
		
		int a= list.get(0);	// 첫번째 인덱스 추출, AutoUnBoxing으로 Integer a =list.get(0);을 간소하게 작성
		list.get(list.size()-1);	//마지막 인덱스 추출
	}

	public void me3() {
		List<Double> list = new ArrayList<Double>();
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		
	}
	public void me4() {
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		
	}
	public void me5() {
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}));
	}
	public void me6() {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(new HashMap<String, Object>());
		
		for(int i=0; i>list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.get(0);
		list.remove(0);
		list.clear();
		
	}
	public List<MemberDTO> me7() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("m001", "kim", 5));
		list.add(new MemberDTO("m002", "lee", 12));
		list.add(new MemberDTO("m003", "park", 55));
		list.add(new MemberDTO("m004", "choi", 53));
		return list;
	}
	public void me8() {
		List<Apple> list = new ArrayList<Apple>();
		
		list.add(new Apple("a001", "서울", "사과", 1500));
		list.add(new Apple("a002", "대전", "사과", 1000));
		list.add(new Apple("a003", "대구", "사과", 2000));
		list.add(new Apple("a004", "부산", "사과", 3000));
		list.add(new Apple("a005", "의정부", "사과", 5000));
		for (int i = 0; i <list.size(); i++) {
			if (i == 0) {
				continue;
			}
				//list에 있는 사과의 지역:이름 을 모두 출력
				System.out.println(list.get(i));
				//단 idx가 0인 경우 출력제외
				
			
		}
		// 리스트에 있는 객체중 아이디가 a003과 004인 데이터를 삭제
		//모두삭제
		list.remove(new Apple("a004",null,null,0));
		list.remove(new Apple("a003",null,null,0));
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		
	}
	
}
