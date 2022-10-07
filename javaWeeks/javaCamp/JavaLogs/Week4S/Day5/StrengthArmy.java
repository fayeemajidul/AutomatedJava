import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StrengthArmy{
    public static ArrayList <Integer> strengthArmy(ArrayList<Integer> ArmyStrength){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(1,5); i++){
            ArmyStrength.add(rand.nextInt(0,60));
        }
        return ArmyStrength;
    }
    public static int SummationProductMinArray(ArrayList <Integer> ArmyStrength){
        ArrayList <Integer> sortedPower = strengthArmy(ArmyStrength);
        Collections.sort(sortedPower);
        System.out.println("Sorted Army Power Array: " + sortedPower);
        int grabMin = 0, grabSum = 0 ;
        for(int i = 0; i < sortedPower.size(); i++){
            grabMin = sortedPower.get(0);
            grabSum += sortedPower.get(i);
        }
        System.out.println("Min Power: " + grabMin + "\nSum of Power: " + grabSum);
        return grabMin * grabSum;
    }
    public static void main(String[] args){
        ArrayList <Integer> ArmyStrength = new ArrayList<>();
        int power = SummationProductMinArray(ArmyStrength);
        System.out.println(power);
    }
}