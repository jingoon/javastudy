package co.naver;

public class MainEx {
	public static void main(String[] args) {
		//System.out.println(i);  지역변수는 선언이후 사용할 수 있다.(해당스코프 안에서)
		
		char c = 'A'+32;				// 아스키코드
		System.out.println(c);
		System.out.println(":::::::::::::");
		
		boolean b = false;
		System.out.println(b);
		System.out.println(":::::::::::::");
		
		long longVa = 3000000000L;
		System.out.println(longVa);
		System.out.println(":::::::::::::");
		
		Dog dog = new Dog();
		System.out.println(":::::::::::::");
		
		int i = 56;
		System.out.println(i);
			
		char ca = 38;
		System.out.println(ca);
		System.out.println("######################");
		
		Test test = new Test();//생성자
	}
	
	

}
