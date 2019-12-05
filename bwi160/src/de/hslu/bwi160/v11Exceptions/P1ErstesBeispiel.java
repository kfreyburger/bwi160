package de.hslu.bwi160.v11Exceptions;


/*  Idee: 
    Wir möchten einen kleinen Taschenrechner realisieren, der Eingaben durch den 
    Benutzer erhält und das Ergebnis errechnet.  
    Falls der Benutzer keine ganze Zahl eingegeben hat, löst die Methode nextInt()
    eine Exception aus, die dann in catch behandelt werden kann  
*/

import java.util.Scanner;

public class P1ErstesBeispiel {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

//		try {

			// Klappt nur, wenn ganze Zahlen eingegeben wurden
			System.out.print("Bitte geben Sie den ersten Operand ein: ");
			int op1 = keyboard.nextInt();
			System.out.print("Bitte geben Sie den zweiten Operand ein: ");
			int op2 = keyboard.nextInt();

			int sum = op1 + op2;
			System.out.println("Die Summe lautet: " + sum);

			int div = op1 / op2;
			System.out.println("Division ergibt: " + div);
//		} catch (Exception ex) {
//			// Ausgabe eines eigenen Textes:
//			System.out.println("Unzulaessige Eingabe!");
//			// Oder direkt die Exception drucken:
//			System.out.println(ex);
//		}
			keyboard.close();
	}
}
