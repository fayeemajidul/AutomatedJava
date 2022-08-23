import java.util.HashMap;
import java.util.Map;

public class mapP{
    public mapP(){}
    public static void main(String[] args) {
        Map <String, Double> languages = new HashMap<>();
        languages.put("Apple", 4.01);
        languages.put("Banana", 1.32);
        languages.put("Kiwi", .43);
        //Print Method: Wow so Cool!
        System.out.println(languages.toString());
    }
}