package de.telekom.sea7;

public class Falke {

    private String name;
    private int alter;

    public Falke(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public static void main(String[] args){
        Falke falke = new Falke("Hugo", 9);  // Objekt erzeugen
        System.out.println(falke); //toString() auf Objekt aufrufen
    }
}