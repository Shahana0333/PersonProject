package Lambda;

public class Operations {

	public static void main(String[] args) {
		Calculate add=(a,b)-> a+b;
			System.out.println(add.calculate(3, 4));
		
        Calculate sub=(a,b)->a-b;
        System.out.println(sub.calculate(6, 2));
	}

}
