package de.hslu.bwi160.v08Methoden;


public class P3MaxAusdruckenOhne {
  public static void main(String[] args) {
   int a = 5, b= 4;
   int z;
   if ( a > b )
     z = a;
   else
     z = b;
   System.out.println("Das Maximum von "+ a + " und "+ b + " beträgt: " + z);

   a = 7;
   b= 8;
   if ( a > b )
     z = a;
   else
     z = b;
   System.out.println("Das Maximum von "+ a + " und "+ b + " beträgt: " + z);


  }
}