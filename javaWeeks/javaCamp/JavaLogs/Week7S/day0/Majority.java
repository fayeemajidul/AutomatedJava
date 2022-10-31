import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Majority{
    public static void main(String[] args){
        ArrayList <Integer> freqArray = new ArrayList<>();
        frequentNums(freqArray);
    }
    public static ArrayList <Integer> arrayFreq(ArrayList <Integer> freqArray){
        Random rand = new Random();
        for(int i = 0; i < 9; i++){
            freqArray.add(rand.nextInt(3,10));
        }
        return freqArray;
    }

    public static void frequentNums(ArrayList <Integer> freqArray){
        freqArray = arrayFreq(freqArray);
        Collections.sort(freqArray);
        System.out.println(freqArray.get(freqArray.size()/2));
    }
}