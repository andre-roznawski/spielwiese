package de.telekom.sea7;

public class StarterArr {

	public static void main(String[] args) {

		Integerliste meineListe = new Integerliste();

		System.out.println("Listenelemente Original: " + meineListe.toString());
		//System.out.println("Listenlänge: " + meineListe.getListenLaenge());
		//System.out.println("Listensumme: " + meineListe.getSumliste());
		meineListe.setliste(1, 20);
		System.out.println(meineListe.getliste(1));
		System.out.println(meineListe.getliste(2));
		System.out.println(meineListe.getliste(3));
		System.out.println(meineListe.getliste(4));
		System.out.println(meineListe.getliste(5));
		meineListe.setListenLaenge(8);
		System.out.println("Listenelemente neue Länge + : " + meineListe.toString());

		meineListe.setListenLaenge(5);
		System.out.println("Listenelemente neue Länge - : " + meineListe.toString());

		meineListe.setListeClear();
		System.out.println("Listenelemente Clear: " + meineListe.toString());

		meineListe.setListeRandom();

		System.out.println("Listenelemente Zufall: " + meineListe.toString());
		System.out.println("Listensumme: " + meineListe.getSumliste());
	}
}