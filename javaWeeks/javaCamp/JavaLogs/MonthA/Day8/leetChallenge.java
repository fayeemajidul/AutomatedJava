import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class leetChallenge {
    public static void main(String[] args){
        System.out.println("testing the environment");
        ArrayList <Integer> numOfInts = new ArrayList<>();
        System.out.println(giveMeRandomizedArray(numOfInts));


    }

    public static ArrayList <Integer> giveMeRandomizedArray(ArrayList<Integer> numOfInts){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(3, 5); i++){
            numOfInts.add(i, rand.nextInt(3,100));
        }
        Collections.sort(numOfInts);
        return numOfInts;
    }
}
