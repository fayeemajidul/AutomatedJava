import java.util.Random;
public class Day0{
    //Instance Variables
    public Day0(){
        //Constructor Class
    }
    public static void learningVariables(){
        //Variable Method:
        /**Variable Notes:
         * Stored in Computer's RAM:
         * Data Types
         */
        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        //Test out Java Operators, do operators exercises: Arithmetic Operators + Assignment Operators + Comparison Operators + Logical Operators + Bitwise Operators//
        Random num = new Random();
        int num1 = num.nextInt(0,100);
        int num2 = num.nextInt(0,100);
        int addition = num1 + num2;
        int subtraction;
        if(num1 > num2){
            subtraction = num1 - num2;
        }else{
            subtraction = num2 - num1;
        }
        double division = ((double)num1/num2);
        int multiplication = num1 * num2;
        System.out.println(" Addition: " + addition + "\n Subtraction: " + (subtraction) + "\n Division: "  + division + "\n Multiplication: " + multiplication );
        System.out.println(num1 + "and" + num2);
    }
    public static void Expressions(int mySecondNumber, int myThirdNumber){
        int Sum = mySecondNumber + myThirdNumber;
        System.out.println(Sum);
    }
    public static void PrimitiveTypes(){
        /** Primitive Data Types: [Data Manipulation]
         * Short
         * Long
         * Int
         * Boolean
         * String
         * Float
         * Double
         * Byte
         */

        
    }

    public static void main(String[] arg){
        //System.out.println("Testing out Java environment, Hello World!");
        //System.out.println("Hello, Fayeem Mooktadeer, congraulations on Day 0");

        // --- Variables ----//
        //learningVariables();
        Expressions(12,6);
        
    }
}