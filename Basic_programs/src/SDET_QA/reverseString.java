package SDET_QA;

public class reverseString {
	public static void main(String[] args)
	{

		// 1) String concatenation) operator
		// ABCDESA
		
		String str = "abcdsa";
		String rev = ""; 
		/*
		int len = str.length();
		
		for(int i = len -1 ;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		*/
		
		char[] arr = str.toCharArray();
		int len = arr.length;
		
		for(int i = len -1; i>=0;i--)
		{
			rev = rev+arr[i];
		}
		System.out.println(rev);
	}
}
