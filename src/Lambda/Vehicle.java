package Lambda;

public class Vehicle {

	public static void main(String[] args) {
	Car c=	()->{
			return 9;
		};
		System.out.println(c.speed());
		
	}

}
