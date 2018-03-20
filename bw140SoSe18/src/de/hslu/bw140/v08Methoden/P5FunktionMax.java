package de.hslu.bw140.v08Methoden;

public class P5FunktionMax {
  public static int max(int x, int y){
    int z;
    if ( x > y )
      z = x;
    else
      z = y;
    return z;
  }

  public static void main(String[] args) {
  int a = 5, b= 4;
  System.out.println("Das Maximum von "+ a + " und "+ b +
  		" beträgt: " + max(a,b));

  }
}