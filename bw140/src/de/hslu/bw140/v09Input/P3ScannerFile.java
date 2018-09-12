package de.hslu.bw140.v09Input;

import java.util.Scanner;
import java.io.File;

public class P3ScannerFile {

	public static void main(String[] args) {
		try {
			Scanner textFile = new Scanner(new File("input_text.txt"));
			while (textFile.hasNextLine())
				System.out.println(textFile.nextLine());
			textFile.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
