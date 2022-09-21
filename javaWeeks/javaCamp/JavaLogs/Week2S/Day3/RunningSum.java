import java.util.*;

public class RunningSum{
    public static void randomArrayGenerator(ArrayList<Integer> arrayNums, int sizeOfArray){
        Random rand = new Random();
        for(int i = 0; i < sizeOfArray; i++){
            // arrayNums.add(rand.nextInt(0,100));
            arrayNums.add(i);
        }
        System.out.println(arrayNums);
        int sumOfIndex = 0;
        for(int i = 0; i < arrayNums.size(); i++){
            int value = arrayNums.set(i, sumOfIndex + arrayNums.get(i));
            sumOfIndex += value;

        }
        System.out.println(arrayNums);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayNums = new ArrayList<>();
        randomArrayGenerator(arrayNums, 10);


    }
}