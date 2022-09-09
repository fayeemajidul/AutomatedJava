public class Main{
    public Main(){}
    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        bank.addBranch("Chase");
        bank.addCustomer("Chase", "Fayeem M.", 300.18);
        bank.addCustomer("Chase", "Zairah A.", 964.13);
        bank.addCustomer("Chase", "Yusuf H.", 1540.41);
        
        //New Branch:
        bank.addBranch("SEFCU");
        bank.addCustomer("SEFCU","Mohammad F.", 841.23);
        bank.addCustomer("SEFCU","Nihal Z.", 841.23);

        bank.addCustomer("Chase", "Fayeem M.", 35.12);
        bank.addCustomer("Chase", "Fayeem M.", 312.21);
        bank.addCustomer("Chase", "Zairah A.", 94.10);
        //
        bank.listCustomers("Chase", true);
        System.out.println();
        System.out.println();
        bank.listCustomers("SEFCU", true);





    }
}