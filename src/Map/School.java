package Map;

import java.util.HashMap;
import java.util.Map;

public class School {

	public static void main(String[] args) {
		Map<Integer, String>students=new HashMap<Integer, String>();
		students.put(1, "Shahana");
        students.put(2, "Shanees");
		students.put(3, "Rahul");
		students.put(4, "Ramya");
		students.put(5, "Subnas");
		for(Map.Entry<Integer, String>entry:students.entrySet()) {
			System.out.println("ID:"+entry.getKey()+", NAME:"+entry.getValue());
		}
		
		
		
	}

}
