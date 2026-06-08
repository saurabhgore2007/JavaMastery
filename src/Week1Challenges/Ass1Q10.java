package Week1Challenges;

import java.util.Scanner;

/*WAP to input employee details as id, basic salary and calc the allowances of each of 5 employees 
as follow: 
   1. if bsal>=15000 then da = 15%     
   2. if bsal>=10000  then hra = 7% 
   3. if bsal<5000  then cca = 12% 
   display gross salary of each employee*/
   
class Employees{
	Scanner scan = new Scanner(System.in);

	private int id;
	private int basicSal;
	private double allowance;
	private double grossSal;
	
	public Employees() {
		this.id = 0;
		this.basicSal = 0;
		this.allowance = 0;
		this.grossSal = 0;
	}
	
	public void input() {
		
		System.out.print("\nEnter Employee Id :- ");
		this.id = scan.nextInt();
		System.out.print("Enter Employee Basic Salary :- ");
		this.basicSal = scan.nextInt();
	}
	
	public double calcAllowance() {
		if(this.basicSal>=15000) {
			this.allowance = basicSal*0.15;
		}
		else if(this.basicSal>=10000) {
			this.allowance = basicSal*0.07;
		}
		else if(this.basicSal<5000) {
			this.allowance = basicSal*0.12;
		}
		this.grossSal = this.basicSal + this.allowance;
		return this.allowance;
	}
	
	public void display() {
		System.out.println("\nEmployee Id : " + this.id);
		System.out.println("Employee Basic Salary : " + this.basicSal);
		System.out.println("Employee Total Allowance : " + this.allowance);
		System.out.println("Employee Gross Salary : " + this.grossSal);
	}
}

public class Ass1Q10 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter How many Employees to add ");
		int n = scan.nextInt();
		
		Employees emp[] = new Employees[n];
		
		for(int i = 0;i<emp.length;i++) {
			
			emp[i] = new Employees();
			emp[i].input();
			emp[i].calcAllowance();
			emp[i].display();
		}
		scan.close();
	}

}
