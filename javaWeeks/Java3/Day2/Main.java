import java.util.Arrays;
import java.util.Scanner;
public class Main{
    //Instance Field:
    //Constructor Class:
    public Main(){}
    
    public static int [] arrayScanner(int numbers){
        /** Creates Array based on User Input */
        Scanner userNum = new Scanner(System.in);
        int [] numberArray = new int [numbers];
        System.out.println("Enter Numbers: \r");

        for(int i = 0; i < numbers; i++){
            numberArray[i] = userNum.nextInt();
        }
        return numberArray;
    }
    public static void printArray(int numbers){
        int [] userArray = arrayScanner(numbers);
        for(int i = 0; i < userArray.length; i++){
            System.out.println("Element #" + i + " = " + userArray[i]);
        }
        System.out.println(Arrays.toString(userArray));

    }
    public static int [] arrayInDescendingOrder(int[] array){
        /** We're going to create two arrays, that are copy of each other. */
        int [] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array [i];
        }
        /** Sorting the Array:
         * We want a while Loop, that executes until flag is false.
         */
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

        }
    //You need to figure out how to sort from order:
    // public static void main(String[] args){
    //     int [] array = arrayScanner(5);
    //     arrayInDescendingOrder(array);
    // }
}