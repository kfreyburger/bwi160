package de.hslu.bwi160.v08Methoden;

public class P6Parameter {
  public static void uebergabe(int a, int[] b){
    a = 10;
//  x = 10;   Variable ist hier nicht definiert

    b[1] = 5;
  }


  public static void main(String[] args) {
    int x = 1;
    int[] y = {0,1,2,3};

    uebergabe(x,y);

    System.out.println("x = "+x+", y[1] = "+y[1]);
  }
}