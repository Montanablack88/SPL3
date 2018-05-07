
public class Unterprogramme {

	public static void main(String[] args) {
		String text = "Heute ist ein schöner Tag";
		
		char[] z = text.toCharArray();
		zeichenZaehlen(z, 'e');
		zeichenZaehlen(z, 'i');
		zeichenZaehlen(z, 'ü');
		
		System.out.println(anzahlZeichen(z, 'e'));
		System.out.println(anzahlZeichen(z, 'i'));
		System.out.println(anzahlZeichen(z, 'ü'));
		
		int e = anzahlZeichen(z, 'e');
	}

	public static void zeichenZaehlen(char[] z, char x) {
		int counter = 0;
		for (int i = 0; i < z.length;i++) {
			if (z[i] == x) {
				counter++;
			}
		}
		System.out.println("Anzahl der " + x + "'s im Text: " + counter);

	}
	public static int anzahlZeichen(char[] z, char x) {
		int counter = 0;
		for (int i = 0; i < z.length;i++) {
			if (z[i] == x) {
				counter++;
			}
		}
		return counter;
	}
}
