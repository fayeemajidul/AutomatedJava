public class BankAccount{
    private int accountNumber; private int balance; private String name; private String email; int phoneNumber;
    
    //Constructor Method [Skips Initialization]:
    public BankAccount(){
        System.out.println("Empty Constructor Called");
    }



    //Mutator Methods: [Setters]:
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void balance(int balance){
        this.balance = balance;
    }
    public void name(String name){
        this.name = name;
    }
    public void email(String email){
        this.email = email;
    }
    public void phoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //Accessor Methods: [Getters]:
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int phoneNumber(){
        return phoneNumber;
    }

    // Behavioral Methods:
    public void depositFund(int deposit){
        balance += deposit;
    }

    public void withdrawal(int withdraw){
        if(balance > withdraw){
            balance -= withdraw;
        }else{
            System.out.println("Insuffience Funds");
        }
    }

}