package SDET_QA;

import java.util.Scanner;
// Approach 1
public class CountEvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		while(num>0){
			int rem  = num%10;
			if(rem%2 == 0)
				evenCount++;
			else
				oddCount++;
			num= num/10;
		}
		System.out.println("count of even number" + evenCount);
		System.out.println("count of odd number" + oddCount);
	}
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Approach 2
public class EvenOddnumber {
	public static void main(String[] args) {
		System.out.println("Enter integer Value..");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			System.out.println("num : "+num);
			
			Map<String, Integer> oddEvenCountValuesMap = checkOddEvenCountInGivenNumber(num);
			System.out.println("oddEvenCountValuesMap : "+ oddEvenCountValuesMap);
		}
	}
	
	public static Map<String, Integer> checkOddEvenCountInGivenNumber(int num){
		int evenCount = 0;
		int oddCount = 0;
		while(num>0){
			int rem  = num%10;
			System.out.println("rem : "+rem);
			if(rem%2 == 0)
				evenCount++;
			else
				oddCount++;
			num= num/10;
			System.out.println("num 2 : "+num);
		}
		
		Map<String, Integer> countValues = new HashMap<>();
		countValues.put("evenCount", evenCount);
		countValues.put("oddCount", oddCount);
		return countValues;
	}
}
