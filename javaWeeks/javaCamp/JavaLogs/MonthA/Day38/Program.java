import java.util.Random;

public class Program{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        Random rand = new Random();
        int randomNumber = rand.nextInt(0,100);
        System.out.println(randomNumber);

        for(int i = 1; i < randomNumber; i++){
            System.out.println("Iteration number " + i);
        }
    }
}