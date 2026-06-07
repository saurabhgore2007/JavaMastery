package Week1Challenges;

import java.util.Scanner;

//2 WAP to input side of a square and calculate the area. [Area of square: side*side] 

public class Ass1Q2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float side,area;
		System.out.print("Enter Side of Square :- ");
		side = scan.nextFloat();
		
		area = side*side;
		
		System.out.println("Area of Square Having Side " + side + " is "+area);
		scan.close();
	}

}
