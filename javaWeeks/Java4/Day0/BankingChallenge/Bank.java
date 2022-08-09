package BankingChallenge;

import java.util.ArrayList;

public class Bank {
    //Instance Field:
    private String name;
    private ArrayList <Branch> branches;
    //Constructor Method:
    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList <Branch>();

    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            //Array will contain a bunch of Branches:
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        //Checks if Branch exists then see if customers is valid , if Valid add customer into Array of the Branches
        Branch branch = findBranch(branchName);
        if(branchName != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            //So Cool that you can reference back to several classes.

            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransactions){
        //We want to pull up the transactions from a single customer so we would access [ Specific Branch, Specific Customer, Specific Customer Logs]
        Branch branches = findBranch(branchName);
        if(branchName != null){
            System.out.println("Customer details for branch: " + branches.getName());

            //Gathers Customer Array List:
            ArrayList <Customer> branchCustomers = branches.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++){
                Customer customers = branchCustomers.get(i);
                System.out.println("Customer: " + customers.getName() + "[" + i+1 + "]");
                if(showTransactions){
                    //Access Customer Array Now
                    System.out.println("Transactions");
                    //Accessing Customers Transactions through loop.
                    ArrayList <Double> transactions = branchCustomers.get(i).getTransactions();

                    //We got the Customer Profile now we're just getting all transactions.
                    for(int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
