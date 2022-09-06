import java.util.ArrayList;
import java.util.HashMap;

public class leetcodeChall{
public leetcodeChall(){}
public static ArrayList <Integer> romanNumerals(){
    ArrayList <Integer> listOfRules = new ArrayList<Integer>();
    listOfRules.add(1);
    listOfRules.add(5);
    listOfRules.add(10);
    listOfRules.add(50);
    listOfRules.add(100);
    listOfRules.add(500);
    listOfRules.add(1000);
    return listOfRules;
}

public static int romanRules(int number){
    /* Declarations:  */
    ArrayList <Integer> listOfRules = romanNumerals();
    int smallest_Remainder = 0;
    int compareNumber;

    for(int i = 0; i < listOfRules.size(); i++){
        //46: 
        if(listOfRules.get(i) % number != number){
            while(number != 0){
                number %=listOfRules.get(i);
                compareNumber = number;
                
            }
        }else{
            //Not divisible by element:
            System.out.println("Roman Numeral: " + listOfRules.get(i) + " not applicable");
        }



        compareNumber = (number) % listOfRules.get(i);
        if(compareNumber == number){
            System.out.println(number + " is not divisible by " + listOfRules.get(i));
        }else{
            while(compareNumber != 0){
                compareNumber = listOfRules.get(i) % listOfRules.get(i-1);
                System.out.println("Dividing " + listOfRules.get(i) + ":" + compareNumber);
            }
            System.out.println("Element" + i + ": " + compareNumber);
        }
    }
    return smallest_Remainder;
}
    public static void main(String[] args) {
        romanRules(120);
    }
}
class Solution{
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