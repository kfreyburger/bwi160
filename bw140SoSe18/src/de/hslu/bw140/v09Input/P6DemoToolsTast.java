package de.hslu.bw140.v09Input;

import InTools.*;

public class P6DemoToolsTast {
  public static void main(String[] args) {
    int integer = 0;
    String string = " ";

    System.out.println("Bitte geben Sie einen String ein");
    string = InTast.readLine();

//  man kann den Text zur Aufforderung (Prompt) auch gleich mitgeben:
    integer = InTast.readInteger("Bitte geben Sie eine ganze Zahl ein: ");

    System.out.println("Eingegeben wurde: " + string + " " + integer );

//   readString liest ein einzelnes Textwort:
     String wort1 = InTast.readString("Geben Sie mal zwei Worte ein: ");
     String wort2 = InTast.readString();
     System.out.println("Eingegeben wurde: " + wort1 + " " + wort2 );
  }
}