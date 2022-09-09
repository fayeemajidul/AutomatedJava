import java.util.HashMap;

public class leetcodeChall{
    static HashMap <Character, Integer> charMap = new HashMap<Character, Integer>();

    public static int convertRomanNumbertoInt(String str){
        if(str == null || str.length() == 0){
            return 0;
        }
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);
        // XI --> if 5 > 1 --> then do Add
        int result = 0;

        for(int i = 0; i < str.length() -1; i++){
            if(charMap.get(str.charAt(i)) >= charMap.get(str.charAt(i+1))){
                result += charMap.get(str.charAt(i));
            }else{
                result -= charMap.get(str.charAt(i));
            }
            //Because the iteration doesn't traverse to the element we manaually traversed it:
            result += charMap.get(str.charAt(str.length() -1));
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}