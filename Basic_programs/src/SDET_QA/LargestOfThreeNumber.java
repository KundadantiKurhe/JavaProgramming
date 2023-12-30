package SDET_QA;

import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter first number ");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number ");
		int num2 = sc.nextInt();
		
		System.out.println("enter third number ");
		int num3 = sc.nextInt();

		// 1 way
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is largest number : " + num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("num2 is largest number : " + num2);
		}
		else
		{
			System.out.println("num3 is largest number : " + num3);
		}
		
		
		// 2  approch
		
		 
	} 
}
