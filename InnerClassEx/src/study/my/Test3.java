package study.my;

public class Test3{
	private String msg;
	public static class StaticInnerClass{
		private int age;
		public void sic() {
			System.out.println("Test3.StaticInnerClass.sic");
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
		System.out.println("test3�� me1");
	}
	
}