package src.com.bridgelabz.onlinemarketplace;

public class Product<T extends Category>{
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public double getPrice(){
        return price;
    }
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
        }
    }
    public void displayProductInfo() {
        System.out.println("Product: " + name + " | Price: $" + price + " | Category: " + category.getName());
    }
}

