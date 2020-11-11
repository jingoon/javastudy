package study.my;

public class Test4{
	public void me1() {
		int a=10;
		class LocalInnerClass{
			public void lic() {
				System.out.println("test4.me1.lic로컬");
			}
		}
		LocalInnerClass lic1 = new LocalInnerClass();
		lic1.lic();
	}
	public void me2() {
		//LocalInnerClass lic1 = new LocalInnerClass();
		//lic1.lic();
		
		me1();			//lic를 호출 하려면 me1을 호출해야함
		
	}
	
}