public class Forecasting{
  public static double futureValue(double principal, double rate, int years){
    if(years==0){
      return principal;
    }
    return (1+rate)*futureValue(principal, rate, years-1);
  }
}