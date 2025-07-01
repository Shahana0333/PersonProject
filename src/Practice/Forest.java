package Practice;

import java.util.Random;

public class Forest {

	public static void main(String[] args) {
		Animals a1 = new Elephant1();
		a1.Strength = 100;
		a1.Number = 1;
		a1.eat();

		Animals a2 = new Elephant2();
		a2.Strength = 120;
		a2.Number = 2;
		a2.eat();

		Animals a3 = new Tiger();
		a3.Strength = 90;
		a3.Number = 5;
		a3.eat();

		Animals a4 = new Lion();
		a4.Strength = 95;
		a4.Number = 4;
		a4.eat();

		Animals a5 = new Dear();
		a5.Strength = 40;
		a5.Number = 7;
		a5.eat();

		Animals a6 = new Rabbit();
		a6.Strength = 10;
		a6.Number = 3;
		a6.eat();

		Animals a7 = new Fox();
		a7.Strength = 40;
		a7.Number = 8;
		a7.eat();

		Animals a8 = new Snake();
		a8.Strength = 12;
		a8.Number = 6;
		a8.eat();

		// to randomly pick 2 animals
		Random random = new Random();
		int number1 = random.nextInt(8) + 1;
		int number2 = random.nextInt(8) + 1;
		while (number2 == number1) {
			number2 = random.nextInt(8) + 1;
		}
		System.out.println("Picking any two animals randomly to fight:" + number1 + " VS " + number2);

		String Player1Name = "";
		int Player1Stregth = 0;

		if (number1 == a1.Number) {
			Player1Name = "Elephant1";
			Player1Stregth = a1.Strength;
		} else if (number1 == a2.Number) {
			Player1Name = "Elephant2";
			Player1Stregth = a2.Strength;
		} else if (number1 == a3.Number) {
			Player1Name = "Tiger";
			Player1Stregth = a3.Strength;
		} else if (number1 == a4.Number) {
			Player1Name = "Lion";
			Player1Stregth = a4.Strength;
		} else if (number1 == a5.Number) {
			Player1Name = "Dear";
			Player1Stregth = a5.Strength;
		} else if (number1 == a6.Number) {
			Player1Name = "Rabbit";
			Player1Stregth = a6.Strength;
		} else if (number1 == a7.Number) {
			Player1Name = "Fox";
			Player1Stregth = a7.Strength;
		} else if (number1 == a8.Number) {
			Player1Name = "Snake";
			Player1Stregth = a8.Strength;
		}

		String Player2Name = "";
		int Player2Stregth = 0;

		if (number2 == a1.Number) {
			Player2Name = "Elephant1";
			Player2Stregth = a1.Strength;
		} else if (number2 == a2.Number) {
			Player2Name = "Elephant2";
			Player2Stregth = a2.Strength;
		} else if (number2 == a3.Number) {
			Player2Name = "Tiger";
			Player2Stregth = a3.Strength;
		} else if (number2 == a4.Number) {
			Player2Name = "Lion";
			Player2Stregth = a4.Strength;
		} else if (number2 == a5.Number) {
			Player2Name = "Dear";
			Player2Stregth = a5.Strength;
		} else if (number2 == a6.Number) {
			Player2Name = "Rabbit";
			Player2Stregth = a6.Strength;
		} else if (number2 == a7.Number) {
			Player2Name = "Fox";
			Player2Stregth = a7.Strength;
		} else if (number2 == a8.Number) {
			Player2Name = "Snake";
			Player2Stregth = a8.Strength;
		}
		System.out.println(Player1Name + " vs " + Player2Name);
		System.out.println("Strengths: " + Player1Stregth + " vs " + Player2Stregth);
		System.out.println("Both the Animals start fighting..");
		if (Player1Stregth > Player2Stregth) {
			System.out.println("THE WINNER IS " + Player1Name);
		} else {
			System.out.println("THE WINNER IS " + Player2Name);
		}

	}
}
