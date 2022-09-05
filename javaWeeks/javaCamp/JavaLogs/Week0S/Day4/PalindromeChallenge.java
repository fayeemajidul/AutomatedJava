public class PalindromeChallenge{
    public PalindromeChallenge(){}
    public static void palindromeRulez(int numEntered){
        int numExtracted = 0;
        while(numEntered > 0){
            int lastDigit = (numEntered % 10);
            numExtracted  = numExtracted * 10 + lastDigit;
            numEntered /= 10;
        }
        System.out.println(numExtracted);
    }
    public static void main(String[] args) {
        palindromeRulez(1000000001);
    }
}

class Solution{
    public static boolean isPalindrome(int num){
        if(num < 0) return  false;
        int reversed = 0, remainder , original = num;
        //Initialize all in one line
        while(num != 0) {
             remainder = num % 10; // reversed integer is stored in variable
             reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
             num  /= 10;  //the last digit is removed from num after division by 10.
         }
         // palindrome if original and reversed are equal
         return original == reversed;
     }
     public static void main(String[] args) {
        System.out.println(isPalindrome(125));
     }
}