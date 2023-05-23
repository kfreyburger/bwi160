package de.hslu.bwi160.v11Exceptions;

public class P5MitEigenerException {

	/*
	 * Hier soll eine eigene Exception ausgelöst werden; dadurch kann das Problem
	 * spezifisch beschrieben werden
	 */
	public static void main(String[] args) {

		int a = 1, b = 0;

		try {

			System.out.println("Das Ergebnis ist " + divideByZeroThrows(a, b));

		} catch (P4MeineEigeneException e) {
//			System.out.println("DivideByZeroException gefangen");
			System.out.println(e);
//    Zur Abwechslung mal etwas ausführlicher:
//			e.printStackTrace();
		} // try
	}// method

	public static int divideByZeroThrows(int a, int b)
			throws P4MeineEigeneException {
//		int a = 1, b = 0;
		if (b == 0) {
			P4MeineEigeneException d = new P4MeineEigeneException();
			throw d;
		} else {
			return a / b;
		}
	}// method
}
