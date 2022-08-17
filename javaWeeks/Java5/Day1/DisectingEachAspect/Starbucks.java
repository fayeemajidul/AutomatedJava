import java.util.ArrayList;
import java.util.Scanner;

public class Starbucks extends CoffeeShop implements Itips{
    private static Scanner scan = new Scanner(System.in);
    public Starbucks(String orderName) {
        super(orderName);
    }

    @Override
    double coffeePrice() {
        double priceOfCoffee = 5.76;
        return priceOfCoffee;
    }

    @Override
    ArrayList <String> customerOrder() {
        ArrayList <String> customerString = new ArrayList<String>();
        double gratitude = gratitudePercent();
        customerString.add("Name: " + getName());
        customerString.add( "Coffee: " + String.valueOf(coffeePrice()));
        customerString.add("Gratituity: " + String.valueOf(gratitude));
        double totalPrice = coffeePrice() + (1*gratitude);
        customerString.add("Total: " + String.valueOf(totalPrice));
        System.out.println("Order for " + getName() + ":\nReceipt: ");
        return customerString;
    }

    @Override
    void foodMenu() {
        System.out.println("\nWe only serve coffee at one size, sorry for the inconvenience. Your receipt is below.");        
    }
    @Override
    public String getName() {
        return super.getName();
    }

    public void starBucksOrder(){
        foodMenu();
        System.out.println(customerOrder());
    }

    @Override
    public double gratitudePercent() {
        double coffeeP = coffeePrice();
        System.out.println("Please choose your available options in order to tip: 0% , 10%, 15%, 20%, 25% ");
        int gratPercent = scan.nextInt();
        switch(gratPercent){
            case 0:
                return 0;
            case 10:
                coffeeP *= .1;
                return coffeeP;
            case 15:
                coffeeP *= .15;
                return coffeeP;
            case 20:
                coffeeP *= .20;
                return coffeeP;
            case 25:
                coffeeP *= .25;
                return coffeeP;
        }
        return 0;
    }
}
