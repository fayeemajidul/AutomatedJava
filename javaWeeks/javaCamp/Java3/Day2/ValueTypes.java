/** Fully Didn't understand why my code worked, so review it */


import java.util.Arrays;
import java.util.Scanner;
public class ValueTypes{
    // Instance Variable
    // Constructor Method:
    public ValueTypes(){}
    public static void main(String[] args) {
        // int myIntValue = 10;
        // int anotherIntValue = myIntValue;
        // anotherIntValue++;

        //What are reference Types?
        /** Reference types are objects.
         * Reference holds an address in the memory
         *      Not accessing the actual memory but the address itself.
         */
        // int[] myIntArray = new int [5];
        // int[] anotherArray = myIntArray;
        // System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        // System.out.println("myIntArray = " + Arrays.toString(anotherArray));
        // System.out.println("myIntArray = " + (myIntArray));
        // System.out.println("myIntArray = " + (anotherArray));

        //References Share the same Address, meaning the same behaviors.

        //This array has five elements, who's contents aren't saved yet.
        int [] array = readElements(5);
        findMin(array);
    }
    //This method initializes an empty erray with user inputted elements.
    public static int [] readInteger(int elements){
        int [] numberOfElements = new int [elements];
        return numberOfElements;
    }

    public static int [] readElements(int elements){
        int [] arrayInput = readInteger(elements);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter " + elements + " numbers \r");
        for(int i = 0; i < arrayInput.length; i++){
            arrayInput[i] = scan.nextInt();
        }
        return arrayInput;
    }

    // public static int [] findMin(int [] array){
    //     int [] arrayOfAscendingOrder  = Arrays.copyOf(array, array.length);
    //     int [] minValue = new int [1];
    //     //Coding Logic
    //     boolean untilFalse = true;
    //     int minValueCycle;
    //     while(untilFalse){
    //         untilFalse = false;
    //         for(int i = 0; i < arrayOfAscendingOrder.length-1; i++){
    //             if(arrayOfAscendingOrder[i] > arrayOfAscendingOrder[i+1]){
    //                 minValueCycle = arrayOfAscendingOrder[i];
    //                 arrayOfAscendingOrder[i] = arrayOfAscendingOrder[i+1];
    //                 arrayOfAscendingOrder[i+1] = minValueCycle;
    //                 untilFalse = true;
    //             }
    //         }
    //     }
    //     minValue[0] = arrayOfAscendingOrder[0];
    //     System.out.println(Arrays.toString(minValue));
    //     return minValue;
    // }
    public static int [] findMin(int [] array){
        int [] elementsInArray  = Arrays.copyOf(array, array.length);
        //Coding Logic
            int MaxIndex = elementsInArray.length - 1;
            int halfLength = elementsInArray.length/2;

            for(int i = 0; i < elementsInArray.length - 1; i++){
                int temp = elementsInArray[i];
                elementsInArray[i] = elementsInArray[MaxIndex-1];
                elementsInArray[MaxIndex - 1] = temp;
            }

            // elementsInArray[elementsInArray.length -1] = elementsInArray[0];

        /**
         * Index #0 = Index #1
         * Index #1 = Index #2
         * Index #2 = Index #3
         * Index #3 = Index #4
         * i = i+1
         * 
         */

        System.out.println(Arrays.toString(elementsInArray));
        return elementsInArray;
    }
}