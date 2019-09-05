package de.hslu.bwi160.v02.AlgorihmischeGrundkonzepte;

public class P2Maximum {
	public static void main(String[] args) {
		int n, i, merker;
		n = 6;
		int[] a = { 5, 1, 8, 3, 9, 2 };
		merker = a[0];
		i = 1;
		while (i < n) {
			if (a[i] > merker)
				merker = a[i];
			i = i + 1;
		}
		System.out.println(merker);
	}
}
