import java.util.ArrayList;

public class Branch {
    private String name;
    // List of Customers in Array
    private ArrayList <Customer> customers;

    //Constructor Method
    public Branch(String name){
        this.name  = name;
        this.customers = new ArrayList<Customer>();
    }

    //Instance Methods:
    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String customerName, double initialAmount){
        /** Functions Check if Customer exists in the system, if not it will initialize Customer w/ parameters */

        if(findCustomer(customerName) == null){
            //This will be added into the Array of Customers
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            //Customer on File:
            existingCustomer.addTransactions(amount);
            return true;
        }
        //Unable to find Customer:
        return false;
    }
    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
