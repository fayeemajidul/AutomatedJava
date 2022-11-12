import java.util.ArrayList;
import java.util.Random;

public class arrayManipulation{
    //Instance Field:
    public static void arrayAddition(ArrayList<Integer>combinedArray){
        for(int i = 0; i < combinedArray.size(); i++){
            int lastNum;
            lastNum = combinedArray.get(combinedArray.size()-1);
            if(lastNum == 0){
                lastNum += 1;
            }else{
                combinedArray.set(combinedArray.size() - 1, lastNum + 1);
                break;
            }
        }
        System.out.println("Augmented Array: " + combinedArray);
    }
    public static void main(String[] args) {
        ArrayList <Integer> combinedArray = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i =0; i < 4; i++){
            combinedArray.add(rand.nextInt(0,1000));
        }
        System.out.println("Original Array: " + combinedArray); //Original Array.
        arrayAddition(combinedArray); //
    }
}