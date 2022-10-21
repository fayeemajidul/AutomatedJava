import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class RelativeRanks{
    public static void main(String[] args){
        ArrayList <Integer> scores = new ArrayList<>();
        sortedHashArray(scores);
    }

    public static ArrayList <Integer> playerScores(ArrayList <Integer> scores){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(3,10); i++){
            scores.add(rand.nextInt(0,100));
        }
        return scores;
    }

    public static void sortedHashArray(ArrayList <Integer> scores){
        scores = playerScores(scores);
        HashSet <Integer> uniqueScores = new HashSet<Integer>(scores);
        ArrayList <Integer> orderedScore = new ArrayList<Integer>(uniqueScores);
        Collections.sort(orderedScore);
        Collections.reverse(orderedScore);
        System.out.println(orderedScore);

        for(int i = 0; i < orderedScore.size(); i++){
            if(i == 0){
                System.out.println("First Place: " + orderedScore.get(0));
            }else if(i == 1){
                System.out.println("Second Place: " + orderedScore.get(1));
            }else if(i == 2){
                System.out.println("Third Place: " + orderedScore.get(2));
            }else{
                System.out.println(i+1 + "th: " + orderedScore.get(i));
            }
        }

    }
}