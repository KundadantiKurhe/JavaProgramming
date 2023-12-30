package SDET_QA;

import java.util.Scanner;

public class EvenAndOddNumber {
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		int[] a = {1,2,7,5,6,9,4};
		int evenNumber;
		int oddNumber;
		
		
		System.out.println("Even number : ");
		for(int i =0;i <a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println(a[i]);
			}
		}
		
		
		System.out.println("Odd number : ");
		for(int i =0;i <a.length;i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.println(a[i]);
			}
		}
		
		for(int aa :a)
		{
			if(aa%2 == 0)
			{
				System.out.println(aa);
			}
		}
		
		for(int aa :a)
		{
			if(aa%2 != 0)
			{
				System.out.println(aa);
			}
		}
	}

}
