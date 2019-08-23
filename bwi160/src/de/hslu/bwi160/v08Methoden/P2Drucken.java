package de.hslu.bwi160.v08Methoden;

import java.util.*;

public class P2Drucken {

  public static void kopfzeile() {
    System.out.println("Hier drucken wir eine schöne Kopfzeile");
// irgendwie auch das Datum (interessiert uns im Moment nicht)
    Date dt = new Date();
    System.out.println( "Datum:" + dt );
    System.out.println();
  }

  public static void berechnungen() {
    // Dann führen wir Berechnungen durch und geben das Ergebnis aus
    int x = 1, y= 2;
    System.out.println("Das Ergebnis beträgt: "+(x+y));
  }

  public static void abschied() {
// Schließlich verabschieden wir uns
    System.out.println();
    System.out.println("Tschüß, das war's");
    System.out.println("Bis zum nächsten Mal");
  }
  public static void main(String[] args) {

    kopfzeile();
    berechnungen();
    abschied();

  }
}