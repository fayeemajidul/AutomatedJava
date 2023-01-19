import java.util.ArrayList;
import java.util.Random;

public class Median{
    public static void main(String[] args){
        ArrayList <Integer> medianArray = new ArrayList<>();
        arrayLogic(medianArray);

    }
    public static ArrayList<Integer> createArray(ArrayList <Integer> medianArray){
        Random rand = new Random();
        medianArray = new ArrayList<>();
        for(int i = 0;  i < rand.nextInt(2,5); i++){
            medianArray.add(rand.nextInt(0,100));
        }
        System.out.println(medianArray);
        return medianArray;
    }
    public static void arrayLogic(ArrayList <Integer> medianArray){
        medianArray = createArray(medianArray);
        int medianRange = medianArray.size();
        System.out.println(medianRange);
    }
}