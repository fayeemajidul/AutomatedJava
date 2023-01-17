import java.util.ArrayList;
import java.util.Random;

public class RemoveElement{
    public static ArrayList<Integer> createRandomizedArray(ArrayList<Integer> arraySizeIntegers){
        Random rand = new Random();
        for(int i = 0; i < arraySizeIntegers.size(); i++){
            System.out.println(i);
            arraySizeIntegers.add(rand.nextInt(0, 100));
        }
        System.out.println(arraySizeIntegers);
        return arraySizeIntegers;
    }

    public static void removeElement(ArrayList <Integer> arraySizeIntegers, Integer num){
        arraySizeIntegers = createRandomizedArray(arraySizeIntegers);
        for(int i = 0; i < arraySizeIntegers.size(); i++){
            if(arraySizeIntegers.get(i) == num){
                arraySizeIntegers.remove(i);
            }
        }
        System.out.println(arraySizeIntegers);

    }
    public static void main(String[] args){
        System.out.println("Stay focused in the Present. You have no time to Dwell anywhere else");
        ArrayList <Integer> arraySizeIntegers = new ArrayList<>();
        Random rand = new Random();
        Integer randomGenerated = rand.nextInt(0, 100);
        removeElement(arraySizeIntegers, randomGenerated);

    }
}