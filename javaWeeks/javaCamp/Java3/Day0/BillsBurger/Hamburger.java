public class Hamburger{
    //Instance Field:
    private String name; private String meat; private double price; private String breadRollType; 
    String addition1Name; double addition1Price; String addition2Name; double addition2Price;
    String addition3Name; double addition3Price; String addition4Name; double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public double itemizeHamburger(){
        System.out.println("\t Your Receipt"); 

        //only add numbers that aren't null:
        System.out.println("0." + this.name + " ....... " + this.price);

        if(addition1Name != null){
            this.price += addition1Price;
            System.out.println("1." + addition1Name + " ....... " + addition1Price);
        }
        if(addition2Name != null){
            this.price += addition2Price;

            System.out.println("2." + addition2Name + " ....... " + addition2Price );
        }
        if(addition3Name != null){
            this.price += addition3Price;
            System.out.println("3." + addition3Name + " ....... " + addition3Price);
        }
        if(addition4Name != null){
            this.price += addition4Price;
            System.out.println("4. " + addition4Name + " ....... " + addition4Price);
        }
        System.out.println("Price: " + price);
        return price;
    }
        //Instance Methods:
        public void addHamburgerAddition1(String addition1Name,double addition1Price){
            this.addition1Name = addition1Name;
            this.addition1Price = addition1Price;
        }
        public void addHamburgerAddition2(String addition2Name,double addition2Price){
            this.addition2Name = addition2Name;
            this.addition2Price = addition2Price;
        }
        public void addHamburgerAddition3(String addition3Name,double addition3Price){
            this.addition3Name = addition3Name;
            this.addition3Price = addition3Price;
        }
        public void addHamburgerAddition4(String addition4Name,double addition4Price){
            this.addition4Name = addition4Name;
            this.addition4Price = addition4Price;
        }
    public String getMeat() {
        return meat;
    }
    public String getBreadRollType() {
        return breadRollType;
    }
}