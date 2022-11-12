import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumOfCards{
    public static void main(String[] args){
        Random rand = new Random();
        int numToSplit = rand.nextInt(1,3);

        ArrayList <Integer> cardDeck = new ArrayList<>();
        cardLogic(cardDeck, 2);
    }

    public static ArrayList <Integer> cardDistributor(ArrayList <Integer> cardDeck){
        Random rand = new Random();
        for(int i = 0 ; i < rand.nextInt(4,12); i++){
            cardDeck.add(rand.nextInt(1,9));
        }
        System.out.println("Deck of Cards: " + cardDeck);
        return cardDeck;
    }

    public static void cardLogic(ArrayList <Integer> cardDeck, int numToSplit){
        //Now We need to split the cards by numToSplit:
        cardDeck = cardDistributor(cardDeck);
        Collections.sort(cardDeck);

        ArrayList <Integer> firstHalf = new ArrayList<>();

        int sizeOfDeck = cardDeck.size();

        if(sizeOfDeck % numToSplit == 0){
            for(int i = 0; i < cardDeck.size()/2; i++){
                firstHalf.add(cardDeck.get(i));
            }
            for(int j = 0 ; j < firstHalf.size(); j++){
                cardDeck.remove(firstHalf.get(j));
            }
        }else{
            System.out.println("Deck is not splittable");
        }

        System.out.println(firstHalf);
        System.out.println(cardDeck);
        System.out.println("Good Job today, lets come back stronger tomorrow");

    }

}