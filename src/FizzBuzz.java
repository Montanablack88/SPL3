public class FizzBuzz {

	public static void main(String[] args) {
		//for (int i = 1; i <= 100; i++) {
		//	FizzerBuzzer(i);
//		}
		for (int i = 0; i<=100; i+=4) {
			FizzerBuzzer(i, false);
		}
	}
		
	public static void FizzerBuzzer(int i, boolean showFizzBuzz) {
			if (i % 4 == 0 && i % 7 == 0 && showFizzBuzz == true) {
				System.out.println(i + " : " + "FizzerBuzzer");
			}if (i % 4 == 0) {
				System.out.println(i + " : " + "Fizzer");
			} else if (i % 7 == 0) {
				System.out.println(i + " : " + "Buzzer");
			} else {
				System.out.println(i);
				}
	
		
		}
	
}
