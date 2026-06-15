package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* WAP to create a class Employee and add them in arraylist. sort employees by their ids */

class Employee implements Comparable<Employee>{
	public int id;
	public String name;
	public double salary;

	public Employee(){}

	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return String.format("%10d %20s %10.2f", this.id, this.name, this.salary);
	}
	
	@Override
	public int compareTo(Employee another)
	{
        return Integer.compare(this.id, another.id);

	}
}

public class ArrayListEx4 {

	public static void main(String[] args) {

		List<Integer> x = new ArrayList<Integer>();

		x.add(82);
		x.add(90);
		x.add(64);
		x.add(10);

		Collections.sort(x);

		System.out.println(x);


		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(102, "Smith", 90000.00));
		empList.add(new Employee(104, "James", 17000.00));
		empList.add(new Employee(101, "Peter", 67000.00));
		empList.add(new Employee(103, "Eliz", 64000.000));

		//1,Sort
		System.out.println("Sorted");

		Collections.sort(empList);

		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
		//2.Shuffle
		System.out.println("Shuffle");

		Collections.shuffle(empList);

		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
		//3.Reverse
		System.out.println("Reverse");

		Collections.reverse(empList);

		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
		//4.Max
		System.out.println("Max");

		Employee maxEmp = Collections.max(empList);

        System.out.println(maxEmp);
		
		//5.Min
		System.out.println("Min");

		Employee minEmp = Collections.min(empList);

        System.out.println(minEmp);
                
        //6.rotate
		System.out.println("Rotate 1");
        Collections.rotate(empList, 1);

		for(Employee emp : empList)
		{
			System.out.println(emp);
		}

		//7.swap
		System.out.println("swap 0 to 1");
		Collections.swap(empList, 0, 2);
		for(Employee emp : empList)
		{
			System.out.println(emp);
		}

	}

}
