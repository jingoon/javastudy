package kr.co.ezen;

public class MethodTest {
	
	int a;
	boolean b = true;
	
	public MethodTest() {
		
	}
	
	public void stand() {
		System.out.println("����ȯ(void) ���Ķ�(��ȣ���������)");
	}
	
	public void sleep() {
		System.out.println("public: ���������ڷ� ������Ʈ ��ü���� sleep�޼��尡 ȣ��� �� ������ �ǹ���");
		System.out.println("void: ��ȯ���̶� �ϰ�, ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�.void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		System.out.println("sleep: �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� �� �̸��� ���������ν� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ���");
		System.out.println("(): �Ķ����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �ΰ� �̻��� ���� ,�� �����ڷ� �ؼ� ������");
		System.out.println("{}: �޼����� ����. �޼��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ���");
		
		System.out.println("�޼��� ȣ��: �޼��带 ����ϴ� ���� �ǹ�. ������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");
		
	}
	
	public void sayHello() {
		System.out.println("hello~");
	}
	
	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����");
		sayHello();
	}
	public void callName(String name) {
		
		System.out.println("�ȳ��ϼ���,"+ name);
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
		
		System.out.println(name +" "+ score + "��");
	}
	
	public void me1() {
		System.out.println("����ȯ,���Ķ�");
	}
	public void me2() {
		me1();
	}
	public void me3(String name, int i,int i2, int i3) {
		
		int d= (i+i2+i3)/3;
		
		System.out.println(name + "�� 3���� ��������� "+ d +"�Դϴ�.");
	}
	
	

	
}
