package de.hslu.bw140.v07Arrays;

public class P5VektorAddition {
	public static void main(String[] args) {

		int[] aVektor = {1, 2, 3 };
		int[] bVektor =  {7, 8, 9 }; 

		int[] ergebnisVektor = new int[aVektor.length];

		// Berechnung
		for (int i = 0; i < aVektor.length; i++)
			ergebnisVektor[i] = aVektor[i] + bVektor[i];

		// Ausgabe
		System.out.println("Das Ergebnis lautet:");
		for (int i = 0; i < ergebnisVektor.length; i++) {
				System.out.print(ergebnisVektor[i] + " ");
		}
	}
}