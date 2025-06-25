package Inheritance;

public class Hotel {

	public static void main(String[] args) {
		Biriyani b1 = new Biriyani();
		b1.type = "Malabari biriyani";
		b1.price = 150;
		System.out.println(b1.price);
		b1.taste();

		Dosa d1 = new Dosa();
		d1.type = "Masala Dosa";
		d1.price = 90;
		System.out.println(d1.price);
		d1.taste();

		Idly i1 = new Idly();
		i1.type = "Normal";
		i1.price = 20;
		System.out.println(i1.price);
		i1.taste();

	}

}
