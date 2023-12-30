package SDET_QA;

import java.util.Scanner;

public class CheckNumberPrimeOrNot {
	//		2,3,5,7,11,13,17......
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		if(num > 1)
		{
			for(int i = 1 ; i <= num ; i++)
			{
				if(num%i == 0) {
					count++;
				}
			}
			
			if(count == 2)
			{
				System.out.println("Its a prime number");
			}
			else {
				System.out.println("Its a Not prime number");

			}
		}
		else
		{
			System.out.println("Not prime number");
		}		
	}
}
