package de.telekom.sea7;

public class Integerliste {

	private int[] liste = new int[5];                    //Erstellen eines Arrays mit dem Namen liste mit 5 Stellen

	public Integerliste() {                              //Construktor erstellen
		for (int i = 0; i < liste.length; i++) {
		liste[i] = i;
		}
	}

	public void setliste(int position, int value) {
		position--;
		liste[position] = value;
	}

	public int getliste(int position) {
		if ((position <= 0) && (liste.length >= position)) {
			System.out.println("Ungültige Eingabe von " + position);
			return position;
		} else {
			position--;
			return liste[position];
		}
	}
//Länge des Arrays ausgeben
	public int getListenLaenge() {

		return liste.length;

	}
//Summe des Array berechnen
	public int getSumliste() {
		int sum = 0;
		for (int i = 0; i < liste.length; i++) {
			sum = sum + liste[i];
		}
		return sum;
	}

	public String toString() {
		String ausgabe = "";
		for (int i = 0; i < liste.length; i++) {
			ausgabe += liste[i] + ", ";
		}
		return ausgabe;
	}
//Länge des Arrays ändern
	public void setListenLaenge(int laenge) {
		int[] neueListe = new int[laenge];
		if (liste.length < neueListe.length) { // alte Liste ist kürzer als neue -> alte Liste passt in neue

			for (int i = 0; i < liste.length; i++) {
				neueListe[i] = liste[i];
			}
		} else { // alte Liste ist länger als neue -> Anzahl Elemente wie neue Liste
			for (int i = 0; i < neueListe.length; i++) {
				neueListe[i] = liste[i];
			}
		}
		liste = neueListe;

	}
//Inhalt Array löschen und auf 0 setzen
	public void setListeClear() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = 0;
		}
	}
//Zufallszahl ins Array schreiben
	public void setListeRandom() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = (int) (Math.random() * 10);
		}

	}
}