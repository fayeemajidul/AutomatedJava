public class Day4{
    //Instance Field
    public Day4(){}//Constructor class
    /** -- Extracting Place Values */
    public static void main(String[] args){
        //System.out.println(123%10);
        //System.out.println(123%10);

    }
    public static int sumDigits(int number){
        if(number <= 10){
            return -1;
        }
        int sumOfDigits = 0;
        while(number > 0){
            //Create a Formula to find the number in the digits
            int digit = number % 10;
            sumOfDigits += digit;
                //This line of Code extracts the remainder when dividing by ten instead of Dropping it.
            
            number = number/10;
            //This condition lowers the condition until its execute false
            //125 --> 125%10 --> (5)  Then 125/10 --> 12.5 the ".5 " is dropped.
            //Then the condition turns into (while (12 > 0)) and 12 % 10 = 2
        }
    }
}