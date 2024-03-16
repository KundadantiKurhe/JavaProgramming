package SDET_QA;

import java.util.Scanner;

// Approach 1
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		int org_num = num;
		int rev  = 0; 
		while(num!=0){
			rev = rev*10+num%10;
			num = num/10;
		}
		
		if(org_num == rev) 
			System.out.println("Palindrome..." + rev);
		else
			System.out.println("Not a Palindrome..." + rev);
	}
}

// Approach 2
//by returnning boolean values

public class PalindromeNumber {
	public static void main(String[] args) {
		int n = 121;
		if( paliNumber(n))
			System.out.println(n + " : Palindrome number");
		else
			System.out.println(n + " : not palindrome number");
	}
	
	public static boolean paliNumber(int n) {
		int temp=n;
		int rev=0, rem ;
		while(n !=0) {
			 rem = n%10;
			 rev = rev *10+rem;
			n=n/10;
		}
		return temp == rev;
	}
}

//Approach 3
//by returnning integer values

public class PalindromeNumber {
	public static void main(String[] args) {
		int n = 121;
		
		int rs = paliNumber(n);
		if(rs == n)
			System.out.println("Palindrome number");
		else 
			System.out.println("not palindrome number");
	}
	
	public static int paliNumber(int n) {
		int temp=n;
		int rev=0, rem ;
		while(temp !=0) {
			 rem = temp%10;
			 rev = rev *10+rem;
			temp=temp/10;
		}
		return rev;
	}
}
