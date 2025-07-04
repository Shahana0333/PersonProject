
public class Loops {

	public static void main(String[] args) {

		// FOR LOOP

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// FOR LOOP PRINT IN REVERSE

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// WHILE

		int i = 10;

		while (i >= 1) {
			System.out.println(i);
			i--;
	
		}
		
		//Enhanced for loop
		
		String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
		
		for(String s:fruits) {
			System.out.println(s);
		}
	}
	
}
