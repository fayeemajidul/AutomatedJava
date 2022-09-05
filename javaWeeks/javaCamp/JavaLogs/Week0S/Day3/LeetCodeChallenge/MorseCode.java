import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MorseCode{
    HashMap <Character, String> morseCode = new HashMap<Character, String>();
    public MorseCode(){}
    Scanner scan = new Scanner(System.in);
    public void morseRules(){
        morseCode.put('a', ".-");
        morseCode.put('b', "-...");
        morseCode.put('c', "-.-.");
        morseCode.put('d', "-..");
        morseCode.put('e', ".-");
        morseCode.put('f', ".");
        morseCode.put('g', "..-.");
        morseCode.put('h', "--.");
        morseCode.put('i', "....");
        morseCode.put('j', "..");
        morseCode.put('k', ".---");
        morseCode.put('l', "-.-");
        morseCode.put('m', ".-..");
        morseCode.put('n', "--");
        morseCode.put('o', "-.");
        morseCode.put('p', "---");
        morseCode.put('q', ".--.");
        morseCode.put('r', "--.-");
        morseCode.put('s', ".-.");
        morseCode.put('t', "...");
        morseCode.put('u', "-");
        morseCode.put('v', "..-");
        morseCode.put('w', "...-");
        morseCode.put('x', ".--");
        morseCode.put('y', "-..-");
        morseCode.put('z', "-.--");
    }

    public void getCode(){
        System.out.println("Please enter a word to translate");
        String morseTranslate = "";
        String wordEntered = scan.nextLine().toLowerCase();
        for(int i = 0; i < wordEntered.length(); i++){
            char charval = wordEntered.charAt(i);
            morseTranslate += morseCode.get(charval);
        }
        System.out.println(morseTranslate);
    }
    public static void main(String [] args){
        MorseCode morsecode1 = new MorseCode();
        morsecode1.morseRules();
        morsecode1.getCode();
        // System.out.println(morsecode1.morseCode.get('c'));
    }

}


//Faster Solution
class Solution {
    //Words is the word being inputted:

    public int uniqueMorseRepresentations(String[] words) {

        // Creates an Array, of Morese Code
        Set<String> seen = new HashSet();
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.", "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 

        //What is the String Builder Class?

        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}