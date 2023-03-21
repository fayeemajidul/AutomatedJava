import java.util.ArrayList;
import java.util.Random;

public class averageScore{
    public static void main(String[] args){
        System.out.println("testing the environment");
        ArrayList<Integer> listOfNumbers=  new ArrayList<>();
        averageCreation(listOfNumbers);
        computingLogic();
        System.out.println("Lots of testing");
        System.out.println("One heck of a weekend");
        System.out.println("code . not idea .");
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
    public static void ConquerTheNation(){
        for(int i =0; i < 3; i++){
            System.out.println("Rationalize with the sense of perception");
        }
    }
    public static void computingLogic(){
        System.out.println("Great Job Today, keep it up mentally and physically push yourself");
    }
}