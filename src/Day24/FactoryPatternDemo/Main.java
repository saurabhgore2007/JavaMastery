package Day24.FactoryPatternDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Payment Type: ");
		String type = sc.nextLine();
		
		System.out.print("Enter Payment Amount: ");
		double amount = sc.nextInt();

		Payment payment = PaymentFactory.getPayment(type);

		payment.pay(amount);
		
		sc.close();
	}

}
