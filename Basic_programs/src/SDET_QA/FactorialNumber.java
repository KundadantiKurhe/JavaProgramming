package SDET_QA;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 5;
		long fact = 1;
		
		for(int i = num; i>=1; i--) // or for(int i = 1; i <= num ;i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial of number is " + fact);
	}
}
