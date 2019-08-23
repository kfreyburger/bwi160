package de.hslu.bwi160.v10eKlassen05;

public class StudentTestlauf {
  public static void main(String[] args) {
  Student studi = new Student("Albert Einstein", 4711);

  // beim direkten drucken des Objektes wird die Methode toString aufgerufen
  System.out.println("Direktes Drucken des Objektes");
  System.out.println(studi);
  }
}