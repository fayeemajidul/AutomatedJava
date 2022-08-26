import java.util.HashMap;
import java.util.Map;
import java.util.*;

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
    public static void practiceWithStringManip(){
        /** Your Regex is telling the computer where to split. */
        String [] lyricsOfASong = "Loving you till the end like XYZ".split(" ");
        for(String lyric: lyricsOfASong){
            System.out.println(lyric);
        }

        String [] splittingFruits = "Apple Banana Pineapple Pomegrante Dragonfruit Grapes Pears Peach Oranges".split(" ");
        for(String fruits : splittingFruits){
            System.out.println(fruits);
        }
    }

    public static void main(String[] args) {
        practiceWithStringManip();
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
        Set <String> languageContent = languages.keySet();
        System.out.println("==============================");
        //Loop Through the Contents:

        languages.remove("Lisp");
        languages.replace("Basic", "I want to become my best self and align myself with my virtues");

        System.out.println(languages.get("Basic"));
        for(String language : languageContent){
            System.out.println("Language: " + language);
        }

        Collection <String> definitions = languages.values();
        for(String defin : definitions){
            System.out.println("Definition: " + defin + definitions);
        }

    }
        
}