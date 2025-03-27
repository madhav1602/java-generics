package src.com.bridgelabz.smartwarehouse;

public class Furniture extends WarehouseItem{
    private String name;
    private int warranty;

    public Furniture(String name, int warranty){
        this.name=name;
        this.warranty=warranty;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: "+name+" || Warranty(in months): "+warranty);
    }
}
