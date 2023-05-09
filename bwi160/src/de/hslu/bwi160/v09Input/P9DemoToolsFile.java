package de.hslu.bwi160.v09Input;

import InTools.*;

public class P9DemoToolsFile {
	public static void main(String[] args) {

		// �ffnen des Files
		InFile.open("input_text.txt");
		if (InFile.done()) {
			String string = InFile.readLine();
			int integer = InFile.readInt();

			System.out.println("Im File steht: " + string + " " + integer);
			InFile.close();
		} else
			System.out.print("Das File konnte nicht ge�ffnet werden");

		// Verarbeiten eines kompletten Files
		InFile.open("input_integer.txt");
		if (InFile.done()) {
			int x = InFile.readInt(); // den ersten Eintrag lesen
			System.out.print("Im zweiten File steht: ");
			while (InFile.done()) { // auswerten, ob es geklappt hat
				// ...process x ...
				System.out.print(x + " ");
				x = InFile.readInt(); // lesen f�r den n�chsten Schleifendurchlauf
			}
			InFile.close();
			System.out.println();
		} else
			System.out.print("Das zweite File konnte nicht ge�ffnet werden");
	}
}