package de.hslu.bwi160.v06Schleifen;

public class P6Multiplikationstabelle {
  public static void main(String[] args) {
    final int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print (i*j + "\t");
      }
      System.out.println();
    }
  }
}