package de.hslu.bwi160.v09Input;

import java.util.Scanner;

public class P2ZweiZahlen {

	public static void main(String[] args) {
		int ganzeZahl, nochEineZahl;

		System.out.print("Geben Sie mal zwei Zahlen ein");
		Scanner keyboard = new Scanner(System.in);
		ganzeZahl = keyboard.nextInt();
		nochEineZahl = keyboard.nextInt();
		System.out.println("Eingegeben wurden " + ganzeZahl+" und "+nochEineZahl);

// besser die Eingabe überprüfen:		
		System.out.print("Geben Sie noch mal zwei Zahlen ein");
		if (keyboard.hasNextInt()) {
			ganzeZahl = keyboard.nextInt();
			if (keyboard.hasNextInt()){
				nochEineZahl = keyboard.nextInt();
			System.out.println("Eingegeben wurden " + ganzeZahl+" und "+nochEineZahl);
			}
			else 
				System.out.println("Eingegeben wurde " + ganzeZahl+" und dann keine Zahl mehr");
		}
		else 
			System.out.println("Es wurde keine Zahl eingegeben");
		keyboard.close();
	}
}
