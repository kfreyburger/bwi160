package de.hslu.bwi160.v08Methoden;


public class P4MaxAusdrucken {
  public static void max(int x, int y){
    int z;
    if ( x > y )
      z = x;
    else
      z = y;
    System.out.println("Das Maximum von "+ x + " und " + y 
    		                 + " beträgt: " + z);
  }

  public static void main(String[] args) {
    max(5,4);
    max(7,8);
  }
}