package Random.Test;

import java.util.Random;

public class RandomEx {
	public void m1() {
		
		Random r = new Random();
		int num= r.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(num);
		}
		
		
	}
	public void m2(int start, int end) {
		Random r = new Random();
		int num = r.nextInt(end-start+1) + start;
		System.out.println(num);
		
	}

}


