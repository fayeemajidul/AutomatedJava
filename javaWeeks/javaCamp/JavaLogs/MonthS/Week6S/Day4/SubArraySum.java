import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SubArraySum{
    public static void main(String[] args){
        ArrayList <Integer> generalArray = new ArrayList<>();
        printArray(generalArray);

    }
    public static ArrayList<Integer> generateArray(ArrayList <Integer> generalArray){
        Random rand = new Random();

        for(int i = 0 ; i < rand.nextInt(5,10); i++){
            generalArray.add(rand.nextInt(0,100));
        }
        return generalArray;
    }
    public static void printArray(ArrayList <Integer> generalArray){
        generalArray = generateArray(generalArray);
        Collections.sort(generalArray);
        List <Integer> splitter1 = generalArray.subList(0, generalArray.size()/2);
        List <Integer> splitter2 = generalArray.subList(generalArray.size()/2, generalArray.size()-1);

        //Logic to create the sum for each subset:
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < splitter1.size(); i++){
            sum1 += splitter1.get(i);
        }
        for(int j = 0; j < splitter2.size(); j++){
            sum2 += splitter2.get(j);
        }

        if(sum1 != sum2){
            System.out.println("Sum of subset 1 does not equal to sum of subset 2");
            System.out.println("Sum of subset 1 = " + sum1 + "\nSum of subset 2 = " + sum2);

        }else{
            System.out.println("Sum of subset 1 has the same sum as subset 2");
            System.out.println("Sum of subset 1 = " + sum1 + "\nSum of subset 2 = " + sum2);
        }
    }
}