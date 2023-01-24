import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class searchElement{
    public static void main(String[] args){
        createArray();
    }

    public static void createArray(){
        Random rand = new Random();
        ArrayList <Integer> creatingTheArray = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            creatingTheArray.add(rand.nextInt(0,100));
        }
        
        System.out.println(creatingTheArray);
        Collections.sort(creatingTheArray);
        System.out.println(creatingTheArray);
        System.out.println("testing the environment");

    }
}