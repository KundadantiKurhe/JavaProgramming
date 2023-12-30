package SDET_QA;

import java.util.Scanner;

public class Palimdrome_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter a string");
		String rev = "";
		int len = str.length();
		String strr = str;
		
		for(int i = len-1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(strr.equals( rev ))
		{
			System.out.println("Palimdroone String : " + rev);
		}else {
			System.out.println("Not palimdroone String : " + rev);
		}
	}
}
