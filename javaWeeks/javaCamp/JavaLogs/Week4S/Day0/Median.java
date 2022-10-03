import java.util.ArrayList;
import java.util.Random;

public class Median{
    public static int randomFunction(){ 
        //J creates random #
        Random rand = new Random();
        return rand.nextInt(0,12);
    }
    public static ArrayList<Integer> createRandomArray(){
        ArrayList <Integer> randomArray = new ArrayList<>();
        int arraySize = randomFunction();
        for(int i = 0; i < arraySize; i++){
            randomArray.add(randomFunction());
        }
        System.out.println(randomArray);
        return randomArray;
    }
    public static void masterArray(){
        ArrayList <Integer> arrayOne = createRandomArray();
        ArrayList <Integer> arrayTwo = createRandomArray();
        ArrayList <Integer> masterArrayList = new ArrayList<>();
        System.out.println("Size of Array One: "  + arrayOne.size());
        int masterSize = arrayOne.size() + arrayTwo.size();
        System.out.println(masterSize);
        for(int i = 0; i < masterSize; i++){
            try{
                masterArrayList.add(arrayOne.get(i));
            }catch(IndexOutOfBoundsException e){
                try{
                    masterArrayList.add(arrayTwo.get(i));
                }catch(IndexOutOfBoundsException x){
                    System.out.println("error");
                }
            }
        }
        System.out.println(masterArrayList);
    }
    public static void main(String[] args) {
        masterArray();
    }
}
