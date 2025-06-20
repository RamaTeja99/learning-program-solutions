import java.util.*;

public class SearchService {
  public static Product linearSearch(List<Product> products,String name){
    for(Product product:products){
      if(product.getName().equalsIgnoreCase(name))
        return product;
    }
    return null;
  }
  public static Product binarySearch(List<Product> products,String name){
    products.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
    int low=0;
    int high=products.size()-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(products.get(mid).getName().equalsIgnoreCase(name))
        return products.get(mid);
      else if(products.get(mid).getName().compareTo(name)>0)
        high=mid-1;
      else
        low=mid+1;
    }
    return null;
  }
}
