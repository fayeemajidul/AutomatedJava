public class Day4{
    //Instance Field
    public Day4(){}//Constructor class
    /** -- Extracting Place Values */
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
        return sumOfDigits;
    }
    public static void isPalindrome(int number){
        //Reversing the Order of the Number:
        /** Number Entered 125
         * int reverse number = 0
         * int digit = (number%10) --> 5 put that in var
         * reverseNum += digit;
         * number/=10;
         * reverseNum *= 10;
         * 
         * ()
         */
        int reverseNumber = 0;
        while(number > 0){
            int lastDigit = (number % 10);
            reverseNumber += lastDigit;
            reverseNumber *=10;
            number /= 10;
        }
        reverseNumber = reverseNumber/10;
        System.out.println(reverseNumber);
    }
    public static int sumFirstAndLastDigit(int number){
        int firstDigLastDig = 0;
        if(number < 0 ){
            return -1;
        }
        while(number > 0){
            int extractedNum = number%10;
            firstDigLastDig += extractedNum;
            number/=100;
        }
        return firstDigLastDig;
    }
    public static void getEvenDigitSum(int number){
        int evenNumberSum = 0;
        if(number < 0){
            System.out.println("Number is less than 0, can't evaulate");
        }
        while(number > 0){
            if(number % 2 == 0){
                //Extract digit from num
                int extractedDig = number % 10;
                evenNumberSum += extractedDig;
            }
            number /= 10;
            //Create Condition First that extracts the Even Numbers
        }
        System.out.println(evenNumberSum);
    }
    /** Method That Reverses the Number */
    public static int reversedNumber(int regularNum){
        if(regularNum < 10){
            return -1;
        }
        int reverseNum = 0;
        while(regularNum > 0){
            //extractNum
            int digit = regularNum % 10;
            reverseNum += digit;
            reverseNum *= 10;
            regularNum/=10;
        }
        reverseNum/=10;
        return(reverseNum);
    }
    public static void numberToWords(int number){
        int reversedNumber = reversedNumber(number);
        //523
        int storeDigits = 0;
        String numberParser = ""; //Blank String
        while (reversedNumber > 0){
            //take last digit = it to Extract Digit = Store Digit

            int extractDig = (reversedNumber%10);
            storeDigits += extractDig;
            if(storeDigits == 0){
                numberParser += " Zero ";
            }else if(storeDigits == 1){
                numberParser += " One ";
            }else if(storeDigits == 2){
                numberParser += " Two ";
            }else if(storeDigits == 3){
                numberParser += " Three ";
            }else if(storeDigits == 4){
                numberParser += " Four ";
            }else if(storeDigits == 5){
                numberParser += " Five ";
            }else if(storeDigits == 6){
                numberParser += " Six ";
            }else if(storeDigits == 7){
                numberParser += " Seven ";
            }else if(storeDigits == 8){
                numberParser += " Eight ";
            }else if(storeDigits == 9){
                numberParser += " Nine ";
            }
            storeDigits *= 0;
            reversedNumber/=10;


            // storeDigits *= .1;
            // number/=10;
            //storeDigits/=10;
        }
        System.out.println(numberParser);
    }

    /* Number to Words */
    public static void main(String[] args){
        //System.out.println(sumFirstAndLastDigit(212));
        // getEvenDigitSum(252);
        // getEvenDigitSum(123456789);
        // getEvenDigitSum(-22);
        numberToWords(2131412);
    }
}