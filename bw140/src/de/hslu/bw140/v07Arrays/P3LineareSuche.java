package de.hslu.bw140.v07Arrays;

public class P3LineareSuche {
  public static void main(String[] args) {
    int[] folge = { 3, 1, 5, 9, 7};
    int sucheigenschaft = 9;

    int resultat = -1;
    for (int i=0; i < folge.length; i++) {
//    for (int i=0;  i < folge.length && resultat == -1; i++) {	
      if ( folge[i] == sucheigenschaft ) {
        resultat = i;
      }
    }
    System.out.println(resultat);

    
// so könnte man die Ausgabe ein wenig hübscher machen:
    if ( resultat != -1 )
      System.out.println("Die gesuchte Zahl "+ sucheigenschaft+
                          " steht an Stelle "+resultat);
    else
      System.out.println("Die gesuchte Zahl "+ sucheigenschaft +
                          " kommt nicht in dem Array vor");

 //  Alternativer Algorithmus   
//    int i = 0;
//    while (i < folge.length && folge[i] != sucheigenschaft) {
//      i++;
//    }
//    
//    if ( i < folge.length )
//      System.out.println("Die gesuchte Zahl "+ sucheigenschaft+
//                          " steht an Stelle "+i);
//    else
//      System.out.println("Die gesuchte Zahl "+ sucheigenschaft +
//                          " kommt nicht in dem Array vor");    
    
    
  }
}