package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Company {

	public static void main(String[] args) {
		List<Students> stds = new ArrayList<Students>();
		Students s1 = new Students();
		s1.setName("Shahana");
		s1.setId(1);
		s1.setAge(23);

		Students s2 = new Students();
		s2.setName("Shanes");
		s2.setId(2);
		s2.setAge(30);

		Students s3 = new Students();
		s3.setName("Shamna");
		s3.setId(3);
		s3.setAge(23);

		stds.add(s1);
		stds.add(s2);
		stds.add(s3);
		for (Students s : stds) {
			System.out.println("Name : " + s.getName());
			System.out.println("ID : " + s.getId());
			System.out.println("Age : " + s.getAge());
		}

	}
}