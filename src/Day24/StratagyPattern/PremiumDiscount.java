package Day24.StratagyPattern;

public class PremiumDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.10;
    }
}