package de.hslu.bwi160.v09Input;

import java.util.Scanner;

public class P1FirstScanner {

	public static void main(String[] args) {
		int ganzeZahl;

		System.out.print("Geben Sie mal eine ganze Zahl ein");
		Scanner keyboard = new Scanner(System.in);
		ganzeZahl = keyboard.nextInt();

		System.out.println("Eingegeben wurde " + ganzeZahl);

// besser die Eingabe überprüfen:		
		System.out.print("Geben Sie noch eine ganze Zahl ein");
		if (keyboard.hasNextInt()) {
			ganzeZahl = keyboard.nextInt();
			System.out.println("Eingegeben wurde " + ganzeZahl);
		}
		else 
			System.out.println("Es wurde keine Zahl eingegeben");
		
		double gleitkommaZahl;
		
		System.out.print("Geben Sie eine Gleitkommazahl ein");
		// Dezimaltrenner wird vom Betriebssystem übernommen
		if (keyboard.hasNextDouble()) {
			gleitkommaZahl = keyboard.nextDouble();
			System.out.println("Eingegeben wurde " + gleitkommaZahl);
		}
		else 
			System.out.println("Es wurde keine Gleitkommazahl eingegeben");
		
		keyboard.close();
	}
}
