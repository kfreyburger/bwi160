package de.hslu.bw140.v10eKlassen05;

public class Student {

  private String name;
  private int nummer;

// Namensgleichheit mit Klasse
// wird bei der Erzeugung des Objektes aufgerufen
  public Student(String name, int n) {
    this.name = name;
    this.nummer = n;
  }

   public String toString() {
    return this.name+"   "+this.nummer;
  }

}