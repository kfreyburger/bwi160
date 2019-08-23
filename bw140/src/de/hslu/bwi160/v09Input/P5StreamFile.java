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

public class P5StreamFile {
  public static void main(String[] args) {

    int integer = 0;
    String string = " ";

    BufferedReader in = null;

  // Reader erzeugen, ÷ffnet gleichzeitig Datei
	try {
	    in = new BufferedReader (
		     new InputStreamReader (
		         new FileInputStream(
                   "input_text.txt" ) ) );
 	} catch( FileNotFoundException e ) {
	    System.out.println( "Konnte Datei nicht finden und " +
				"zum Lesen ÷ffnen" );
	    System.exit( 1 );
	}

      try {


        string = in.readLine();
        integer = Integer.parseInt(in.readLine());
// while (xxxx != null) {
//      }

      } catch( IOException e ) {
	    System.out.println( "Fehler beim Lesen oder Schreiben" );
      }

 // Dateien schlieﬂen
	try {
	    in.close();
	} catch( IOException e ) {
	    System.out.println( "Selbst beim Schlieﬂen kann" +
				"noch etwas schief gehen" );
	}
  System.out.println(string + " " + integer );

  }
}