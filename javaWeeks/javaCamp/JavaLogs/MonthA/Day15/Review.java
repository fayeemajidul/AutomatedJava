import java.util.ArrayList;
import java.util.Random;

public class Review{
    public static void createArray(){
        ArrayList <Integer> intNums = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(3,5); i++){
            intNums.add(rand.nextInt(0,100));
        }
        System.out.println(intNums);
    }
    public static void main(String[] args){
        createArray();
    }
}