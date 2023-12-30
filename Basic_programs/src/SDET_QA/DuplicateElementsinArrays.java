package SDET_QA;

import java.util.HashSet;

public class DuplicateElementsinArrays {
	public static void main(String[] args) {
		String arr[] = {"Java", "C", "C++", "Python", "Java"};
		/*
		 * boolean flag = false;
		 * 
		 * for(int i = 0; i<arr.length ; i++) { for(int j=i+1;j<arr.length; j++) {
		 * if(arr[i] == arr[j]) { System.out.println("Fount Duplicate Elements : " +
		 * arr[i]); } } }
		 * 
		 * if(flag == false) { System.out.println("Duplicate Elements Not found"); }
		 */
		
		// Approch2 : HashSet

		HashSet<String> langs = new HashSet();
		/*
		 * System.out.println(langs.add("Java"));
		 * System.out.println(langs.add("Python"));
		 * System.out.println(langs.add("Java")); System.out.println(langs.add("C"));
		 */
		boolean flg = false;
		for(String str : arr) {
			
			if(langs.add(str) == false) {
				System.out.println(langs.add(str)); 				
				flg =true;
			}
		}
		
		if(flg == false) {
			System.out.println("Not found Duplicates"  );
		}

		
		
		
	}
}
