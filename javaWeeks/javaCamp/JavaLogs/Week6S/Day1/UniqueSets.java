import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSets{
    public static void mergeList(ArrayList <String> unique1, ArrayList <String> unique2, ArrayList <String> unique3 ){
        HashSet <String> uniqueElements = new HashSet<>();
        uniqueElements.addAll(unique1);
        uniqueElements.addAll(unique2);
        uniqueElements.addAll(unique3);

        System.out.println(uniqueElements);

    }
    public static void main(String[] args){

        //ArrayList
        ArrayList <String> unique1 = new ArrayList<>();
        unique1.add("apple");
        unique1.add("pie");
        unique1.add("lover");
        unique1.add("cool");

        ArrayList <String> unique2 = new ArrayList<>();
        unique2.add("peep");
        unique2.add("poo");
        unique2.add("apple");
        unique2.add("love");

        ArrayList <String> unique3 = new ArrayList<>();
        unique3.add("sadistic");
        unique3.add("anti-semetism");
        unique3.add("lovz");
        unique3.add("is dead");

        mergeList(unique1,unique2,unique3);

    }
}