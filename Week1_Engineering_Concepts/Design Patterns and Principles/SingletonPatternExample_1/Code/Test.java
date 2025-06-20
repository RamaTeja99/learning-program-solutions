public class Test {
  public static void main(String[] args) {
    Logger l1 = Logger.getInstance();
    Logger l2 = Logger.getInstance();
    Logger l3 = Logger.getInstance();
    System.out.println(l1 == l2 && l2 == l3); //It shows that all the instances are same object by using singleton pattern
    //If true it means same objects are created using singleton pattern else if false it means different objects are created
  }
}
 
