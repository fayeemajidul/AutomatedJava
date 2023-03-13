import java.util.ArrayList;
import java.util.Random;

public class averageScore{
    public static void main(String[] args){
        System.out.println("testing the environment");
        ArrayList<Integer> listOfNumbers=  new ArrayList<>();
        averageCreation(listOfNumbers);
    }
    public static ArrayList <Integer> numberList(ArrayList <Integer> listOfNumbers){
        Random rand = new Random();
        for(int i = 0; i < 6; i++){
            listOfNumbers.add(rand.nextInt(0,100));
        }
        return listOfNumbers;
    }
    public static double averageCreation(ArrayList <Integer> listOfNumbers){
        listOfNumbers = numberList(listOfNumbers);
        int accumulator = 0;
        int nums = 0;
        for(int i = 0; i < listOfNumbers.size(); i++){
            accumulator += listOfNumbers.get(i);
            nums += i;
        }
        System.out.println(listOfNumbers);
        System.out.println((double)(accumulator/ nums));
        return (double)(accumulator/ nums);
    }
}