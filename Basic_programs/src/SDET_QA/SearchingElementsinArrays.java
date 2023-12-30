package SDET_QA;

public class SearchingElementsinArrays {
	// By Linear Search
	public static void main(String[] args) {
		boolean flag = false;
		int a[] = {10,20,30,40,50};
		int search_ele = 500;
		for(int i = 0 ; i<a.length; i++) {
		//	System.out.println(a[i]);
			if(search_ele == a[i]) {
				System.out.println("Elements found " + i);
				flag = true;
				break;
			}
		}	
		
		if(flag == false) {
			System.out.println("elements Not Found ");	
		}
	}
}
