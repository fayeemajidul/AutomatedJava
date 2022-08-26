import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public Main(){}

    public static int divideLYBL(int x, int y){
        if(y!=0){
            return x/y;
        }else{
            return 0;
        }
    }

    public static int divideEAFP(int x, int y ){
        try{
            return x/y;
        }catch(ArithmeticException e){
            return 0;
        }
    }
    private static int getInt(){
        Scanner scannner = new Scanner(System.in);
        System.out.println("Enter a number");
        scannner.close();
        return scannner.nextInt();
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer");
        String input = s.next();
        s.close();
        for(int i=0; i < input.length(); i++){
            if(!Character.isDigit((input.charAt(i)))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;

    }

    public static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        s.close();
        try{
            return s.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }
    public static void main(String[] args) {
        // int x = 98;
        // int y = 0;
        // System.out.println(divideLYBL(x,y));
        // System.out.println(divideEAFP(x, y));
        int x = getInt();
        System.out.println("x is " + x);
        int y = getIntLBYL();
        System.out.println(y);
    }

}