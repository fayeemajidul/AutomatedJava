import java.util.Scanner;
public class practice{
    //Instance Field:
    public practice(){}// Constructor Class
    public static void main(String[] args){
        //isPrime(99999);
        testingAllLoops();
        //masterCalculator();
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
        value1.close();
        return inputOne;
    }
    public static int valueTwo(){
        Scanner value2 = new Scanner(System.in);
        System.out.println("Enter in your second value.");
        int inputTwo = value2.nextInt();
        value2.close();
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
        /** Learned Escape Sequences + Conditional Thinking +  Terinary Operators*/
    }
    public static void sumNum(int num){
        if(num <= 9){
            System.out.println("Invalid Number Entry");
        }
        int sumOfDigits = 0;
        while(num > 0){
            int digitExtraction = (num%10); // Takes out digit from the end
            sumOfDigits += digitExtraction;
            num /= 10;
        }
        System.out.println(sumOfDigits);
    }
    /** CHALLENGE */
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }
        System.out.println("n" + "is a prime number");
        return true;

    }
    public static void testingAllLoops(){
        /** Create a program that utiilzes all Loops {While, Do While, And For Loops} 
         * Create a program that asks for users name and then prints it 5 times
        */
        Scanner nameInputer = new Scanner(System.in);
        System.out.println(" Hello user, please tell us your name. ");
        String userName = nameInputer.nextLine();

        /// ______________________________________________________
        for(int i = 0; i < 5; i++){
            System.out.println(" (For Loop): Hello, " + userName + " welcome to Java");
        }
        int counter = 0;
        /// ______________________________________________________
        while(counter < 5){
            counter++;
            System.out.println(" (While Loop) : Hello, " + userName + " welcome to Java");
        }
        /// ______________________________________________________
        int docounter = 0;
        do{
            docounter++;
            System.out.println(" (Do-While Loop) : Hello, " + userName + " welcome to Java");
        }while(docounter <5);
        nameInputer.close();


    }
}