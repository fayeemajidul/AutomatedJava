public class DeluxeBurger extends Hamburger{
    //Instance Field:
    //Constructor Method:
    public DeluxeBurger(){
        super("Deluxe Burger", "Beef", 
        12.00, "Brioche"); 

        //You Could Refer back to Super Methods: Parent Methods:

        super.addHamburgerAddition1("Chips", 4.0);
        super.addHamburgerAddition2("Drink", 3.0);
    }
    public void addHamburgerAddition1(String addition1Name,double addition1Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
}