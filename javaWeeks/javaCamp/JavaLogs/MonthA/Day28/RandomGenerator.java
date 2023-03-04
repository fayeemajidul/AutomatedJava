import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        ArrayList <Integer> randomNums = new ArrayList<>();
        createArrayOfRans(randomNums);
    }
    public static void createArrayOfRans(ArrayList <Integer> nums){
        nums = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 5; i++ ){
            nums.add(rand.nextInt(0,100));
        }
        Collections.sort(nums);
        System.out.println(nums);
    }
}