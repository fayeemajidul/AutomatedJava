import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    //Instance Field:
    //Constructor Method:
    public Array2(){}
    public static int [] arrayEntered(int numEntered){
        int [] arrayInput = new int [numEntered];
        Scanner scan = new Scanner(System.in);
        System.out.println("Numbers Entered \r");
        for(int i = 0; i < arrayInput.length; i++){
            arrayInput[i] = scan.nextInt();
        }

        return arrayInput;
    }
    public static int [] reversedArray(int numEntered){

        int [] arrayInput = arrayEntered(numEntered);
        int [] array = Arrays.copyOf(arrayInput, arrayInput.length);
        int MaxIndex = array.length - 1; // Takes the Last Element
        int halfLength = (array.length) / 2; //Splits

        //Now Traverse to the Sequence and Reverse the sequence:
        for(int i = 0; i < halfLength; i++){
            //Checks Each Element
            int temp = array[i];
            array[i] = array[MaxIndex- i];
            array[MaxIndex - i] = temp;
        }
        return array;
    }
    public static void partTwo(int [] array){
        System.out.println(array.length/2);
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        partTwo(array);
        System.out.println(Arrays.toString(array));
    }
}
