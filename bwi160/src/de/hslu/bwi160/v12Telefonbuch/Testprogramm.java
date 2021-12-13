package de.hslu.bwi160.v12Telefonbuch;

import java.io.File;
import java.util.Scanner;

public class Testprogramm {

	public static void main(String[] args) {
		TelBuch buch = new TelBuch(20);

		String name;
		String vorname;
		int nummer;

		try {
			Scanner telFile = new Scanner(new File("input_tel.txt"));
			while (telFile.hasNextLine()){
				vorname = telFile.next();
				name = telFile.next();
				nummer = telFile.nextInt();
				buch.hinzufuegen(vorname, name, nummer);
			}
			telFile.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

			System.out.println("Das Telefonbuch hat nun " + buch.getAnzahl()
					+ " Einträge");

			System.out.print("Telefonnummer bestimmen, bitte geben Sie Vornamen und Nachnamen ein: ");
			Scanner keyboard = new Scanner(System.in);
			vorname = keyboard.next();
			name = keyboard.next();

			if (buch.lookup(vorname, name) != -1)
				System.out.println("Die Nummer lautet: " + buch.lookup(vorname, name));
			else
				System.out.println("Zu dem Namen ist keine Nummer vorhanden");
			keyboard.close();
	}
}