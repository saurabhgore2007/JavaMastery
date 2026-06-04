package Day2;

import java.util.Scanner;

/* Task6
 * The policy followed by a company to process customer orders is given by the following rules: 
a. If a customer order is less than or equal to that in stock and has credit is OK, supply has requirement. 
b. If has credit is not OK do not supply. Send him intimation. 
c. If has credit is Ok but the item in stock is less than has order, supply what is in stock. Intimate to 
him data the balance will be shipped.
Write a program to implement the company policy.*/


public class Program14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int order,stock;
		boolean creditOk;
		
		System.out.print("Enter items in Stock :- ");
		stock = scan.nextInt();
		System.out.print("Enter Order Quantity :- ");
		order = scan.nextInt();
		System.out.print("Enter Customer Credit is Ok (true/false):- ");
		creditOk = scan.nextBoolean();
		
		if(creditOk) {
		  if(order<=stock) {
		    	System.out.println("Supply " + order + " items to Customer");
		  }
		  else {
		    	System.out.println("Supply " + stock + " items to Customer Balance/remaining "+(order-stock)+" Order will shipped later.");

		  }
		}
		else {
	    	System.out.println("Customer Credit is NOt Ok!");
		}
		
		scan.close();
	}

}
