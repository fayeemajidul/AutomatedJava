import java.util.Arrays;
import java.util.Scanner;

public class Palindrome{
    public static char[] createSentence(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String wordInput = scan.nextLine();
        char[] wordToChar = wordInput.toCharArray();
        scan.close();
        return wordToChar;
    }
    public static void palindromeLogic(){
        char[] wordChar = createSentence();
        System.out.println(Arrays.toString(wordChar));
        
    }
    public static void main(String[] args){
        palindromeLogic();
    }
}