package Polymorphism;

public class Overloading {

	public int print(int a, int b) {
		return a + b;
	}

	public String print(String c) {
		return c;

	}

	public double print(double x) {
		return x;
	}

	public boolean print(boolean y) {
		return y;
	}

	public static void main(String[] args) {
		Overloading d = new Overloading();
		System.out.println(d.print(3, 50));
		System.out.println(d.print("Shahana"));
		System.out.println(d.print(1.78899));
		System.out.println(d.print(false));
	}

}
