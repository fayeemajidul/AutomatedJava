import java.util.ArrayList;

public class DunkinDonuts extends CoffeeShop{
    private ArrayList <String> order;
    public DunkinDonuts(String orderName) {
        super(orderName);
        order = new ArrayList<String>();
    }
    @Override
    ArrayList <String> customerOrder() {
        return null;
    }

    @Override
    void foodMenu() {        
    }
    @Override
    double coffeePrice() {
        return 0;
    }
    
}
