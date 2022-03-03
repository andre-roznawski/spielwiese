package de.telekom.sea7;

public class UebungArray1 {
	
	int [] hallo = new int [5];

	public int[] getHallo() {
		return hallo;
	}

	public void setHallo(int position, int i) {
		this.hallo = hallo;
	}
	
public static void main(String[] args) {
		
		UebungArray1 neueliste = new UebungArray1();

		neueliste.setHallo(2, 15);
		System.out.println(neueliste.getHallo());
}
}