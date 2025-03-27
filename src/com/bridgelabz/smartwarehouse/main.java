package src.com.bridgelabz.smartwarehouse;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Electronics e1=new Electronics("Phone", 24);
        Electronics e2=new Electronics("Laptop", 22);

        Groceries g1=new Groceries("Mushroom",4);
        Groceries g2=new Groceries("Cheese",7);

        Furniture f1=new Furniture("Sofa", 32);
        Furniture f2=new Furniture("Chair",45);

        List<WarehouseItem> ls=new ArrayList<>();
        ls.add(e1);
        ls.add(g1);
        ls.add(f1);

        Storage<Electronics> gls=new Storage<>();
//        gls.addItem(g1);
//        gls.addItem(g2);
        gls.addItem(e1);
        gls.addItem(e2);
//        gls.addItem(f1);
//        gls.addItem(f2);

        displayItems(gls.getItem());

    }

    public static void displayItems(List<? extends WarehouseItem> ls){
        for(WarehouseItem item:ls){
            item.showDetails();
        }
    }
}
