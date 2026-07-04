package Day20;

class Employee {

    String name;

}


public class GarbageCollection {

	public static void main(String[] args) {

		Employee e = new Employee();

	        e = null;

	        System.gc();

	        System.out.println("Object is eligible for GC.");
	}

}
