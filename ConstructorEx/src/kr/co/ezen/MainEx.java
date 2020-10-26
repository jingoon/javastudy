package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		
		Test1 t2 = new Test1();
		
		t1 = new Test1(); // 기존 new test1(); 과의 연결이 끊김, 시간이 지나면 자동삭제
		
		Test1 t3 = new Test1(34);
		
		Test1 t4 = new Test1(5,5); //t4 = 변수명, 객체명, 레퍼런스
		
		Person kim0 = new Person();
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getAddress());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getJap());
		System.out.println(kim0.getDog());
		
		kim0.setSsn("s01");
		
		
		Person kim1 = new Person("s01", new String("kim"), 44, "서울", "lec", new Dog("개똥이", 55, "개주인"), null);
		Person park = new Person("a12", "박", 31, "서울", "학생", new Dog("멍멍이", 3, "주인박씨"), null);
		park.setAge(99);
		park.getDog().dogInfo();
		
		park.setDog(new Dog("두부", 5, "박씨"));
		park.getDog().setName("잔디");
		String dogName = park.getDog().getName();
		System.out.println(dogName);
		park.getDog().dogInfo();
		kim1.getDog().dogInfo();
		
	}

}
