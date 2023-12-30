package SDET_QA;

public class CountOccurenacesofCharacterString {

	public static void main(String[] args) {
		String  s = "Java Programing Java oops";
		int totalCount = s.length();  // total len
		int totalCount_afterremoves = s.replace("a" , "").length(); //total len after removing a's
		int count = totalCount - totalCount_afterremoves;
		System.out.println("Number occuarnce of a is : " + count);
			
	}
}
