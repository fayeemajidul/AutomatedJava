public class Main{
    //Instance Field:
    //Constructor Method:
    public Main(){}
    //Instance Method:
    public static void main(String[] args) {
        Hamburger fiveguys = new Hamburger("Fayeem", "Beef", 12, "Brioche");
        fiveguys.addHamburgerAddition1("Pickles", 1.00);
        fiveguys.addHamburgerAddition2("Bacon", 3.00);
        fiveguys.addHamburgerAddition3("Tomato", .50);
        fiveguys.addHamburgerAddition4("Cheese", 1.00);
        System.out.println(fiveguys.itemizeHamburger());

    }
}