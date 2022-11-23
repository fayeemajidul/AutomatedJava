import java.util.ArrayList;
import java.util.Random;

public class Duplicate0{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        ArrayList <Integer> generatedArray = new ArrayList<>();
        duplicateZeros(generatedArray);
    }
    public static ArrayList <Integer> createArrayOfIntegers(ArrayList <Integer> generatedArray){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(5,10); i++){
            generatedArray.add(rand.nextInt(0,4));
        }
        return generatedArray;
    }
    public static void duplicateZeros(ArrayList <Integer> generateArray){
        ArrayList <Integer> trialingZeros = createArrayOfIntegers(generateArray);
        System.out.println(trialingZeros);
        for(int i = 0; i < trialingZeros.size()-1; i++){
            if(trialingZeros.get(i) == 0){
                trialingZeros.add(0);
            }
        }
        System.out.println(trialingZeros);
    }
}