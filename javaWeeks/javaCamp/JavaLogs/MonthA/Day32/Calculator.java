import java.util.ArrayList;
import java.util.Random;

public class Calculator{
    public static void main(String[] args){
        System.out.println("Testing the environment");

    }
    public static int addition(int a, int b){
        return (a + b);
    }
    public static int subtraction(int a, int b){
        return (a-b);
    }
    public static int multiplication(int a, int b){
        return (a*b);
    }
    public static double division(int a, int b){
        return (double)(a/b);
    }

    public static void arrayGenerator(){
        Random rand = new Random();
        ArrayList <Integer> ballAverage = new ArrayList<>();
        ballAverage.add(rand.nextInt(0,100));
        for(int i = 0; i < rand.nextInt(0,100); i++){
            System.out.println("I'm pretty sleep deprived right now");
        }
    }
    
}