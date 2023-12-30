package SDET_QA;

public class removeAllWhiteSpacesinString {

	public static void main(String[] args) {
		String str = "Java  programing  selenium  automation  testing";
		
		System.out.println("Before removinf white spaces" + str);
		str.replaceAll("\\s", "");
		System.out.println("After removinf white spaces" + str);
		
	}
}
