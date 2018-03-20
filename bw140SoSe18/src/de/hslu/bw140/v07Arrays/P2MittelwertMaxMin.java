package de.hslu.bw140.v07Arrays;

public class P2MittelwertMaxMin {
	public static void main(String[] args) {
		int[] a = { 5, 1, 8, 3, 9, 2 };

		int max, min, sum;
		max = min = sum = a[0];

		for (int i = 1; i < a.length; i++) {
			sum += a[i];
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}

		System.out.println("Das Minimum lautet: " + min);
		System.out.println("Das Maximum lautet: " + max);
		System.out.println("Der Mittelwert lautet: " + 1.0 * sum / a.length);
	}
}