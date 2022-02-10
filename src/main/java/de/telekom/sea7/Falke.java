package de.telekom.sea7;

public class Falke {

	private String name;
	private int alter;
	private String farbe;

	public Falke(String name, int alter, String farbe) {
		this.name = name;
		this.alter = alter;
		this.farbe = farbe;

		this.fligh();
		this.getClass();
		this.toString();
		this.getName();
	}

	public void fligh() {
		System.out.println("Du bist aber ein lustiger Vogel !!!");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + name + " " + alter + " " + farbe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public static void main(String[] args) {

		Falke falke1 = new Falke("Hugo", 9, "rot"); // Objekt erzeugen
		Falke falke2 = new Falke("Maja", 3, "braun");

		System.out.println(falke1);
		System.out.println(falke2);// toString() auf Objekt aufrufen
		falke1.setName("Erwin");
		System.out.println(falke1.getName());
		falke1.setName("Sepp");
		System.out.println(falke1.getName());
		System.out.println("Meine Farbe ist: " + falke1.getFarbe());
		System.out.println(falke1);
		System.out.println(falke2);
	}
}