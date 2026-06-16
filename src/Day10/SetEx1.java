package Day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {

	public static void main(String[] args) {

		Set users = new HashSet();
		
		users.add("Smith");
		users.add(100);
		users.add(10.64f);
		users.add(true);
		users.add("Smith");
		users.add("smith");

		System.out.println(users);
		
		Set colors = new LinkedHashSet();
		colors.add("Red");
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Green");
		colors.add("Blue");

		System.out.println(colors);

		Set numbers = new TreeSet();
		numbers.add(134);
		numbers.add(10);
		numbers.add(10);
		numbers.add(104);
		numbers.add(451);
		numbers.add(140);

		System.out.println(numbers);

	}

}
