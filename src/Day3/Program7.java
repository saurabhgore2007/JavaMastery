package Day3;

import java.util.Scanner;

/* Task3
 * Private members: 
bcode                             : 4 digits code number 
bname                             : String 
innings, notout, runs             : integer type 
batavg                            : it is calculated according to the formula                                          
                                  : batavg =runs/(innings-notout)
calcavg()                         : Function to compute batavg 
Public members
readdata()                        : Function to accept value from bcode, name, innings, notout  and invoke the function  calcavg() 
displaydata()                     : Function to display the data members on the screen   */                                                       

class BatsMan{
	Scanner scan = new Scanner(System.in);
	
	private int bcode;
	private String bname;
	private int innings;
	private int notout;
	private int runs;
	private float batavg;
	
	private void calcAvg() {
		batavg =runs/(innings-notout);
	}
	
	public void readData() {
		System.out.print("Enter BatsMan code :- ");
		bcode = scan.nextInt();
		
		System.out.print("Enter BatsMan Name :- ");
		bname = scan.next();
		
		System.out.print("Enter BatsMan Innings :- ");
		innings = scan.nextInt();
		
		System.out.print("Enter BatsMan total Notout :- ");
		notout = scan.nextInt();
		
		System.out.print("Enter BatsMan Runs :- ");
		runs = scan.nextInt();
		
		calcAvg();
	}
	
	public void displayData() {
		System.out.println("BatsMan code : " + bcode);
		System.out.println("BatsMan Name : " + bname);
		System.out.println("BatsMan Innings : " + innings);
		System.out.println("BatsMan total Notout : " + notout);
		System.out.println("BatsMan Runs : " + runs);
		System.out.println("Average Runs : " + batavg);
	}

}

public class Program7 {
	
	public static void main(String[] args) {

		BatsMan b1 = new BatsMan();
		
		b1.readData();
		b1.displayData();
		
	}

}
