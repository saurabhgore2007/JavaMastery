package Day24.StratagyPattern;

public class Main {

	public static void main(String[] args) {

		DiscountStrategy strategy = new PremiumDiscount();

		DiscountService service = new DiscountService(strategy);
		System.out.println(service.getFinalPrice(10000));
	}

}
