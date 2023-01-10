import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class DuplicateElement{
    public static ArrayList<Integer> CreateArray(ArrayList <Integer> values){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(3,5); i++){
            values.add(rand.nextInt(0,100));
        }
        return values;
    }
    public static boolean uniqueArray(ArrayList <Integer> values){
        values  = CreateArray(values);

        HashSet<Integer> hashSet = new HashSet<>();
        for(int value : values){
            hashSet.add(value);
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println(uniqueArray(values));
    }
}