package Interview;
import java.util.*;
public class Questions{

    /** Question 1:
     * given a list of numbers in an array, extract the number 7 from the list.
     */
    public static ArrayList<Integer> createArray(ArrayList<Integer> numbers){
        //Random Array Generator of random ranges, of random indexes.
        Random rand = new Random();
        int range = rand.nextInt(2,10);
        for(int i = 0; i < range; i++){
            numbers.add(rand.nextInt(0,100));
        }
        Collections.sort(numbers);
        return numbers;
    }

    public static void extractNumber(ArrayList<Integer> numbers, int numToExtract){
        //Extracts specific num from the array through parameter.
        ArrayList <Integer> extractFromArray = createArray(numbers);
        boolean numFound = false;
        System.out.println("List: " + extractFromArray);

        for(int i = 0; i < extractFromArray.size(); i++){
            if(extractFromArray.get(i) == numToExtract){
                System.out.println(numToExtract + " was found in index " + "#" + i);
                continue;
            }
        }
        if(!numFound){
            System.out.println("Could not find " + numToExtract);
        }
    }

    /** Question 2:
     * given a list w/ assorted data, find the min and max in the list.
     * Example : [null  , 4, 19, false]
     * 
     */

     public static ArrayList<Object> createAssortedArray(ArrayList <Object> assortedArray, ArrayList<Integer> numbers){
        //Creates a random array of values, of different data types.
        assortedArray.add(null);
        assortedArray.add(true);
        assortedArray.add(false);
        assortedArray.add(10);
        ArrayList<Integer> arrayNumber2 = createArray(numbers);
        for(int i = 0; i < arrayNumber2.size(); i++){
            assortedArray.add(arrayNumber2.get(i));
        }
        return assortedArray;
     }

     public static void getMinMax(ArrayList <Object> assortedArray, ArrayList<Integer> numbers){
        ArrayList <Object> dataTypeArray = createAssortedArray(assortedArray, numbers);
        ArrayList<Integer> sortedArray = new ArrayList<>(); // this Array only for Integers.
        int MAX = 0,MIN = 0;
        for(Object elementInArray: dataTypeArray){
            //Checks if the Object[i] is an Integer.
            if(elementInArray instanceof Integer){
                int extractedFromMixedArray = (int)elementInArray;
                sortedArray.add(extractedFromMixedArray);
            }
        }
        MIN = sortedArray.get(0); //Array is sorted from least to greatest, Index 0 = least.
        MAX = sortedArray.get(sortedArray.size()-1); // array.size() - 1, just gets the last element from Arrays.
        System.out.println(assortedArray + "\nMIN: " + MIN + "\nMAX: " + MAX);
     }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // extractNumber(numbers, 13);

        ArrayList<Object> assortedArray = new ArrayList<>();
        getMinMax(assortedArray, numbers);
    }
}