import java.util.ArrayList;

public class Starbucks extends CoffeeShop{

    public Starbucks(String orderName) {
        super(orderName);
    }

    @Override
    double coffeePrice() {
        double priceOfCoffee = 5.76;
        return priceOfCoffee;
    }

    @Override
    int totalPriceOfCoffee() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    ArrayList customerOrder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    void foodMenu() {
        // TODO Auto-generated method stub
        
    }
    
}
