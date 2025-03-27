package src.com.bridgelabz.onlinemarketplace;
import java.util.*;
public class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (Product<?> product : products) {
            product.displayProductInfo();
        }
    }
}
