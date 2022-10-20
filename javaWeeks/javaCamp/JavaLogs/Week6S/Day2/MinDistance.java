import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MinDistance{
    public static void main(String[] args){
        ArrayList <Integer> generateArrayList = new ArrayList<>();
        minDistance(generateArrayList);


    }
    public static ArrayList <Integer> arrayListGenerate(ArrayList <Integer> generateArrayList){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(1,4); i++){
            generateArrayList.add(rand.nextInt(0,8));
        }
        return generateArrayList;
    }
    public static void minDistance(ArrayList <Integer> generateArrayList){
        generateArrayList = arrayListGenerate(generateArrayList);
        System.out.println(generateArrayList);
        System.out.println(generateArrayList.size());

        int minDistance = 0;
        if(generateArrayList.size() == 1){
            minDistance = generateArrayList.get(0);
            System.out.println(minDistance + ": minimum digit needed to make all numbers the same");

        }else if(generateArrayList.size() > 1 && generateArrayList.size()%2 == 0){
            Collections.sort(generateArrayList);
            double average = 0;
            for(int i = 0; i < generateArrayList.size(); i++){
                average += generateArrayList.get(i);
            }
            System.out.println("Average is  : " + average/generateArrayList.size());
        }
    

    }
}