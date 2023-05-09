package de.hslu.bwi160.v09Input;

/**
 * Title:
 * Description:  Beipipiele Input der Vorlesung
 * Copyright:    Copyright (c) 2002
 * Company:      FH Ludwigshafen
 * @author Klaus Freyburger
 * @version 1.0
 */

import java.io.*;

public class P6StreamTastatur {
  public static void main(String[] args) {
    int integer = 0;
    String string = " ";

  // Reader erzeugen
    BufferedReader in = new BufferedReader ( new InputStreamReader ( System.in ) );

      try {
        System.out.println("Bitte geben Sie einen String ein");
        string = in.readLine();
        System.out.println("Bitte geben Sie eine ganze Zahl ein");
        integer = Integer.parseInt(in.readLine());
      } catch( IOException e ) {
	    System.out.println( "Fehler beim Lesen oder Schreiben" );
      }

  System.out.println(string + " " + integer );


  }
}