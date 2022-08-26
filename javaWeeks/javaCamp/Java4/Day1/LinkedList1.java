public class LinkedList1{
    private String name;
    private double balance;
    public LinkedList1(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    //Instance Methods:
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
}