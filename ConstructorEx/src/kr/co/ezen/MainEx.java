package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		
		Test1 t2 = new Test1();
		
		t1 = new Test1(); // ���� new test1(); ���� ������ ����, �ð��� ������ �ڵ�����
		
		Test1 t3 = new Test1(34);
		
		Test1 t4 = new Test1(5,5); //t4 = ������, ��ü��, ���۷���
		
		Person kim0 = new Person();
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getAddress());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getJap());
		System.out.println(kim0.getDog());
		
		kim0.setSsn("s01");
		
		
		Person kim1 = new Person("s01", new String("kim"), 44, "����", "lec", new Dog("������", 55, "������"), null);
		Person park = new Person("a12", "��", 31, "����", "�л�", new Dog("�۸���", 3, "���ιھ�"), null);
		park.setAge(99);
		park.getDog().dogInfo();
		
		park.setDog(new Dog("�κ�", 5, "�ھ�"));
		park.getDog().setName("�ܵ�");
		String dogName = park.getDog().getName();
		System.out.println(dogName);
		park.getDog().dogInfo();
		kim1.getDog().dogInfo();
		
	}

}
