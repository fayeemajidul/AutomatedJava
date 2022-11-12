import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class baseball{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        HashMap <Object, Object> legend = new HashMap<Object, Object>();
        ArrayList <Integer> scores = new ArrayList<Integer>();
        createMap(scores, legend);        
    }

    public static ArrayList<Integer> createList(ArrayList <Integer> scores){
        Random rand = new Random();
        for(int i =0 ; i < 2; i++){
            scores.add(rand.nextInt(3,9));
        }
        return scores;
    }

    public static void createMap(ArrayList <Integer> scores, HashMap <Object, Object> legend){
        scores = createList(scores);
        System.out.println("Enter the Score recorded");
        int valueRecorded = scan.nextInt();
        scores.add(valueRecorded);

        for(int i = 0; i < scores.size(); i++){
            legend.put("+", scores.get(0) + scores.get(scores.size()-1));
            legend.put("D", (scores.get(scores.size()-1)* 2));
            legend.put("C", (scores.remove(scores.size()-1)));
        }

        //Drive Code:
        System.out.println("\n" + scores);
        System.out.println("Enter one of the following : + , D , C");
        String valueOut = scan.nextLine();
        legend.get(valueOut);
        System.out.println(legend);
    }
}