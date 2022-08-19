import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryExcept{
    public TryExcept(){}
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }
    private static int divide(){
        int x;
        int y;

        //Try and Catch are basically ways for you to capture the Mistake: Throw is something you can do output text on the console.
        
        try{
            x = getInt();
            y = getInt();
        }catch(NoSuchElementException e){
            throw new ArithmeticException("No Suitable input");
        }
        System.out.println("X is :" + x + "\nY is: " + y);
        try{
            return x/y;
        }catch(ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by 0");
        }
    }
    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer");
        scanner.close();
        while(true){
            try{
                return scanner.nextInt();
            }catch(InputMismatchException  e){
                //go round again. Read past the line in the inputfirst
                scanner.nextLine();
                System.out.println("please enter a number only using the digits 0-9");
            }
        }
        // return scanner.nextInt();
        
    }
}