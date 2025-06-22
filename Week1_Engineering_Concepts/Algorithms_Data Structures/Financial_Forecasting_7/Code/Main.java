import java.util.*;
public class Main {
  public static void main(String[] args) {
     Scanner np = new Scanner(System.in);
     System.out.println("Enter Principal(Amount): ");
     double principal = np.nextDouble();
     System.out.println("Enter Rate(%): ");
     double rate = np.nextDouble();
     System.out.println("Enter Years: ");
     int years = np.nextInt();
     System.out.printf("Future Value after %d years: $:%.2f\n", years, Forecasting.futureValue(principal, rate, years));
     np.close();
  }
}
