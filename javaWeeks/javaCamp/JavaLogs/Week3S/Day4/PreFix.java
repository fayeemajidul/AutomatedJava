import java.util.ArrayList;

public class PreFix{
    public static void main(String[] args){
        ArrayList <String> words = new ArrayList<>();
        wordGenerator(words, "tricep");
        wordGenerator(words, "triphosphate");
        wordGenerator(words, "triglyceride");
        wordGenerator(words, "tricycle");
        wordGenerator(words, "dioxide");
        wordGenerator(words, "dinitrate");
        wordGenerator(words, "diphosphorous");

        PreFixArray(words, "tri");
    }
    public static ArrayList<String> wordGenerator(ArrayList<String> words, String wordsToAdd){
        words.add(wordsToAdd);
        return words;  
    }
    
    public static void PreFixArray(ArrayList <String> words, String prefix){
        ArrayList <String> hasPrefix = new ArrayList<>();
        for(int i = 0; i < words.size(); i++ ){
            if(words.get(i).contains(prefix)){
                hasPrefix.add(words.get(i));
            }
        }
        System.out.println(hasPrefix);
    }
}