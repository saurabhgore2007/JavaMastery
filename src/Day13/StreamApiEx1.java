package Day13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiEx1 {

	public static void main(String[] args) {

		//Stream API with Method References
		List<String> names = Arrays.asList("Ram","Amit","Rahul");
		names.forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(10,15,20,25,30);
		nums.stream().filter(n->n%2==0).forEach(System.out::println);
		
		List<String> studNames =Arrays.asList(
				"Saurabh",
				"Rahul",
				"Sachin",
				"Amit",
				"Shreyas");
		
		studNames.stream().filter(s->s.startsWith("S")).forEach(System.out::println);
		
		//Print only numbers greater than 15 using Streams.
		List<Integer> numbers = Arrays.asList(5,10,15,20,25,30);
		numbers.stream().filter(num->num>15).forEach(System.out::println);;

//		Print only names having more than 6 characters.
		List<String> _names =
				Arrays.asList(
				"Virat",
				"Sachin",
				"Rahul",
				"Saurabh",
				"Sehwag",
				"Dhoni");
		
		_names.stream().filter(s->s.length()>6).forEach(System.out::println);
		
		//map
		List<Integer> num = Arrays.asList(10,20,30);
		List<Integer> list = num.stream().map(n -> n*n).toList();
		list.forEach(System.out::println);
		
		_names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		_names.stream().map(s -> s.length()).forEach(System.out::println);
		
		
		
	}

}
