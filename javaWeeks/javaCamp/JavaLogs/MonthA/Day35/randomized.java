import java.util.ArrayList;
import java.util.Random;

public class randomized{
    public static void main(String[] args){
        System.out.println("Testing the enivronment");
        Random rand = new Random();
        ArrayList <Integer> createIn = new ArrayList<>();
        for(int i =0 ;i < 4; i++){
            createIn.add(rand.nextInt(0,100));
        }
        System.out.println(createIn);

    }
}