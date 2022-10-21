
public class NetworthPortfolio {
    private String name;
    private int age;
    RealEstatePortfolio realestate;
    Business suitBusiness;

    public NetworthPortfolio(String name, int age, RealEstatePortfolio property, Business suitBusiness){
        this.name = name;
        this.age = age;
        this.realestate = property;
        this.suitBusiness = suitBusiness;
    }

    //Setting my getters and setters: 
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    /// 

    public int getPortfolio(){
        System.out.println("\nName : " + name + "\nAge : " + age);
        System.out.println("Real - Estate:  " + realestate.RealEstateNet() + ", Num of properties: " + realestate.getNumOfProperties());
        System.out.println( name + "'s Suit Business : " + suitBusiness.totalProfits());

        int totalIncome = realestate.RealEstateNet() + suitBusiness.totalProfits();
        System.out.println("Total Income: " + totalIncome);
        return totalIncome;
    }


}
