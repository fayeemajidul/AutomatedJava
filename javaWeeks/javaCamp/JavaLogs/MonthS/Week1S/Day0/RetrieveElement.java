import java.util.*;

/** How can I put nums into numset?
 * Iterate to nums, and add into element?
 */

public class RetrieveElement{
    public static void findElementInArray(int [] nums){
        Set <Integer> numSet = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            numSet.add(nums[i]);
        }
        System.out.println(numSet);


    }
    public static void main(String[] args) {
        int [] nums = {0, 1, 1, 2, 3, 1, 2, 1, 4, 1, 1, 2, 3, 1, 4, 1, 2, 1, 31, 4, 12, 31341};
        findElementInArray(nums);
    }
}