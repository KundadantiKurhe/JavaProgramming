package SDET_QA;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsarray {

	public static void main(String[] args) {
		int a[] = {30,50,20,10};
		System.out.println("Array elements before sorting : " + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array elements After sorting : " + Arrays.toString(a));

		//Approch2
		int b[] = {30,50,20,10,60};
		System.out.println("Array elements before sorting : " + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Array elements After sorting : " + Arrays.toString(b));

		// Approch3
		// Reverse DeScending order
		Integer c[] = {30,50,20,10,60};
		System.out.println("Array elements before sorting : " + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("Array elements After sorting : " + Arrays.toString(c));

		
		
				
	
	}
}
