import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MeanArray{
    public static ArrayList <Integer> createArray(ArrayList <Integer> array ){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(4,10); i++){
            array.add(rand.nextInt(0,100));
        }
        return array;
    }
    public static ArrayList<Integer> takeElements(ArrayList <Integer> array){
        array = createArray(array);
        double takeOffElements =  (double)(array.size() * .05);
        Collections.sort(array);
        System.out.println(array + ":" + takeOffElements);

        for(int i = 0; i < array.size(); i++){
            if(takeOffElements <= 0.25){
                array.remove(array.get(i));
                array.remove(array.get(array.size()-1));
                break;
            }else if(takeOffElements > 0.25 && takeOffElements <= .50){
                array.remove(array.get(i+1));
                array.remove(array.get(i));
                array.remove(array.get(array.size()-2));
                array.remove(array.get(array.size()-1));
                break;
            }
        }
        System.out.println(array);
        return array;
    }
    public static void takeAverage(ArrayList <Integer> array){
        array = takeElements(array);
        int accumSum = 0;
        for(int i = 0; i < array.size(); i++){
            accumSum += array.get(i);
        }
        double meanOfModifiedArray = (double) accumSum/array.size();
        System.out.println(meanOfModifiedArray);
    }
    public static void main(String[] args){
        ArrayList <Integer> array = new ArrayList<>();
        takeAverage(array);
    }

}