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
        if(num1 > num2){
            int subtraction = num1 - num2;
        }else{
            int subtraction = num2 - num1;
        }
        if(num1==0 || num2== 0){
            System.out.println("Can't divide by 0");
        }else{
            int Division = num1/num2;
        }   
         
    }
    public static void main(String[] arg){
        //System.out.println("Testing out Java environment, Hello World!");
        //System.out.println("Hello, Fayeem Mooktadeer, congraulations on Day 0");

        // --- Variables ----//
        learningVariables();
        
    }
}