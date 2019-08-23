package de.hslu.bwi160.v11Exceptions;


/*  hier werden verschiedene Exceptions abgefangen; dadurch können
 *  spezifischere Fehlermeldungen ausgegeben werden 
 */

import java.util.Scanner;

public class P2MehrereExceptions {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		try {

			// Klappt nur, wenn ganze Zahlen eingegeben wurden
			System.out.print("Bitte geben Sie den ersten Operand ein: ");
			int op1 = keyboard.nextInt();
			System.out.print("Bitte geben Sie den zweite Operand ein: ");
			int op2 = keyboard.nextInt();

			int sum = op1 + op2;
			System.out.println("Die Summe lautet: " + sum);

			// Geht schief, wenn durch 0 geteilt wird:
			int div = op1 / op2;
			System.out.println("Division ergibt: " + div);

			// ... oder was sonnst noch so schiefgehen kann:
			int[] array = { 1, 2 };
			System.out.println(array[2]);

		} catch (java.util.InputMismatchException ex) {
			// Ausgabe eines eigenen Textes:
			System.out.println("Bitte nur ganze Zahlen eingeben!");
			// Oder direkt die Exception drucken:
			System.out.println(ex);
		} catch (ArithmeticException ex) {
			System.out.println("Nicht durch 0 teilen!");
			System.out.println(ex);
		} catch (Exception ex) { // allgemeine Exception für den Rest
			System.out.println("Jetzt gab es noch ein anderes Problem!");
			System.out.println(ex);
		}
		keyboard.close();
	}
}
