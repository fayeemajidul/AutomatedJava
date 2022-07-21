public class VipCustomer {
    private String name; private int creditLimit; private String emailAddress;
    public VipCustomer(){
        this("Default", 50000, "johndoe@gmail.com");
    }
    public VipCustomer(int creditLimit, String emailAddress){
        this("Williamburg", creditLimit, emailAddress);
    }
    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getEmail(){
        return emailAddress;
    }
    public String getName(){
        return name;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
}
