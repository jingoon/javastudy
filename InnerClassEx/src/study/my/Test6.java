package study.my;

public class Test6 {
	public Test6() {	//이거만으로는 호출이 안됨 다른 메서드 필요
		new Inter1() {
			
			@Override
			public void inter() {
				System.out.println("생성자안에서 new inter1() {};");
				
			}
		}.inter();// 1회용 사용
	}
	
	public void me2() {
		System.out.println("me2()는 아무것도 호출하지 않음");
		
	}

}