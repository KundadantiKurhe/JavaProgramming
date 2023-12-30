package SDET_QA;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNumber = sc.nextInt();
		
	/*	int iRev = 0;
		
		while(iNumber != 0) {
			iRev = iRev*10+iNumber%10;
			iNumber = iNumber/10;			
		}*/
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(iNumber));
		
		StringBuffer iRev = sb.reverse();
		System.out.println(iRev);
		
		*/
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(iNumber);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
	}
}
