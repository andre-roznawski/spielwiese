package de.telekom.sea7;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [5];
		int i;
		a [0] = 3;
		a [1] = 5;
		a [2] = 10;
		a [3] = 0;
		a [4] = 20;
		
		for (i = 0; i< 5; i++) {
			System.out.println(a[i]);
			}
		
		i = a[1] + a [2] - a[0];
				
	System.out.println("Das Ergebnis an der Stelle 0 ist: " + a[0]);
	System.out.println("Das Ergebnis an der Stelle 1 ist: " + a[1]);
	System.out.println("Das Ergebnis an der Stelle 2 ist: " + a[2]);
	System.out.println("Die Summe vom Array a ist: " + i);

	
	
	}

}
