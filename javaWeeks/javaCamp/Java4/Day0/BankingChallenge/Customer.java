import java.util.ArrayList;

public class Customer {
    //Instance Field:
    private String name;
    private ArrayList <Double> transactions;

    //Constructor Method:
    public Customer(String name, double initialAmount){
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransactions(initialAmount);
    }

    //Instance Methods:
    /** Adds Balance into Element specific to the Customer */
    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    //Accessor Methods:
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
