package src.com.bridgelabz.smartwarehouse;
import java.util.*;
public class Storage<T extends WarehouseItem> {
    public List<T> list=new ArrayList<>();

    public void addItem(T item){
        list.add(item);
    }

    public void display(){
        for(T item:list){
            item.showDetails();
        }
    }

    public List<T> getItem(){
        return list;
    }
}
