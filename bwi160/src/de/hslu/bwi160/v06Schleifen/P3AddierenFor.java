package de.hslu.bwi160.v06Schleifen;

public class P3AddierenFor {

  public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    for (int i = 1; i <= n; i++ ) {
      sum += i;
    }
    System.out.println("n: "+ n + " Summe: "+sum);

  }
}