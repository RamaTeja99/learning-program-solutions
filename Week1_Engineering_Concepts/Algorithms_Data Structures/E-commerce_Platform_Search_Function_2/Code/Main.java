import java.util.*;
public class Main {
  public static void main(String[] args) {
    List<Product> products=new ArrayList<>();
    Scanner np = new Scanner(System.in);
    products.add(new Product("HP Laptop","Laptop",10000));
    products.add(new Product("Sumsung","Mobile",5000));
    products.add(new Product("Ipad","Tablet",3000));
    products.add(new Product("Sony Camera","Camera",4000));

    String name= np.nextLine();
    System.out.println("Linear Search Result: "+SearchService.linearSearch(products,name));
    System.out.println("Binary Search Result: "+SearchService.binarySearch(products,name));
    np.close();
  }
}
