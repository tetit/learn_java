package myProject.bro;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		System.out.println(x);
		
		double y = random.nextDouble();
		System.out.println(y);
		System.out.println(y);
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		System.out.println(z);




	}

}
