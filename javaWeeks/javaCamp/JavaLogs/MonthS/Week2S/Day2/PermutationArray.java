import java.util.ArrayList;
import java.util.Random;

public class PermutationArray{
    public static ArrayList<Integer> randomArrayGenerator(ArrayList <Integer> originalArray){
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            originalArray.add(rand.nextInt(0,100));
        }
        System.out.println("Original Array : " + originalArray);
        return originalArray;
    }
    public static void zerothArray(ArrayList <Integer> originalArray){
        int zeroIndex = originalArray.get(0);
        int lastIndex = originalArray.get(originalArray.size()-1);
        for(int i = 0; i < originalArray.size(); i++){
            originalArray.set(originalArray.size()-1, zeroIndex);
            originalArray.set(0, lastIndex);
        }
        System.out.println("Zeroth Index Array: " + originalArray);
    }
    public static void main(String[] args){
        ArrayList <Integer> originalArray = new ArrayList<Integer>();
        randomArrayGenerator(originalArray);
        zerothArray(originalArray);
    }
}