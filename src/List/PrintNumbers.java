package List;

import java.util.ArrayList;

public class PrintNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		ArrayList<Integer> EvenNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			Numbers.add(i);
		}
		System.out.println(Numbers);
		for (int i = 0; i < Numbers.size(); i++) {
			if (Numbers.get(i) % 2 == 0) {

				EvenNumbers.add(Numbers.get(i));
			} else {

				oddNumbers.add(Numbers.get(i));

			}
		}
		System.out.println("Even Numbers :" + EvenNumbers);
		System.out.println("Odd Numbers :" + oddNumbers);
	}
}

