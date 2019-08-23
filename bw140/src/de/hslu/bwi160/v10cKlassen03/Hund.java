package de.hslu.bwi160.v10cKlassen03;

public class Hund {
	public int groesse;

	public String rasse, name;

	public void bellen() {
		if (this.groesse > 60)
			System.out.println("Wuff-Wuff");
		else if (this.groesse > 30)
			System.out.println("Wau-Wau");
		else
			System.out.println("Jip-Jip");
	}

	public String toString() {
		return "Ich bin ein " + this.rasse + " und heisse " + this.name;

	}

}
