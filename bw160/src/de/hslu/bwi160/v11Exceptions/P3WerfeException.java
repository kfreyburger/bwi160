package de.hslu.bwi160.v11Exceptions;

public class P3WerfeException {

	public static void main(String[] args) {
		try {
			divideByZeroThrows();
		} catch (Exception e) {
			System.out.println("DivideByZeroException gefangen");
			System.out.println(e);
//    Zur Abwechslung mal etwas ausführlicher:
//			e.printStackTrace();
		}// try
	}// method

	public static void divideByZeroThrows() throws ArithmeticException {
		int a = 1, b = 0;
		if (b == 0) {
			ArithmeticException d = new ArithmeticException();
			throw d;
		} else {
			System.out.println("Das Ergbnis ist " + a / b);
		}
	}// method
}
