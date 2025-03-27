package src.com.bridgelabz.onlinemarketplace;

public class OnlineMarketPlace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 1000, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory());


        // Creating Catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.displayCatalog();
    }


}
