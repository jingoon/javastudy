package kr.co.ezen;


import com.naver.CarRegistManagementService;
import com.naver.DogRegistMenagementServise;

public class MainEx {
	public static void main(String[] args) {
		
		CarRegistManagementService crms = new CarRegistManagementService();
		
		crms.setCarName("k7");
		String carName = crms.getCarName();
		System.out.println(carName);
		
		CarRegistManagementService crms2 = new CarRegistManagementService();
		long result = crms2.add(2100000000, 2100000000);
		System.out.println(result);
		
		DogRegistMenagementServise drms = new DogRegistMenagementServise();
		Dog d1 = drms.makeDog("Happy", 3);
		System.out.println(d1);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println();
		
	}

}
