package src.com.bridgelabz.onlinemarketplace;

public abstract class Category {

    String name;

    Category(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
