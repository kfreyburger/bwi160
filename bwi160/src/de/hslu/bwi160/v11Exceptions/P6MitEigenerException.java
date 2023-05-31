package de.hslu.bwi160.v11Exceptions;

public class P6MitEigenerException {

	/*
	 * Hier soll eine eigene Exception ausgeloest werden; dadurch kann das Problem
	 * spezifisch beschrieben werden
	 */
	public static void main(String[] args) {

		int a = 1, b = 0;

		try {

			System.out.println("Das Ergebnis ist " + divideByZeroThrows(a, b));

		} catch (P5MeineEigeneException e) {
			System.out.println("DivideByZeroException gefangen");
//			System.out.println(e);
//    Zur Abwechslung mal etwas ausführlicher:
			e.printStackTrace();
		} // try
	}// method

	public static int divideByZeroThrows(int a, int b)
			throws P5MeineEigeneException {
		
		if (b == 0) {
			P5MeineEigeneException d = new P5MeineEigeneException();
//			P5MeineEigeneException d =
//				new P5MeineEigeneException("Jetzt kann man den Text freundlicher gestalten");
			throw d;
		} else {
			return a / b;
		}
	}// method
}
