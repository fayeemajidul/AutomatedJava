import java.util.Scanner;
import java.util.Arrays;
public class Array{
    //Instance Field
    public Array(){}
    //Instance Methods:
    /** Step 1: Create a Method that creates an array and assigns elements based on user input */
    public static int [] userInputtedNumbers(int numbers){
        int [] userNumbers = new int[numbers];
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter the numbers \r");
            for(int i = 0; i < userNumbers.length; i++){
                userNumbers[i] = scan.nextInt();
            }
        }
        return userNumbers;
    }
    public static void printArray(int numbers){
        int [] elementsInArray = userInputtedNumbers(numbers);
        for(int i = 0; i < elementsInArray.length; i++){
            System.out.println("Element #" + i + ": is equal to " + elementsInArray[i]);
        }
        System.out.println(Arrays.toString(elementsInArray));

    }

    public static int [] arrayInDescendingOrder(int numbers){
        //Duplicate Array first:
        int [] originalArray = userInputtedNumbers(numbers);
        int [] assortedArray = new int [originalArray.length];
        for(int i = 0; i < originalArray.length; i++){
            assortedArray [i] = originalArray [i]; 
        }
        //Logic behind ascending order:
        boolean untilFalse = true;
        int temporaryNum;
        while(untilFalse){
            untilFalse = false;
            for(int i = 0; i < assortedArray.length - 1; i++){
                System.out.println("iteration #" + i);
                //Compare 1,2,3,4,5
                if(assortedArray[i] < assortedArray[i+1]){
                    temporaryNum = assortedArray[i];
                    assortedArray[i] = assortedArray[i+1];
                    assortedArray[i+1] = temporaryNum;
                    untilFalse = true;
                }
            }
        }
        System.out.println(Arrays.toString(assortedArray));
        return assortedArray;
    }


    public static void main(String[] args) {
        arrayInDescendingOrder(5);
    }
}
