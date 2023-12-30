package SDET_QA;

public class SumOfElementsArray {

	public static void main(String[] args) {
		int[] arr = {42,2,54,60,12};
		int sum = 0;
		for(int i =0; i<arr.length; i++)
		{
	//		sum = sum + arr[i];
		}
		
		//Enhance for loop 
		for(int a : arr)
		{
			sum = sum + a;
		}		
		System.out.println("Sum of array " + sum);
	}
}
