package com.naver;

public class Test3 {
	private String msg;
	
	public static class StaticInnerClass{
		private int age;
		
		public void sic() {
			System.out.println("sic");
		//	System.out.println(msg); 
			Test3 t3 = new Test3();
			System.out.println(t3.msg);
		//me1();
			t3.me1();
		}
		public StaticInnerClass() {
			// TODO Auto-generated constructor stub
		}

		public StaticInnerClass(int age) {
			super();
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
	}
	public void me1() {
		
	}

}
