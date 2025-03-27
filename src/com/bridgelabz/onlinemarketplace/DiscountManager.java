package src.com.bridgelabz.onlinemarketplace;

public class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage){
        product.applyDiscount(percentage);
        System.out.println("Discount applied: " + percentage + "%");
    }
}
