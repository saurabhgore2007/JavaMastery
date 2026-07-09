package Day24.FactoryPatternDemo;

public class UPIPayment implements Payment{

	@Override
	public void pay(double amount) {
		
        System.out.println("Paid ₹" + amount + " using UPI.");

	}
}
