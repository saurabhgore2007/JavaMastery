package Day10;

import java.util.LinkedHashSet;
import java.util.Set;

class Student
{
	public int id;
	public String studName;
	public float marks;

	public Student(){}

	public Student(int id, String studName, float marks)
	{
		this.id = id;
		this.studName = studName;
		this.marks = marks;
	}

	@Override
	public String toString()
	{
		return String.format("%10d %20s %10.2f", this.id, this.studName, this.marks);
	}

	@Override
	public boolean equals(Object t)
	{
		Student another = (Student)t;
		if(this.id == another.id && this.studName.equals(another.studName) && this.marks==another.marks)
			return true;

		return false;
	}

	@Override
	public int hashCode()
	{
		return studName.hashCode();
	}
}

public class SetEx2 {

	public static void main(String[] args) {

		Set<Student> students = new LinkedHashSet<Student>();

		students.add(new Student(101, "Pranav", 90.42f));	
		students.add(new Student(102, "Amit", 78.41f));		
		students.add(new Student(103, "Rahul", 89.42f));
		students.add(new Student(102, "Amit", 78.41f));		


		Student s1 = new Student(105, "Nitin", 88.24f);	
		Student s2 = new Student(104, "Nitin", 88.24f);	

		students.add(s1);
		students.add(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		
		for(Student item:students)
		{
			System.out.println(item);
		}


	}

}
