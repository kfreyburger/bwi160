package de.hslu.bwi160.v10dKlassen04;

public class StudentTestlauf {
  public static void main(String[] args) {
  Student studi = new Student();

// geht jetzt nicht mehr
//  studi.name = "Albert Einstein";


// Zugriff über Methoden
  studi.setName("Albert Einstein");
  studi.setNummer(4711);

  System.out.println(studi.getName()+"  "+studi.getNummer());
  }
}