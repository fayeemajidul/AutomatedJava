import java.util.*;

public class getLCD{
    public static ArrayList<Integer> addRandomNumbersIntoArray(ArrayList<Integer> arrayOfNums, int numOfElements){
        Random rand = new Random();
        for(int i = 0; i < numOfElements; i++){
            arrayOfNums.add(rand.nextInt(0,100));
        }
        Collections.sort(arrayOfNums);
        return arrayOfNums;
    }
    public static void getTheGCF(ArrayList<Integer> arrayOfNums){
        ArrayList <Integer> sortedList = addRandomNumbersIntoArray(arrayOfNums, 6);
        int getElementOfLast = sortedList.get(sortedList.size() -1);
        int getFirstElement = sortedList.get(0);
        System.out.println("First Element: " + getFirstElement + "\nLast Element: " + getElementOfLast);
        // Now Create an LCD
        int GCF = 0;
        for(int i = 1; i <= getElementOfLast; i++){
            if(getFirstElement % i == 0 && getElementOfLast % i == 0){
                GCF = i;
            }
        }
        System.out.println("GCF is: " + GCF);
    }
    public static void main(String[] args){
        ArrayList <Integer> arrayOfNums = new ArrayList<Integer>(); 
        getTheGCF(arrayOfNums);

    }
}