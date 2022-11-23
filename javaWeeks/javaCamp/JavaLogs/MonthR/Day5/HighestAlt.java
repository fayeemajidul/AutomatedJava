import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HighestAlt{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        ArrayList<Integer> altitude = new ArrayList<>();
        findMaxAlt(altitude);

    }
    public static ArrayList <Integer> generateAltitude(ArrayList <Integer> altitude){
        Random rand = new Random();
        for(int i =0 ; i < rand.nextInt(2,5); i++){
            altitude.add(rand.nextInt(-6, 6));
        }
        return altitude;
    }
    public static void findMaxAlt(ArrayList <Integer> altitude){
        altitude = generateAltitude(altitude);
        Collections.sort(altitude);
        System.out.println(altitude);
        int MAX = 0; 
        for(int i = 0; i < altitude.size(); i++){
            MAX = altitude.get(altitude.size()-1);
            if(altitude.get(i) == MAX){
                System.out.println("Element " + i + " is the max altitude , altitude = " + MAX);
            }
        }
    }
}