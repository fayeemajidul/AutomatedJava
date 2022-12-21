import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Salary{
    public static void main(String[] args){
        System.out.println("Testing the environment");
        ArrayList <Integer> integers = new ArrayList<>();
        eliminateFirstAndLast(integers);        
    }
    public static ArrayList <Integer> createAnArray(ArrayList <Integer> integers){
        Random rand = new Random();
        for(int i = 3; i < 8; i++){
            integers.add(rand.nextInt(3,1000000));
        }
        return integers;
    }
    public static void eliminateFirstAndLast(ArrayList <Integer> integers){
        ArrayList <Integer> salaryExpectations = createAnArray(integers);
        Collections.sort(salaryExpectations);
        System.out.println(salaryExpectations);
        for(int i = 0; i < salaryExpectations.size(); i++){
            salaryExpectations.remove(0);
            salaryExpectations.remove(salaryExpectations.size()-1);
            break;
        }
        System.out.println(salaryExpectations);
    }
}