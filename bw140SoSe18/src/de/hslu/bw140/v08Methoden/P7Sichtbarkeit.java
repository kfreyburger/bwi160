package de.hslu.bw140.v08Methoden;

public class P7Sichtbarkeit {
  static int g1 = 1, g2 = 2;

  public static void A() {
    int a = 3;
    g1 = 5;
    int g2 = 5;
  }
  public static void B(int j) {
    int b = 4;

  }
  public static void main(String[] args) {
   int m = 2;

   A();

    for ( int i = 1; i <= 2; i++ ) {
      B(i);
    }
  }
}