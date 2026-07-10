package Day24.StratagyPattern;

public class FestivalDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.20;
    }
}