package de.hslu.bw140.v09Input;

import java.util.Scanner;

public class P2ScannerString {

	public static void main(String[] args) {
		Scanner textScan = new Scanner("Hallo 12 1973 12,03 True 123456789000");
		System.out.println(textScan.hasNext());
		System.out.println(textScan.next());
		System.out.println(textScan.hasNextByte());
		System.out.println(textScan.nextByte());
		System.out.println(textScan.hasNextInt());
		System.out.println(textScan.nextInt());
		System.out.println(textScan.hasNextDouble()); 
		System.out.println(textScan.nextDouble()); 
		// Dezimaltrenner wird vom Betriebssystem übernommen
		System.out.println(textScan.hasNextBoolean()); 
		System.out.println(textScan.nextBoolean()); 
		System.out.println(textScan.hasNextLong()); 
		System.out.println(textScan.nextLong()); 
		System.out.println(textScan.hasNext());
		textScan.close();
	}

}
