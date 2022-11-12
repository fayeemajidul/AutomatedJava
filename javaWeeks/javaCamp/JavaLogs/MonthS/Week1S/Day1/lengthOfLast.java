public class lengthOfLast{
    //Instance Field:
    public static void getLastWordChar(String [] wordsInArray){
        String lastWord = "";
        int lastWordNums = 0;
        for(int i = 0; i < wordsInArray.length; i++){
            lastWord = wordsInArray[i];
        }
        lastWord.toCharArray();
        lastWordNums = lastWord.length();
        System.out.println("The last word is: " + lastWord + " and has the length of " + lastWordNums);
    }
    public static void main(String[] args) {
        String [] wordsInArray = {"Hello", "World", "Poop", "ubiquitious", "SWE" , "hehehehehe"};
        getLastWordChar(wordsInArray);
        
    }

}