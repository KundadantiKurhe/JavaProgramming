package SDET_QA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// Approch1 : using FileReader bufferReader 
		FileReader fr = new FileReader("/Basic_programs/src/filereader.txt");
		BufferedReader br = new BufferedReader(fr);
		String str ;

		while((str= br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		
		// approch2
		// Approch1 : using FileReader bufferReader 
		FileReader frr = new FileReader("/Basic_programs/src/filereader.txt");
		BufferedReader brr = new BufferedReader(fr);
		String strr ;

		File file = new File("");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		// Approch3
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
	}
}
