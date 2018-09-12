package de.hslu.bw140.v05Verzweigung;

public class P6MonatAlsIf {
	public static void main(String[] args) {
		int month = 4, tage = 0;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			tage = 31;
		else if (month == 2)
			tage = 28;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			tage = 30;
		else
			System.out.println("Monat falsch");

		System.out.println("Monat: " + month + " Tage: " + tage);

	}
}