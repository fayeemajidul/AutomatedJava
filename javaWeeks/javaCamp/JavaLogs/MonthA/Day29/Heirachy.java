import java.util.Random;

public class Heirachy{
    public static void main(String[] args){
        preparingForLoop();
        doWhile();
        whileLoop();
    }
    
    public static void preparingForLoop(){
        for(int i = 0; i < 10; i++){
            System.out.println("For Loop");
        }
    }
    
    public static void doWhile(){
        //Do this while executing this condition
        int count  = 0;
        do{
            System.out.println("Testing the environment");
            count++;
        }while(count < 5);
    }

    public static void whileLoop(){
        //Syntax for a while loop:
        int accumulator = 0;
        Random rand = new Random();
        while(accumulator < 5){
            System.out.println(rand.nextInt(0,100));
            accumulator++;
        }
    }
}