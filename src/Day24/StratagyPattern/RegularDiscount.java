package Day24.StratagyPattern;

public class RegularDiscount implements DiscountStrategy {

	@Override
	public double calculate(double amount) {
        return amount * 0.05;
    }
}
