package SDET_QA;

import java.util.Scanner;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		
		
		while(num>0)
		{
			int rem  = num%10;
			if(rem%2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num= num/10;
		}
		
			System.out.println("count of even number" + evenCount);
			System.out.println("count of odd number" + oddCount);

	}
}
