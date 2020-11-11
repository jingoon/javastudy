package study.my;

import com.naver.Inter1;

public class Test01 {
	public Test01() {
		new Inter1() {
			
			@Override
			public void me1() {
				System.out.println("생성자로 의심스러워");
			}
		}.me1();	//어차피 한번만 쓰고 호출도 안되니 바로사용
	}
	
	public Inter1 ano = new Inter1() { //구현할 interface의 이름과 자료형 빌려옴
		
		@Override
		public void me1() {
			System.out.println("호출 가능 익명?");
			
		}
	};
	
	public void me2() {
		System.out.println("일반 메서드");
	}
}

