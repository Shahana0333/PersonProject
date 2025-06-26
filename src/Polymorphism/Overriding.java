package Polymorphism;

public class Overriding {

	public static void main(String[] args) {
		Honda c1=new Honda();
		c1.color="Red";
		c1.height=34;
		System.out.println(c1.color);
		System.out.println(c1.height);
		c1.drive();
		c1.speed();
		
		Benz c2=new Benz();
		c2.color="Blue";
		c2.height=21;
		System.out.println(c2.color);
		System.out.println(c2.height);
		c2.drive();
		c2.speed();
		
		Bmw c3=new Bmw();
		c3.color="Grey";
		c3.height=65;
		System.out.println(c3.color);
		System.out.println(c3.height);
		c3.drive();
		c3.speed();
		}

}
