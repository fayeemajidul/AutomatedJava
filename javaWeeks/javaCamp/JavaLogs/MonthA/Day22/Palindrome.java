import java.util.Random;

public class Palindrome{
    public static void main(String[] args){
        palindromeLogic();
    }
    public static int randomNums(){
        Random rand = new Random();
        return rand.nextInt(100, 999);
    }
    public static void palindromeLogic(){
        int number = randomNums();
        int palidromeNum =  0;
        int integerExtracted = 0;
        System.out.println(number);
        if(number < 100 || number < 0){
            System.out.println("Failed Test");
        }else{
            while(number != 0){
                integerExtracted = (number % 10);
                palidromeNum = (palidromeNum + integerExtracted)* 10;
                number/=10;
                //She never loved you lol.
            }
            palidromeNum/=10;
            System.out.println(palidromeNum);
        }        
    }
}