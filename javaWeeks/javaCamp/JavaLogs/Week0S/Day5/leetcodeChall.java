import java.util.ArrayList;

public class leetcodeChall{
public leetcodeChall(){}

public static int romanRules(int number){
    /* We'll Create Rules */
    ArrayList <Integer> listOfRules = new ArrayList<Integer>();
    listOfRules.add(1);
    listOfRules.add(5);
    listOfRules.add(10);
    listOfRules.add(50);
    listOfRules.add(100);
    listOfRules.add(500);
    listOfRules.add(1000);

    //We want to return the number w/ the smallest remainder:
    int smallest_Remainder = 0;
    int compareNumber;
    for(int i = 0; i < listOfRules.size(); i++){
        compareNumber = (number)% listOfRules.get(i);
        if(compareNumber == number){
            System.out.println(number + " is not divisible by " + listOfRules.get(i));
        }else{
            while(compareNumber != 0){
                compareNumber = listOfRules.get(i) % listOfRules.get(i-1);
                System.out.println("Dividing " + listOfRules.get(i) + ":" + compareNumber);
            }
            System.out.println("Element" + i + ": " + compareNumber);
        }
    }
    return smallest_Remainder;
}

// public static void romanRules(int number){
//     while(number > 0){
//         //Create a rule to get the largest roman:

//     }
// }






    public static void main(String[] args) {
        romanRules(120);
    }
}