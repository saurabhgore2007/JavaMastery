package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class __Employee{
	int id;
	String name;
	double salary;
	String department;
	String token;
	
	public __Employee() {
		
	}
	
	public __Employee(int id,String name,double salary,String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.salary + " " + this.department + " " + this.token;
	}
}

public class Task {

	public static void main(String[] args) {

		List<__Employee> empList = Arrays.asList(
				
				new __Employee(101,"Smith",10000,"I.T"),
				new __Employee(102,"Amit",15000,"C.S"),
				new __Employee(103,"Shubham",20000,"H.R"),
				new __Employee(104,"John",15000,"Electronics"),
				new __Employee(105,"Josh",160000,"CEO"),
				new __Employee(106,"Smith",60000,"I.T")
				);
	
		//Q.1
		Predicate<__Employee> sal = emp -> emp.salary>5000; 
		for(__Employee e : empList) {
			if(sal.test(e))
				System.out.println(e);
		}
		
		//Q.2
		Consumer<__Employee> info = System.out::println;
		for(__Employee emp : empList) {
			info.accept(emp);
		}

		//Q.3
		Function<__Employee,String> name = emp -> emp.name;
		for(__Employee emp : empList) {
			System.out.println(name.apply(emp));
		}

		//Q.4
		Random token = new Random();
		Supplier<String> Emptoken = () -> "Emp" + String.valueOf(1000 + token.nextInt(9000));
		for(__Employee emp : empList) {
			System.out.println(emp + " Token : " + Emptoken.get());
		}

		//Q.6
		Integer search = null;
		Optional<Integer> idOp = Optional.ofNullable(search); 
		System.out.println(idOp.orElse(18));
	
	}

}
