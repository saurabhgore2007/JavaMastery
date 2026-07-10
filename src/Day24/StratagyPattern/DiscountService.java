package Day24.StratagyPattern;

public class DiscountService {

	private DiscountStrategy strategy;
	
	public DiscountService(DiscountStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double getFinalPrice(double amount) {
		return amount - strategy.calculate(amount);
	}
}
