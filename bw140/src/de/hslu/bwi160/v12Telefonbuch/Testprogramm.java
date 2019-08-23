package de.hslu.bwi160.v12Telefonbuch;

import InTools.*;

public class Testprogramm {

	public static void main(String[] args) {
		TelBuch buch = new TelBuch(20);

		String name;
		String vorname;
		int nummer;

		// Anlegen des Telefonbuches:
		InFile.open("input_tel.txt");
		if (InFile.done()) {
			// Den Vornamen schon mal lesen, damit dies in der While geprüft werden
			// kann
			vorname = InFile.readWord();
			while (InFile.done()) {
				// Das Array beginnt mit 0
				name = InFile.readWord();
				nummer = InFile.readInt();
				buch.hinzufuegen(vorname, name, nummer);
				// nächster Durchlauf
				vorname = InFile.readWord();
			}
			InFile.close();

			System.out.println("Das Telefonbuch hat nun " + buch.getAnzahl()
					+ " Einträge");

			vorname = InTast
					.readString("Telefonnummer bestimmen, bitte geben Sie Vornamen und Nachnamen ein: ");
			name = InTast.readString();
			if (buch.lookup(vorname, name) != -1)
				System.out.println("Die Nummer lautet: " + buch.lookup(vorname, name));
			else
				System.out.println("Zu dem Namen ist keine Nummer vorhanden");
		} else
			System.out.println("Das File konnt nicht geöffnet werden.");
	}
}