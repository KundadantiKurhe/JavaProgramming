package SDET_QA;

import java.util.Random;

public class RandomNumbersAndStrings {

	public static void main(String[] args) {
	
		Random rand  = new Random();
		int num = rand.nextInt(999);
		System.out.println(num);
		
		// Approch 2
		System.out.println(Math.random());
		
		// Approch 3
		
	//	String randm= RandomStringUtils.randomNumric(5);
	//	System.out.println(randm);
		
		
	//	String ranstr = RandomStringUtils.randomAlphabetic(10);
	//	System.out.println(ranstr);
		
	}
}
