import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ThirdMax{
    public static void main(String[] args){
        System.out.println("Testing the Environment");
        ArrayList <Integer> numOfInts = new ArrayList<Integer>();
        generateThirdMax(numOfInts);
    }

    public static ArrayList <Integer> generateArray(ArrayList <Integer> numOfInts){
        Random rand = new Random();
        for(int i = 0; i < 3; i++){
            numOfInts.add(rand.nextInt(0,100));
        }
        return numOfInts;
    }
    public static void generateThirdMax(ArrayList <Integer> numOfInts){
        ArrayList <Integer> generatedArray = generateArray(numOfInts);
        Collections.sort(generatedArray);
        System.out.println(generatedArray);
        if(generatedArray.get(2) != null){
            System.out.println(generatedArray.get(2));
        }else{
            System.out.println(generatedArray.get(generatedArray.size()-1));
        }

    }
}