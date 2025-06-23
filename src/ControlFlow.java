
public class ControlFlow {

	public static void main(String[] args) {

		// IF ELSE
		int x = 21;

		if (x % 2 == 0) {
			System.out.println("x is even");
		} else {
			System.out.println("x is odd");
		}

		// IF ELSE IF
		int age = 10;
		if (age < 13) {
			System.out.println("child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Teenager");
		} else {
			System.out.println("Adult");
		}

		// SWITCH

		int week = 3;

		switch (week) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wed");
			break;

		case 4:
			System.out.println("Thur");
			break;

		case 5:
			System.out.println("Fri");
			break;

		case 6:
			System.out.println("Sat");
			break;

		case 7:
			System.out.println("Sunday");
			break;
		}
	}

}
