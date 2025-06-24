package AdapterPatternExample_4.code;

public class StripeGateway {
   public void makePayment(double amountInUSD) {
        System.out.println("Charging $" + amountInUSD + " using Stripe.");
    }
}
