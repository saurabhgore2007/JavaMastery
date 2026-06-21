package Day13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIEx3 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 20, 10, 30, 20, 40);
		
		//distinct()-removes duplicate's
		System.out.println("Distict Elements");
		nums.stream().distinct().forEach(System.out::println);
		
		//limit()
		System.out.println("Limit Elements");
		nums.stream().limit(3).forEach(System.out::println);
		
		//skip()
		System.out.println("Skip n Elements");
		nums.stream().skip(3).forEach(System.out::println);
		
		//count()
		System.out.println("count Elements");
		long count = nums.stream().count();
		System.out.println(count);

		//findFirst()
		System.out.println("Get first");
		Optional<Integer> first = nums.stream().findFirst();
		first.ifPresent(System.out::println);

		//findAny()
		System.out.println("Find Any");
		Optional<Integer> any = nums.stream().findAny();
		any.ifPresent(System.out::println);

		//anyMatch()
		System.out.println("Any match");
		boolean result1 = nums.stream().anyMatch(n -> n>25);
		System.out.println(result1);
		
		//allMatch()
		System.out.println("all match");
		boolean result2 = nums.stream().allMatch(n -> n<50);
		System.out.println(result2);
		
		//noneMatch()
		System.out.println("none match");
		boolean result3 = nums.stream().noneMatch(n -> n<0);
		System.out.println(result3);

		//min
		System.out.println("min");
		Optional<Integer> min = nums.stream().min(Integer::compare);
		System.out.println(min.get());
		
		//max
		System.out.println("max");
		Optional<Integer> max = nums.stream().max(Integer::compare);
		System.out.println(min.get());

		//reduce
		System.out.println("reduce");
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		int sum = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
