public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			FizzerBuzzer(i);
		
		
		System.out.println("ENDE!");
	public static void FizzerBuzzer(int i) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + " : " + "FizzerBuzzer");
			}if (i % 5 == 0) {
				System.out.println(i + " : " + "Buzzer");
			} else if (i % 3 == 0) {
				System.out.println(i + " : " + "Fizzer");
			} else {
				System.out.println(i);
				}
			}
		
		}
	}
}
