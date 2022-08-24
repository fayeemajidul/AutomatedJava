import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class SetMain{
    //Instance Field:
    public SetMain(){}
    private static void printSet(Set <String> set){
        for(String s: set){
            System.out.print(s + " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Set <Integer> squares = new HashSet<>();
        Set <Integer> cubes = new HashSet<>();

        for(int i = 1; i<=100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are " + squares.size() + " Squares." + "\n And " + cubes.size() + " Cubes.");

        //We create a duplicate of the square set. That's what the parameter did.
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements. ");

        //Finding Intersection
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection is found by using the retainAll method. Intersections found: " + intersection.size() + " elements.");
        for(int i: intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " Cube is " + Math.cbrt(i));
        }

        Set <String> words = new HashSet<>();
        String sentence = ("one day in the year of the fox");
        String [] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String [] NatureWords = {"all" , "nature", "is", "but", "art", "unknown" , "to", "thee"};
        nature.addAll(Arrays.asList(NatureWords));
        String [] divineWords = {"to", "err", "is", "human", "to","forgive", "divine"};
        nature.addAll(Arrays.asList(divineWords));

        System.out.println("Nature - Divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.remove(nature);
        printSet(diff1);

        System.out.println("Divine - Nature:");
        Set <String> diff2 = new HashSet<>(divine);
        diff2.remove(divine);
        printSet(diff2);
        
    }
}