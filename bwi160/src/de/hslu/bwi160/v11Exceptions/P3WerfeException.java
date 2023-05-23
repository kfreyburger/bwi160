package de.hslu.bwi160.v11Exceptions;

public class P3WerfeException {

	public static void main(String[] args) {
		try {
			divideByZeroThrows(10, 4);
		} catch (Exception e) {
			System.out.println("DivideByZeroException gefangen");
//			System.out.println(e);
//    Zur Abwechslung mal etwas ausführlicher:
			e.printStackTrace();
		} // try
	}// method

	public static void divideByZeroThrows(int a, int b) throws Exception {
		if (b == 0) {
			Exception d1 = new Exception();
			throw d1;
		} else {
			System.out.println("Das Ergebnis ist " + a / b);
		}
	}// method
}
