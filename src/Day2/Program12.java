package Day2;

import java.util.Scanner;

/*Task4
A certain grade of steel is graded according to the following conditions: 
(i) Hardness must be greater than 50 
(ii) Carbon content must be less than 0.7 
(iii) Tensile strength must be greater than 5600 
The grades are as follows: 
Grade is 10 if all three conditions are met 
Grade is 9 if conditions (i) and (ii) are met 
Grade is 8 if conditions (ii) and (iii) are met 
Grade is 7 if conditions (i) and (iii) are met 
Grade is 6 if only one condition is met 
Grade is 5 if none of the conditions are met 
Write a program, which will require the user to give values of hardness, carbon content and tensile strength 
of the steel under consideration and output the grade of the steel 
*/

public class Program12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float hardness,carbon,tensile;
		byte grade;
		
		System.out.print("Enter Hardness of Steel :- ");
		hardness = scan.nextFloat();
		System.out.print("Enter Carbon of Steel :- ");
		carbon = scan.nextFloat();
		System.out.print("Enter Tensile of Steel :- ");
		tensile = scan.nextFloat();
		
		if(hardness>50 && carbon<0.7 && tensile>5600) 
			grade = 10;
		else if(hardness>50 && carbon<0.7) 
			grade = 9;
		else if(carbon<0.7 && tensile>5600) 
			grade = 8;
		else if(hardness>50 && tensile>5600) 
			grade = 7;
		else if(hardness>50 || carbon<0.7 || tensile>5600) 
			grade = 6;
		else
		    grade =5;
		
		System.out.println("Grade of Steel : " + grade);
		
		scan.close();
	}

}
