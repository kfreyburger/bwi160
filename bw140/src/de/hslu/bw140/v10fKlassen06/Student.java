package de.hslu.bw140.v10fKlassen06;

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

  public static int getAnzahl() {
    return zaehler;
  }


   public String toString() {
    return this.name+"   "+this.nummer;
  }
 
}