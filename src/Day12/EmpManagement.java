package Day12;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class _Employee{
	int id;
	String name;
	double salary;
	String department;
	
	public _Employee() {
		
	}
	
	public _Employee(int id,String name,double salary,String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	  public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.salary + " " + this.department;
	}
}

public class EmpManagement {

	public static void main(String[] args) {
		
		List<_Employee> empList = Arrays.asList(
				new _Employee(101,"John",20000,"I.T"),
				new _Employee(102,"Smith",15000,"C.S"),
				new _Employee(103,"Amit",10000,"Manager"),
				new _Employee(104,"Shubham",90000,"H.R"),
				new _Employee(105,"Amar",23500,"CEO"),
				new _Employee(106,"Josh",46000,"CEO"),
				new _Employee(107,"Smith",16000,"H.R"),
				new _Employee(108,"Keilvin",11000,"C.S"),
				new _Employee(109,"Lorem",19000,"Electronics"),
				new _Employee(110,"John",22000,"I.T")

			);
		
		//Q.1
		Predicate<_Employee> sal = emp -> emp.salary>5000; 
		for(_Employee e : empList) {
			if(sal.test(e))
				System.out.println(e);
		}
		
		//Q.2
		Consumer<_Employee> info = System.out::println;
		for(_Employee emp : empList) {
			info.accept(emp);
		}

		//Q.3
		Function<_Employee,String> name = emp -> emp.name;
		for(_Employee emp : empList) {
			System.out.println(name.apply(emp));
		}

		//Q.4
		Random token = new Random();
		Supplier<String> Emptoken = () -> "Emp" + String.valueOf(1000 + token.nextInt(9000));
		for(_Employee emp : empList) {
			System.out.println(emp + " Token : " + Emptoken.get());
		}

		//Q.6
		Integer search = null;
		Optional<Integer> idOp = Optional.ofNullable(search); 
		System.out.println(idOp.orElse(18));
		
		/*
		 * =========== Employee Portal ===========
		 * 
		 * 1.Add Employee
		 * 
		 * 2.Display Employees
		 * 
		 * 3.Print High Salary Employees
		 * 
		 * 4.Generate Employee Token
		 * 
		 * 5.Find Employee
		 * 
		 * 6.Exit
		 */
	}

}
