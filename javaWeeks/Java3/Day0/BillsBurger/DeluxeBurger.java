public class DeluxeBurger extends Hamburger{
    //Instance Field:
    //Constructor Method:
    public DeluxeBurger(double drink, double fries){
        super("Deluxe Burger", "Beef", 12.10, "Brioche");
        drink = 2.00;
        fries = 5.00;
    }
    @Override
    public void addHamburgerAddition1(String addition1Name,double addition1Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }

}