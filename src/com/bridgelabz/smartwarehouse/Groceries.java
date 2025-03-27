package src.com.bridgelabz.smartwarehouse;

public class Groceries extends WarehouseItem{
    private String name;
    private int warranty;

    public Groceries(String name, int warranty){
        this.name=name;
        this.warranty=warranty;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: "+name+" || Warranty(in days): "+warranty);
    }
}
