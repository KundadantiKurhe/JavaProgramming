package SDET_QA;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		int a[] = {10,2,3,4,7,6};
		
		System.out.println("Arrays before sorting : " +Arrays.toString(a));
		int n=a.length;
		for(int i =0;i<n-1;i++) {
			for(int j = 0;j<n-1;j++) {
				if(a[j] > a[j-1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting : " +Arrays.toString(a));
	}
}
