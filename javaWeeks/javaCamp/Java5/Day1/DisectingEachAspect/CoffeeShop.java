import java.util.ArrayList;

public abstract class CoffeeShop{
    //Instance Field:
    private String name;
    
    public CoffeeShop(String name){
        this.name = name;
    }
    //Access Modifer:
    public String getName() {
        return name;
    }

    //What do all Coffee Shops share?
    abstract double coffeePrice();
    abstract ArrayList <String> customerOrder();
    abstract void foodMenu();


}