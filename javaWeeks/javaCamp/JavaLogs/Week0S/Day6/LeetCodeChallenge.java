import java.util.Arrays;

public class LeetCodeChallenge{
    //Instance Field:
    public static void commonChars(String [] words){
        char [] element = {};
        //First get element within that String.
        for(int i = 0; i < words.length; i++){
            element = words[i].toCharArray();
            Arrays.toString(element);
        }
        System.out.println(element);

        // for(int i = 0; i < words.length; i++){
        //     System.out.println(i + ":" + (words[i]));
        //     for(int j = 0; j < words[i].toCharArray().length; j++){
        //         System.out.println("" + words[i].charAt(i));
        //     }

        //     //now getting the char of every letter:

        // }
    }

    public static void main(String[] args) {
        System.out.println("Wrongfully");
        String [] words = {"flower", "flow", "flight"};
        for(int i = 0 ; i < words.length; i++){
            words[i].toCharArray();
            for(int j = 0; j < words[i].toCharArray().length; j++){
                System.out.println(words[i].toCharArray()[i]);
            }

        }
        // words[0].toCharArray();
        // System.out.println(Arrays.toString(words[0].toCharArray()));
    }
}