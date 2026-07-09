package Day24.FactoryPatternDemo;

public class PaymentFactory {

	private PaymentFactory() {
		
	}
	
	public static Payment getPayment(String paymentType) {
		
		if(paymentType == null) {
			throw new IllegalArgumentException("Payment type cannot be null.");
		}
		
		switch(paymentType.toUpperCase()) {
			
		case "UPI":
			return new UPIPayment();
		case "CREDITCARD":
			return new CreditCardPayment();
		case "NETBANKING":
			return new NetBankingPayment();
		default:
            throw new IllegalArgumentException("Invalid Payment Type: " + paymentType);
		}
	}
}
