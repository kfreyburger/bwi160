package de.hslu.bwi160.v11Exceptions;

public class P3WerfeException {

	public static void main(String[] args) {
		try {
			divideByZeroThrows(1,0);
		} catch (Exception e) {
			System.out.println("DivideByZeroException gefangen");
			System.out.println(e);
//    Zur Abwechslung mal etwas ausführlicher:
//			e.printStackTrace();
		}// try
	}// method

	public static void divideByZeroThrows(int a, int b) throws ArithmeticException {
		if (b == 0) {
			ArithmeticException d = new ArithmeticException();
			throw d;
		} else {
			System.out.println("Das Ergbnis ist " + a / b);
		}
	}// method
}
