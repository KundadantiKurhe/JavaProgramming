package SDET_QA;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = false;
		String arr[] = {"java", "c" ,"Python", "c++", "java"};
	
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					flag = true;
				}
			}
		}
		
		if(flag == false) {
			System.out.println("duplicate element not found :");

		}
		
	}

}
