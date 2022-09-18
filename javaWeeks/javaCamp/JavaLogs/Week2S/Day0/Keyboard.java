import java.util.ArrayList;
import java.util.HashMap;

//Now Take Every Char, and make it upper-case, and compare it to the value of the Map.
public class Keyboard{
    public static void validWords(ArrayList<String> words, HashMap <Character, Integer> rowValidator){
        char[] wordChar = words.toString().toUpperCase().toCharArray();
        System.out.println("The Start of Iteration");
        for (char i : wordChar){
            System.out.println(rowValidator.get(i));
        }
            
    }

    
    public static void main(String[] args){
        //Main Method:
        HashMap <Character, Integer> rowValidator = new HashMap<Character, Integer>();
        //Row 0: QWERTY
        rowValidator.put('Q', 0);
        rowValidator.put('W', 0);
        rowValidator.put('E', 0);
        rowValidator.put('R', 0);
        rowValidator.put('T', 0);
        rowValidator.put('U', 0);
        rowValidator.put('I', 0);
        rowValidator.put('O', 0);
        rowValidator.put('P', 0);
        //Row 1:
        rowValidator.put('A', 1);
        rowValidator.put('B', 1);
        rowValidator.put('C', 1);
        rowValidator.put('D', 1);
        rowValidator.put('F', 1);
        rowValidator.put('G', 1);
        rowValidator.put('H', 1);
        rowValidator.put('I', 1);
        rowValidator.put('J', 1);
        rowValidator.put('K', 1);
        rowValidator.put('L', 1);
        //Row 2:
        rowValidator.put('Z', 2);
        rowValidator.put('X', 2);
        rowValidator.put('C', 2);
        rowValidator.put('V', 2);
        rowValidator.put('B', 2);
        rowValidator.put('N', 2);
        rowValidator.put('M', 2);

        ArrayList <String> words = new ArrayList<String>();
        words.add("Mom");
        words.add("Dad");
        words.add("Brother");
        words.add("Sister");
        words.add("Best Friend");
        words.add("Girl Friend");
        validWords(words, rowValidator);
    }
}