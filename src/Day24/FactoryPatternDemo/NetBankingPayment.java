package Day24.FactoryPatternDemo;

public class NetBankingPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Net Banking.");

    }
}