package de.hslu.bw140.v04aAnweisungenTeil1;

public class DemoUmrechnung {

	

	public static void main(String[] args) {
		final int MINUTEN_PRO_STUNDE = 60; 
		final int SEKUNDEN_PRO_MINUTE = 60; 
		final int STUNDEN_PRO_TAG = 24;
		
		int sekunden = 201217;  
		
		int minuten = sekunden / SEKUNDEN_PRO_MINUTE;
		int restlicheSekunden = sekunden % SEKUNDEN_PRO_MINUTE;
		int stunden = minuten / MINUTEN_PRO_STUNDE;
		int restlicheMinuten = minuten % MINUTEN_PRO_STUNDE;
		
		int tage = stunden / STUNDEN_PRO_TAG;
		int restlicheStunden = stunden % STUNDEN_PRO_TAG;
		
    
 

	
 		System.out.println(tage);
 		System.out.println(restlicheStunden);
 		System.out.println(restlicheMinuten);
 		System.out.println(restlicheSekunden);
 		
 		// Probe:
 		int sekundenProbe = restlicheSekunden + ( restlicheMinuten * SEKUNDEN_PRO_MINUTE) 
 				+ restlicheStunden * SEKUNDEN_PRO_MINUTE * MINUTEN_PRO_STUNDE
 		    + tage * SEKUNDEN_PRO_MINUTE * MINUTEN_PRO_STUNDE * STUNDEN_PRO_TAG;
 		System.out.println(sekundenProbe);
 		
// 		int sekundenFuerProbe = (((tage * STUNDENPROTAG) + restlicheStunden) // Stunden
//				* MINUTENPROSTUNDE + restlicheMinuten) // Minuten
//				* SEKUNDENPROMINUTE + restlicheSekunden;
 		
	}

}
