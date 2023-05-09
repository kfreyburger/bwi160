package de.hslu.bwi160.v09Input;

import java.util.Scanner;

public class P3WiederholteEingabe {

	public static void main(String[] args) {
		int ganzeZahl = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Geben Sie mal eine ganze Zahl ein");
	
		boolean eingabeCorrect = false;
		
		while (!eingabeCorrect){
			if(keyboard.hasNextInt()){
			  ganzeZahl = keyboard.nextInt();
			  eingabeCorrect = true;
			}
			  else{
				String falscheEingabe = keyboard.next();
				System.out.println("Eingegeben wurde "+falscheEingabe+", das ist keine ganze Zahl.");
				System.out.println("Bitte ganze Zahl eingeben!");
			}
		}
		
		System.out.println("Eingegeben wurde " + ganzeZahl);
		
		keyboard.close();
	}
}
