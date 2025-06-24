package AdapterPatternExample_4.code;

public class PayPalGateway {
  public void sendPayment(double amountInDollars) {
        System.out.println("Processing payment of $" + amountInDollars + " through PayPal.");
    }
}
