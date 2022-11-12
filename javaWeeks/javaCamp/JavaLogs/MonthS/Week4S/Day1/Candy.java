import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Candy{
    public static void main(String[] args){
        //Candy Initalize:
        Random rand = new Random();
        ArrayList <Integer> candyPKid = new ArrayList<>();
        doesKidHaveMaxFromExtra(candyPKid, rand.nextInt(0,10));
    }
    public static ArrayList<Integer> createCandyArray(ArrayList <Integer> candyPKid){
        Random rand = new Random();
        for(int i = 0 ; i < 5; i++){
            candyPKid.add(rand.nextInt(0,14));
        }
        return candyPKid;
    }
    public static int getMaxFromList(ArrayList <Integer> candyPKid){
        ArrayList<Integer> getMax = createCandyArray(candyPKid);
        Collections.sort(getMax);
        int maxFromKid = getMax.get(getMax.size()-1);
        return maxFromKid;
    }
    public static void doesKidHaveMaxFromExtra(ArrayList <Integer> candyPKid, int extraCandy){
        ArrayList <Integer> presentNum = createCandyArray(candyPKid);
        ArrayList <Boolean> validator = new ArrayList<>();
        int maxCandyFromPresent = getMaxFromList(candyPKid);
        System.out.println("Candy List: " + presentNum);
        System.out.println("Max from List: " + maxCandyFromPresent);
        System.out.println("Extra Candy: " + extraCandy);

        for(int element: presentNum){
            if(element + extraCandy >= maxCandyFromPresent){
                validator.add(true);
            }else{
                validator.add(false);
            }
        }
        System.out.println(validator);
    }
}