import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList1 customer1 = new LinkedList1("Fayeem", 10.20);

        LinkedList1 customer2 = customer1;
        customer2.setBalance(18);

        System.out.println("Balance for customer " + customer1.getName() + " is " + customer1.getBalance());

        //ArrayList
        ArrayList <Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0 ; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }
        intList.add(1,2);

        for(int i = 0 ; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }


    }
}
