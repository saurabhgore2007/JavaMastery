package Day10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {

		Queue<String> customers = new LinkedList<String>();
		
		customers.add("Smith");
		customers.add("James");
		customers.add("Harry");
		customers.add("Peter");
		customers.add("Eliz");

		customers.offer("Nitin");
		customers.offer("Vivek");

		System.out.println("Customer Details");
		for(String cust : customers)
		{
			System.out.println(cust);
		}

		customers.remove();
		customers.remove();

		System.out.println("\nCustomer after Remove");
		for(String cust : customers)
		{
			System.out.println(cust);
		}

		System.out.println("\nElelment");
		System.out.println(customers.element());
		System.out.println("\nPeek");
		System.out.println(customers.peek());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.offer(30);
		pq.offer(10);
		pq.offer(20);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		

	}
}
