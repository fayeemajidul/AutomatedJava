import java.util.Random;

public class Main{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        createRandomInteger();

    }
    public static void createRandomInteger(){
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            System.out.println("Committing");
        }
    }
}