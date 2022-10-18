import java.util.*;

public class Palgram{
    public static void panGramVerify(String words, String [] alphabets){
        char[] wrds = words.toCharArray();
        List<String> alphabet = Arrays.asList(alphabets);
        int counter = 0;

        for(int i = 0; i < alphabets.length; i++){
            System.out.println(wrds[i]);
            if(wrds.length != alphabets.length){
                System.out.println("Stop");
            }
        }

    }
    public static void main(String[] args){
        String [] alphabets = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        panGramVerify("the", alphabets);
        //Check to compare each letter to the alphabet array
    }


}