import java.util.ArrayList;
import java.util.Random;

public class Bits{
    public static ArrayList<Integer> createBitInts(ArrayList <Integer> bits){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(3,4); i++){
            bits.add(i, rand.nextInt(0,1));
        }
        System.out.println(bits);
        return bits;
    }
    public static boolean translateBit(ArrayList <Integer> bits){
        bits = createBitInts(bits);
        int accumulatedSum = 0;
        for(int i : createBitInts(bits)){
            System.out.println(i);
            if(i == 0){
                accumulatedSum += 0;
            }
            if(i == 1){
                accumulatedSum += 1;
            }
        }
        if(accumulatedSum == 0){
            return false;
        }else if(accumulatedSum > 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList <Integer> bits = new ArrayList<>();
        System.out.println(translateBit(bits));
        System.out.println(translateBit(bits));
        
    }
}