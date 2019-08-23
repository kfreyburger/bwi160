package de.hslu.bwi160.v10cKlassen03;

public class HundTestlauf {
	public static void main(String[] args) {
    Hund ersterHund = new Hund();
    ersterHund.groesse = 70;
    ersterHund.name = "Bello";
    ersterHund.rasse = "Bernhardiner";
    
    Hund zweiterHund = new Hund();
    zweiterHund.groesse = 10;
    zweiterHund.name = "Stupsi";
    zweiterHund.rasse = "Chihuahua";
    
     ersterHund.bellen();
   
// Ausgabe Alternative 1:
   System.out.println("Ich bin ein "+ ersterHund.rasse + " und heisse "+ ersterHund.name);
    
// Ausgabe Alternative 2:   
    System.out.println(zweiterHund);

    zweiterHund.bellen();
    
	}

}
