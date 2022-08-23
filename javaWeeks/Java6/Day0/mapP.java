import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapP{
    public mapP(){}

    public static void practiceWithMaps(){
        //u have to declare map in the syntax.
        Map <String, Double> Fruits = new HashMap<>();
        Fruits.put("Apple", 4.01);
        Fruits.put("Banana", 1.32);
        Fruits.put("Kiwi", .43);
        //Print Method: Wow so Cool!
        System.out.println(Fruits.toString());
        Set <String> typeOfFruit = Fruits.keySet();
        System.out.println(typeOfFruit); // Returns it into a list.
    }

    public static void main(String[] args) {
        Map <String, String> languages = new HashMap<>();
        languages.put("Java", "OOP platform");
        languages.put("Python","object oriented programming language");
        languages.put("Algol", "Algorithmic Langauge");
        languages.put("Basic", "Beginners Instruction code");
        languages.put("Lisp", "Therein lies madness");
        languages.put("Lisp", "I miss Zairah");
        //You need to get the values with get method.
        System.out.println(languages.get("Python")); // Returns the value when inputting the key.
        System.out.println(languages.get("Lisp"));
        
    }
        
}