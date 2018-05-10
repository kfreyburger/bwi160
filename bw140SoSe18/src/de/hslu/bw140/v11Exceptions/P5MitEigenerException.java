package de.hslu.bw140.v11Exceptions;

public class P5MitEigenerException {

/* Hier soll eine eigene Exception ausgelöst werden;
 * dadurch kann das Problem spezifisch beschrieben werden
 */
	public static void main(String[] args) {
		try {
			divideByZeroThrows();
		} catch (P4MeineEigeneException e) {
			System.out.println("DivideByZeroException gefangen");
			System.out.println(e);
//    Zur Abwechslung mal etwas ausführlicher:
//			e.printStackTrace();
		}// try
	}// method

	public static void divideByZeroThrows() throws P4MeineEigeneException {
		int a = 1, b = 0;
		if (b == 0) {
			P4MeineEigeneException d = new P4MeineEigeneException();
//			 MeineEigeneException d =
//			 new MeineEigeneException("Jetzt kann man den Text etwas freundlicher gestalten");
			throw d;
		} else {
			System.out.println("Das Ergbnis ist " + a / b);
		}
	}// method
}
