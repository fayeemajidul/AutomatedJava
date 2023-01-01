import java.util.Scanner;

public class Factorial{
    public static void factorialLogic(int num){
        int factorialAccumulation = 1;
        for(int i = num; i > 0; i--){
            factorialAccumulation *= i;
        }
        System.out.println(factorialAccumulation);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        factorialLogic(num);
        s.close();
    }
}