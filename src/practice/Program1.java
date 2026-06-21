package practice;

import java.util.Arrays;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(12,5,18,7,25,30,40);
//		Print only even numbers using Streams.
		System.out.println("even numbers");
		nums.stream().filter(n -> n%2==0).forEach(System.out::println);
		
//		Print the square of every number.
		System.out.println("Square numbers");
		nums.stream().map(n -> n*n).forEach(System.out::println);
		
//		Print only numbers greater than 20.
		System.out.println("numbers greater than 20");
		nums.stream().filter(n -> n>20).forEach(System.out::println);

//		Sort numbers in ascending order.
		System.out.println("ascending order");
		nums.stream().sorted().forEach(System.out::println);

//		Sort numbers in descending order.
		System.out.println("descending order");
		nums.stream().sorted((a,b) -> b-a).forEach(System.out::println);
		
		
		List<String> names =
				Arrays.asList(
				"Saurabh",
				"Amit",
				"Rahul",
				"Virat",
				"Shreyas",
				"Ajay");
//		names starting with 'S'.
		System.out.println("names starting with 'S'.");
		names.stream().filter(s -> s.startsWith("S")).forEach(System.out::println);

//		Convert all names to uppercase.
		System.out.println("Convert all names to uppercase.");
		names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		
//		Print the length of every name.
		System.out.println("Print the length of every name.");
		names.stream().map(s -> s +" -> "+ s.length()).forEach(System.out::println);

//		Sort alphabetically.
		System.out.println("Sort alphabetically.");
		names.stream().sorted().forEach(System.out::println);

//		Sort Reverse alphabetically.
		System.out.println("Sort Reverse alphabetically.");
		names.stream().sorted((s1,s2) -> s2.compareTo(s1)).forEach(System.out::println);
	}
}
