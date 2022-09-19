import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrderInsert{
    public static void addToArray(ArrayList <Integer> accessOrder){
        /** Purpose of this method
         * Create random sequence of numbers into Array.
         */
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            accessOrder.add(rand.nextInt(0,100));
        }    
        System.out.println("unorder: " + accessOrder);
    }
    public static void reOrderArray( int target, ArrayList <Integer> accessOrder){
        //Sorted Array:
        addToArray(accessOrder);
        Collections.sort(accessOrder);
        System.out.println("order: " + accessOrder);
        System.out.println(target + ":" + accessOrder.get(target));

        //if array has target in index, then retrieve the element. Else compare the target to each element and see where it belongs.

    }
    public static void main(String[] args) {
        ArrayList <Integer> accessOrder = new ArrayList<Integer>();
        reOrderArray(3, accessOrder);

    }

}