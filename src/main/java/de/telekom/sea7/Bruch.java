package de.telekom.sea7;

public class Bruch {

	int zaehler;
	int nenner;
	float Summe;

	
	public Bruch() {
		this.zaehler = zaehler;
		this.nenner = nenner;
		
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	public float ergebnis() {
		Summe = zaehler / nenner;
		return Summe;
	}

	public static void main(String[] args) {

		Bruch bruch = new Bruch();
		Bruch bruch1 = new Bruch();

		bruch.setZaehler(20);
		bruch.setNenner(10);
		int x =15;
		if (x>10) {
			//Bruch bruch1 = new Bruch ();
			bruch1.zaehler=30;
			bruch1.nenner=10;}
		System.out.println(bruch1.ergebnis());
		
			
		}
	}

