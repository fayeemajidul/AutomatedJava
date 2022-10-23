import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Subarray{
    public static void main(String[] args){
        ArrayList <Integer> generateArray = new ArrayList<>();
        outputArray(generateArray);
    }
    public static ArrayList <Integer> creatingArray(ArrayList <Integer> generateArray){
        Random rand = new Random();
        for(int i = 0; i < 6; i++){
            generateArray.add(rand.nextInt(0,100));
        }
        return generateArray;
    }
    public static void outputArray(ArrayList <Integer> generateArray){
        generateArray = creatingArray(generateArray);
        Collections.sort(generateArray);

        List <Integer> generateArray1 = generateArray.subList(0,3);
        List <Integer> generateArray2 = generateArray.subList(3,6);
        for(int i = 0; i < generateArray1.size(); i++){
            for(int j = 0; j < generateArray2.size(); j++){
                if(generateArray1.equals(generateArray2)){
                    System.out.println("Duplicated Element");
                }else{
                    System.out.println(generateArray1.get(i) + " is not equal to " + generateArray2.get(j));
                }
            }
        }
        }
        
    }