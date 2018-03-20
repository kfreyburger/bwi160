package de.hslu.bw140.v07Arrays;

public class P1FirstSteps {
  public static void main(String[] args) {
    int[] a = { 5, 1, 8, 3, 9, 2};

//   Lesen eines Wertes: 
    System.out.println(a[2]);
    
//  Schreiben eines Wertes: 
    a[1] = 12;
    System.out.println(a[1]);

// Variable zur Länge eines Arrays:
    System.out.println(a.length);
    
// So kann man das ganze Feld bearbeiten (und z.B. die Werte ausgeben):    
    System.out.println("Das Array a enthält: ");
    for (int i = 0; i < a.length; i++)
      System.out.print(" " + a[i]);
    System.out.println();

 // und schließlich ein neues Feld erzeugen:
    a = new int[4];
    System.out.println("Das Array a enthält jetzt: ");
    for (int i = 0; i < a.length; i++)
      System.out.print(" " + a[i]);
    System.out.println();   
  }
}