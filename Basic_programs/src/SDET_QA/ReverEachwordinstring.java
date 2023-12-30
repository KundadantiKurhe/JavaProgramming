package SDET_QA;

import java.util.Scanner;

public class ReverEachwordinstring {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//int count =1;

		String words[] = s.split(" ");
		String reverstring = "";
		
		for(String w : words) {
			String reverseword = "";
			for(int i = w.length()-1;i>=0;i--) {
				reverseword = reverseword + w.charAt(i);
			}
			reverstring =reverstring  + reverseword + " ";
		}
		System.out.println(reverstring);
		
		// Approch2 
		System.out.println("Enter the string : ");
		Scanner scc = new Scanner(System.in);
		String s1 = scc.nextLine();
		//int count =1;

		String wordss[] = s1.split("\\s");
		
		String reversewordss = "";
		for(String w : wordss) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversewordss = reversewordss + sb.toString()+" ";	
		}
		System.out.println(reversewordss);
	}
}
