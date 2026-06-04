package Day2;

import java.util.Scanner;

/* Task5
 * A library charges a fine for every book returned late. For first 5 days the fine is 50 paise, for 6-10 days fine is 
one rupee and above 10 days fine is 5 rupees. If you return the book after 30 days your membership will be 
cancelled. Write a program to accept the number of days the member is late to return the book and display 
the fine or the appropriate message.*/

public class Program13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int days;
		
		System.out.print("Enter Number of Days Member is Late :- ");
		days = scan.nextInt();
		
		if(days <=0)
			System.out.println("No Fine.");
		else if(days <=5)
			System.out.println("Fine : 50 paise");
		else if(days <=10)
			System.out.println("Fine : 1 Rupee");
		else if(days <=30)
			System.out.println("Fine : 5 Rupee");
		else
			System.out.println("Membership is Cancelled.");

		scan.close();		
	}

}
