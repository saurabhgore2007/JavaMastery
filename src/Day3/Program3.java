package Day3;

import java.util.Scanner;

/*Program to find the largest element in an array.*/

public class Program3 {

	public static int largest(int[] arr) {
		int max = arr[0];
		for(int num : arr) {
			if(num > max)
				max = num;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		int n,max;
		System.out.print("Enter number of elements In array :- ");
		n = scan.nextInt();
		
		int[] array = new int[n];
		
		System.out.print("Enter Array elements :- ");
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Array Elements are :- ");
		for(int x : array) {
			System.out.print(x+",");
		}
		
		max = largest(array);
		System.out.println("\nLargest Elements is " + max);
		scan.close();
	}
}