package de.telekom.sea7;

public class Array {

	public static void main(String[] args) {

		int[] a = new int[5];
		int i;
		a[0] = 3;
		a[1] = 5;
		a[2] = 10;
		a[3] = 0;
		a[4] = 20;
		int sum = 0;

		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		//for (int zahl : a) {
		//	System.out.println("Das ist die Ausgabe über die For-Each Schleife: " + a.length);
		//}

		for (i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println("Das Ergebnis an der Stelle 0 ist: " + a[0]);
		System.out.println("Das Ergebnis an der Stelle 1 ist: " + a[1]);
		System.out.println("Das Ergebnis an der Stelle 2 ist: " + a[2]);
		System.out.println("Das Array hat " + a.length + " Stellen");
		System.out.println(a.equals(4));
		System.out.println("Die Summe der einzelnen Inhalte des Arrays ist gleich: " + sum);

	}

}
