package de.hslu.bwi160.v09Input;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class P5ScannerFile {

	public static void main(String[] args) throws FileNotFoundException {
		
			Scanner textFile = new Scanner(new File("input_text.txt"));
			while (textFile.hasNextLine())
				System.out.println(textFile.nextLine());
			textFile.close();
		
	}

}
