import java.util.ArrayList;
import java.util.Random;

public class evenNumArray{
    
    public static void main(String[] args) {
        ArrayList<Integer> numOfElements = new ArrayList<>();
        evenOrOdd(numOfElements);
    }
    public static ArrayList<Integer> makeRandomArray(ArrayList <Integer> numOfElements){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(0,13); i++){
            numOfElements.add(rand.nextInt(0,100));
        }
        System.out.println(numOfElements);
        return numOfElements;
    }
    public static void evenOrOdd(ArrayList<Integer> numOfElements){
        ArrayList <Integer> elementsArray = makeRandomArray(numOfElements);
        ArrayList <Boolean> booleanList = new ArrayList<>();
        int numOfDigs = 0;
        for(int i = 0; i < elementsArray.size(); i++ ){
            numOfDigs += String.valueOf(elementsArray.get(i)).length();
            if(numOfDigs % 2 == 0){
                booleanList.add(true);
            }else{
                booleanList.add(false);
            }
        }
        System.out.println(booleanList);
    }

}