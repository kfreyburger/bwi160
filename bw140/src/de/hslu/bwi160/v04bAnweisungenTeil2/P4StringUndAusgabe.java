package de.hslu.bwi160.v04bAnweisungenTeil2;

public class P4StringUndAusgabe {
  public static void main(String[] args) {

  	String s = "Willommen..."; //Stringkonstante mit " 
    System.out.println(s);  

    int a = 3;
  	System.out.println(a);
  	
  //  Polymorphismus: + bei Strings --> kleben 
 // implizite Typanpassung int --> String  	
  	String s2 = "Variable a = "+a;
  	System.out.println(s2);

    System.out.println(1 + 2 + 3 + 4);    
    System.out.println(1 + 2 + 3 + "4");
    System.out.println("1" + 2 + 3 + 4);   
    System.out.println('1' + 2 + 3 + 4);
  }
}