import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        this.products.add(p);
    }

    public void showAllProducts(){
    for(Product p :products){
        System.out.println(p);
    }
    }

    public void findProductWithName(String name) {
        List<Product> product = this.products.stream().filter(item -> item.getName().equals(name)).toList();
        System.out.println(product);
    }

    public void findProductWithPlace(String placeName) {
        List<Product> product = this.products.stream().filter(item -> item.getPlaceName().equals(placeName)).toList();
        System.out.println(product);
    }

    public void findProductWithOutOfWarranty(int warranty) {
        List<Product> product = this.products.stream().filter(item -> item.getWarranty() > 1).toList();
        System.out.println(product);
    }
}
