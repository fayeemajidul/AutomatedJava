import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArrayNums{
    public static void main(String[] args){
        ArrayList <Integer> numEntered = new ArrayList<>();
        lowerhigherFind(numEntered, 4);

    }

    public static ArrayList<Integer> arrayOfNums(ArrayList <Integer> numEntered, int elements){
        Random rand = new Random();
        for(int i = 0 ; i < elements; i++){
            numEntered.add(rand.nextInt(0,100));
        }
        Collections.sort(numEntered);
        return numEntered;
    }
    public static void lowerhigherFind(ArrayList <Integer> numEntered, int elements){
        ArrayList <Integer> lowerhigherArray = arrayOfNums(numEntered, elements);
        //Logic behind this is to split the array into higher and lower or two arrays.
        arrayOfNums(numEntered, elements).spliterator();
    }


}