package de.telekom.sea7;

public class UebungArray {

	private int[] test = new int[5];                    //Erstellen eines Arrays mit dem Namen liste mit 5 Stellen

	public UebungArray() {                              //Construktor erstellen
		for (int i = 0; i < test.length; i++) {
		test[i] = i;
		}
	}

	public void setliste(int index, int value) {
		//index--;
		test[index] = value;
	}

	public int getliste(int index) {
		//if ((index <= 0) && (test.length >= index)) {
		//	System.out.println("Ungültige Eingabe von " + index);
		//	return index;
		//} else {
			//index--;
			return test[index];
		//}
	}
	
	
	
	
	public static void main(String[] args) {
		
		UebungArray neueliste = new UebungArray();
		
		neueliste.setliste(0, 25);
		neueliste.setliste(3, 40);
		//System.out.println(neueliste.toString());
		System.out.println(neueliste.getliste(0));
		System.out.println(neueliste.getliste(1));
		System.out.println(neueliste.getliste(2));
		System.out.println(neueliste.getliste(3));
		System.out.println(neueliste.getliste(4));
		
	}

}
