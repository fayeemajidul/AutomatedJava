import java.util.Scanner;
public class practice{
    //Instance Field:
    public practice(){}// Constructor Class
    public static void main(String[] args){
        masterCalculator();
    }
    public static int addition(int valueOne, int valueTwo){
        int additionSum = (valueOne + valueTwo);
        System.out.println("\n" + additionSum);
        return additionSum;
    }
    public static int subtraction(int valueOne, int valueTwo){
        int subtractionValue = valueOne - valueTwo;
        System.out.println("\n" + subtractionValue);
        return subtractionValue;
    }
    public static int multiplication(int valueOne, int valueTwo){
        int productValue = (valueOne) * (valueTwo);
        System.out.println("\n" + productValue);
        return productValue;
    }
    public static double division(int valueOne, int valueTwo){
        double quotientValue = (double)(valueOne)/(valueTwo);
        System.out.println("\n" + quotientValue);
        return quotientValue;
    }
    public static int powerValues(int valueOne, int valueTwo){
        int counter = 1;
        for(int i = 0; i < valueTwo; i++){
            counter *= valueOne;
        }
        System.out.println("\n" + counter);
        return counter;
    }
    public static String operationUsed(){
        //Setting up Operand
        Scanner operation = new Scanner(System.in);
        System.out.println("Please select an operation, (+, - , *, /, ^)");
        String operand = operation.nextLine();
        operation.close();
        return operand;
    }
    public static int valueOne(){
        Scanner value1 = new Scanner(System.in);
        System.out.println("Enter in your first value.");
        int inputOne = value1.nextInt();
        //value1.close();
        return inputOne;
    }
    public static int valueTwo(){
        Scanner value2 = new Scanner(System.in);
        System.out.println("Enter in your second value.");
        int inputTwo = value2.nextInt();
        //value2.close();
        return inputTwo;
    }
    public static void masterCalculator(){
        //Setting up Values for Calculator
        int valueOne = valueOne();
        int valueTwo = valueTwo();
        String Operation = operationUsed();

        //Master Calculator
        if(Operation.equals("+")){
            addition(valueOne, valueTwo);
        }else if(Operation.equals("-")){
            subtraction(valueOne, valueTwo);
        }else if(Operation.equals("*")){
            multiplication(valueOne, valueTwo);
        }else if(Operation.equals("/")){
            division(valueOne, valueTwo);
        }else if(Operation.equals("^")){
            powerValues(valueOne, valueTwo);
        }else{
            System.out.println("Invalid Operation");
        }
    }
}