package study.my;

public class Test2{
	private String msg;
	public Test2() {
		// TODO Auto-generated constructor stub
	}
	public class MemberClass{
		//��� ���� Ŭ����
		private int age;
		public void mc1() {
			System.out.println("Test2�� MemberClass�� mc1�Դϴ�");
		}
		public MemberClass() {
			// TODO Auto-generated constructor stub
		}
		public MemberClass(int age) {
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
		System.out.println("Test2�� me1�Դϴ�");
	}
}
