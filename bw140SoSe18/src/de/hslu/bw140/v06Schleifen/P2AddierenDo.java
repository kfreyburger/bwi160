package de.hslu.bw140.v06Schleifen;


public class P2AddierenDo {
  public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    int i = 1;
    do {
      sum += i;
      i++;
    } while (i <= n);
  System.out.println("n: "+ n + " Summe: "+sum);
  }
}