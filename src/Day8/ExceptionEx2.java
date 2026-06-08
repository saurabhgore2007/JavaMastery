package Day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int arr[] = {11,12,13,14,15};
		int index;
		
		try {
			System.out.print("Enter Index to Print Value :- ");
			index = scan.nextInt();
			System.out.print("Number at Index " + index +" is " + arr[index]) ;
		}
		catch(InputMismatchException ex) {
			System.out.print("Please Enter an Integer Value.");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("\nIndex should be between 0 to " + arr.length);
		}
		catch(Exception ex) {
			System.out.println("\nUnhandled Error occured. Retry" + ex);
		}
		finally {
			System.out.println("\nAll lines in a programming successfully interpreted");
		}
		
		scan.close();
	}

}
