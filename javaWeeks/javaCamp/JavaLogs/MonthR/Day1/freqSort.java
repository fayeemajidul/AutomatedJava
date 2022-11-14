import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class freqSort{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        ArrayList <Integer> sortedArray = new ArrayList<Integer>();
        countFreq(sortedArray);
    }

    public static ArrayList <Integer> createSortedArray(ArrayList <Integer> sortedArray){
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            sortedArray.add(rand.nextInt(3,10));
        }
        Collections.sort(sortedArray);
        return sortedArray;
    }
    public static void countFreq(ArrayList <Integer> sortedArray){
        ArrayList <Integer> sorting = createSortedArray(sortedArray);
        int numBefore = 0;
        boolean freq = false;
    
        for(int i = 0; i < (sorting.size()-1); i++){
            numBefore = sorting.get(i+1);

            if(numBefore == sorting.get(i)){
                freq = true;
            }
        }
        System.out.println(sorting);
        System.out.println(freq);
    }
}