import java.util.Random;

public class Palin{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(0,100); i++){
            System.out.println("Testing the environment");
        }
    }
}