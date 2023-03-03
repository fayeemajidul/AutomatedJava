import java.util.ArrayList;
import java.util.Random;

public class Average{
    public static void main(String[] args){
        ArrayList <Integer> nums = new ArrayList<>();
        returnAverage(nums);
    
    }
    public static ArrayList <Integer> creatingArray(ArrayList <Integer> nums){
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            nums.add(rand.nextInt(0,100));
        }
        return nums;
    }
    public static void returnAverage(ArrayList <Integer> nums){
        int accumulator = 0;
        nums = creatingArray(nums);
        System.out.println(nums);
        
        for(int i = 0; i < nums.size(); i++){
            accumulator += nums.get(i);
        }
        System.out.println(accumulator/nums.size());
    }
}