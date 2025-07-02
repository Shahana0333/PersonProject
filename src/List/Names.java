package List;

import java.util.ArrayList;

public class Names {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Shana");
		name.add("Shanees");
		name.add("Shamna");
		name.add("Rahul");
		name.add("Shahal");
		System.out.println(name);
		// removing
		name.remove(2);
		System.out.println(name);
		// adding in first&middle
		name.add(0, "Kishore");
		name.add(2, "Shalu");
		System.out.println(name);
		// searching for item
		if (name.contains("Seetha")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// find size
		int size = name.size();
		System.out.println(size);

	}
}
