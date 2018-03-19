package de.hslu.bw140.v06Schleifen;

public class P1AddierenWhile {
  public static void main(String[] args) {

    int n = 10;
    int sum = 0;
    int i = 1;
    while (i <= n) {
      sum += i;
      i++;
    }
    System.out.println("n: "+ n + " Summe: "+sum);
  }
}