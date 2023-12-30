package SDET_QA;

import java.util.Scanner;

public class SumOfEvenOddCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenCount =0;
		int oddCount = 0;
		int evensum =0;
		int oddsum = 0;
		
		while(num > 0)
		{
			int rem = num%10;
			if(rem%2 == 0)
			{
				evensum = evensum + (evenCount++);
			}else
			{
				oddsum = oddsum + (oddCount++);
			}
			
			num = num /10;
		}
		
		System.out.println("Sum of even number " + evensum);
		System.out.println("Sum of odd number " + oddsum);

	}
}
