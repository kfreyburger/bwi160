package de.hslu.bwi160.v10fKlassen07;

public class Student {
  private static int zaehler;

  private String name;
  private int nummer;

// Namensgleichheit mit Klasse
// wird bei der Erzeugung des Objektes aufgerufen
  public Student(String name, int n) {
    this.name = name;
    this.nummer = n;
    zaehler++;
  }
  
// alternativer Konstruktur mit automatischer Nummernvergabe  
  public Student(String name) {
	    this.name = name;
	    zaehler++;
	    this.nummer = zaehler;
	   
	  }

  public static int getAnzahl() {
    return zaehler;
  }

   public String toString() {
    return this.name+"   "+this.nummer;
  }

}