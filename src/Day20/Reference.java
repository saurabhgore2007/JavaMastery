package Day20;

public class Reference {

	public static void main(String[] args) {

		Student s1 = new Student();
        Student s2 = new Student();

        s1 = s2;

        //Total 3 Objects Created In Memory
        System.out.println("Both references point to same object.");


	}

}
