public class Main{
    // Instance Field:
    public Main(){} // Constructor Method:
    public static void main(String[] args){
        //Object 1: Calculator:
        // SimpleCalculator calculator = new SimpleCalculator();
        // calculator.setFirstNumber(5.0);
        // calculator.setSecondNumber(4);
        // System.out.println("add = "+  calculator.getAdditionResult());
        // System.out.println("subtract = "+  calculator.getSubtractionResult());
        // calculator.setFirstNumber(5.25);
        // calculator.setSecondNumber(0);
        // System.out.println("multiply = "+  calculator.getMultiplicationResult());
        // System.out.println("Divide = " + calculator.getDivisionResult());

        //Object 2: Person:
        // Person fayeem = new Person();
        // fayeem.setFirstName("Fayeem");
        // fayeem.setLastName("Mooktadeer");
        // Person Albert = new Person();
        // Albert.setFirstName("");
        // Albert.setLastName("");
        // System.out.println(Albert.getFirstandLast());
        // System.out.println(fayeem.getFirstandLast());
        // fayeem.setAge(20);
        // Albert.setAge(15);
        // System.out.println(fayeem.isTeen());
        // System.out.println(Albert.isTeen());

        //Object 3: Net calorie 
        // myCaloriePal profile1 = new myCaloriePal();
        // profile1.setProfileStats("Fayeem", "Mooktadeer", 169, 5.8, 20);
        // profile1.getProfileStates();

        //Object 4: Bank Account
        //BankAccount monies = new BankAccount();

        //Object 5: ID Card:
        // IDcard studentID = new IDcard(1231, "Fayeem", "Mooktadeer", "12341 Maing Street");
        // System.out.println(studentID.firstName);

        //Object 6: Vip Customer:
        VipCustomer Sayeem = new VipCustomer("Sayeem", 25000, "shadhossainboss@gmail.com");
        System.out.println("Shadidul's Credit Limit is: " + Sayeem.getCreditLimit());

    }
}