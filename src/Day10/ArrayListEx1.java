package Day10;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList x = new ArrayList();
		
		x.add(10);
		x.add(20);

		System.out.println("Array List x = " + x);
		System.out.println("Array List values = " + x.get(0)+ "\t" + x.get(1));

		int sum = (int)x.get(0) + (int)x.get(1);
		System.out.println("Addition = " + sum);

		x.add(true);
		x.add("Java");
		x.add('S');
		x.add(100.50f);
		
		System.out.println("\nArray list x = " + x);

		
		
		//Using Generic
		ArrayList<Integer> y = new ArrayList<Integer>();

		y.add(194);
		y.add(170);
		y.add(15);
				
		System.out.println("ArrayList y = " + y);
				
//		y.remove(new Integer(170));
		y.remove(Integer.valueOf(170));
		System.out.println("ArrayList y = " + y);
				
		y.add(1,300);
		System.out.println("Added 300 at 1 to ArrayList y = " + y);
				
		y.set(0, 2000);
		System.out.println("Changed Value to 0 index ArrayList y = " + y);
				
		y.addFirst(500);
		System.out.println("Added First to ArrayList y = " + y);
		
		y.addLast(600);
		System.out.println("Added Last to ArrayList y = " + y);

		System.out.println("Get First ArrayList y = " + y.getFirst());
		System.out.println("Get Last ArrayList y = " + y.getLast());
		
		y.removeFirst();
		System.out.println("Removed First ArrayList y = " + y);

		System.out.println("Class of ArrayList y = " + y.getClass());
		System.out.println("Last index of ArrayList y = " + y.lastIndexOf(y));

		System.out.println(y.size());
		
	}
}
