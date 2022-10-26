import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Union{
    public static void main(String[] args){
        HashSet <Integer> ArrayOutput = new HashSet <Integer>();
        uniqueUnion(ArrayOutput);

    }

    public static HashSet<Integer> createArray(HashSet <Integer> ArrayOutput){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(3,5); i++){
            ArrayOutput.add(rand.nextInt(0,10));
        }
        System.out.println(ArrayOutput);
        return ArrayOutput;
    }

    public static void uniqueUnion(HashSet <Integer> ArrayOutput){
        HashSet <Integer> union1 = createArray(ArrayOutput);
        HashSet <Integer> union2 = createArray(ArrayOutput);

        HashSet <Integer> intersection = new HashSet<>();
        union1.retainAll(union2);

        System.out.println("Intersected Set: " + union1);

    }
}