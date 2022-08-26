public class HealthyBurger extends Hamburger{
    //Instance Field:
    String healthyExtra1Name;
    double healthyExtra1Price;
    String healthyExtra2Name;
    double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy Burger", meat, price, "Vegan Bread");
    }
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = healthyExtra1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    @Override
    public double itemizeHamburger() {
        double sumTotal = super.itemizeHamburger();
        sumTotal += this.healthyExtra1Price + this.healthyExtra2Price;
        return sumTotal;
    }
}