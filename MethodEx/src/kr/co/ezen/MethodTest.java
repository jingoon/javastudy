package kr.co.ezen;

public class MethodTest {
	
	int a;
	boolean b = true;
	
	public MethodTest() {
		
	}
	
	public void stand() {
		System.out.println("무반환(void) 무파람(괄호가비어있음)");
	}
	
	public void sleep() {
		System.out.println("public: 접근제한자로 프로젝트 전체에서 sleep메서드가 호출될 수 있음을 의미함");
		System.out.println("void: 반환형이라 하고, 반환되는 데이터의 자료형을 의미한다.void는 반환되는 데이터가 없다는 것을 의미한다.");
		System.out.println("sleep: 메서드의 이름이고, 나중에 메서드를 호출할 때 그 이름을 적어줌으로써 메서드 본문 안에 있는 코드를 실행하게함");
		System.out.println("(): 파라미터, 매개변수 선언하는 곳으로 마치 변수를 선언하듯 작성하면 됨. 파라미터가 두개 이상일 때는 ,를 구분자로 해서 구분함");
		System.out.println("{}: 메서드의 본문. 메서드 호출 때 실행하고 싶은 코드를 작성함");
		
		System.out.println("메서드 호출: 메서드를 사용하는 것을 의미. 사용법은 메서드명을 적고 소괄호를 칩니다. 그리고 그 소괄호 안에 파라미터의 자료형에 맞는 값을 넣어줍니다.");
		
	}
	
	public void sayHello() {
		System.out.println("hello~");
	}
	
	public void sitDown() {
		System.out.println("그 자리에 즉시 앉음");
		sayHello();
	}
	public void callName(String name) {
		
		System.out.println("안녕하세요,"+ name);
	}
	public void printDanIf(int i) {
		String x="x";
		String e="=";
		for(int n=1;n<=9;n++) {
			System.out.println(i+x+n+e+i*n);
			
		}
	}
	
	public void printDan(int i) {
				
		System.out.println(i+"x"+"1="+i*1);
		System.out.println(i+"x"+"2="+i*2);
		System.out.println(i+"x"+"3="+i*3);
		System.out.println(i+"x"+"4="+i*4);
		System.out.println(i+"x"+"5="+i*5);
		System.out.println(i+"x"+"6="+i*6);
		System.out.println(i+"x"+"7="+i*7);
		System.out.println(i+"x"+"8="+i*8);
		System.out.println(i+"x"+"9="+i*9);
	}
	
	public void printScore(String name, int score) {
		
		System.out.println(name +" "+ score + "점");
	}
	
	public void me1() {
		System.out.println("무반환,무파람");
	}
	public void me2() {
		me1();
	}
	public void me3(String name, int i,int i2, int i3) {
		
		int d= (i+i2+i3)/3;
		
		System.out.println(name + "의 3과목 평균점수는 "+ d +"입니다.");
	}
	
	

	
}
