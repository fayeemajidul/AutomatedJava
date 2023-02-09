import java.util.ArrayList;
import java.util.Random;

public class Concatenator{

    public static void main(String[] args){
        ArrayList <Integer> nums = new ArrayList<>();
        addLogic(nums);

    }
    
    public static ArrayList <Integer> createAnArray(ArrayList <Integer> nums){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(2, 4); i++){
            nums.add(i, rand.nextInt(0,100));
        }
        return nums;
    }

    public static void addLogic(ArrayList <Integer> nums){
        nums = createAnArray(nums);
        String words = "";
        for(int num : nums){
            words += num;
        }
        System.out.println(words);
        Integer wholeNum = Integer.parseInt(words);
        System.out.println(wholeNum + 1);
    }
}