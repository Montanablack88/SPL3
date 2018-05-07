import javax.swing.JOptionPane;

public class Schaltjahr {

	public static void main(String[] args) {
		// Jahr eingeben
		
		// Überprüfen, ob ein Schaltjahr
		// mit Funktionen
		
		
		int jahr = JOptionPane.showInputDialog("Geben Sie bitte ein Jahr ein!");
		
		
		
			
		}
		
		
	public static void istSchaltjahr(int Jahreszahl) {
		if (Jahreszahl % 4 == 0) {
			System.out.println(jahr + " ist kein Schaltjahr");
			if(Jahreszahl % 100 != 0 || Jahreszahl % 400 == 0) {
				System.out.println();
			}
		}
	}

}
