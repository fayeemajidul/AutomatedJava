public class Day0{
    //Instance Variables:
    public Day0(){} //Constructor Class
    //Create a program that when the user inputs a number it spits out the words back in letters:
    public static int reverseNumber(int numberEntered){
        int reverseNum = 0;
        if(numberEntered < 0){
            return -1; // Because its not a valid number
        }
        while(numberEntered > 0){
            int digitsExtracted = (numberEntered%10);
            reverseNum += digitsExtracted;
            reverseNum *= 10;
            numberEntered/=10;
        }
        reverseNum/=10;
        return reverseNum;
    }
    public static void numToLetters(int number){
        //She might be coming to see me in NEW YORK LETS FUCKING GOOOOO WOOO <3 !!!! 
        String letters = "";
        int extractedDig = 0;
        int reverseNumber = reverseNumber(number);
        // System.out.println(reverseNumber);
        while(number > 0){
            int digit = (reverseNumber%10);
            extractedDig += digit;
            if(extractedDig == 0){
                letters += " Zero ";
            }else if(extractedDig == 1){
                letters += " One ";
            }else if(extractedDig == 2){
                letters += " Two ";
            }else if(extractedDig == 3){
                letters += " Three ";
            }else if(extractedDig == 4){
                letters += " Four ";
            }else if(extractedDig == 5){
                letters += " Five ";
            }else if(extractedDig == 6){
                letters += " Six ";
            }else if(extractedDig == 7){
                letters += " Seven ";
            }else if(extractedDig == 8){
                letters += " Eight ";
            }else if(extractedDig == 9){
                letters += " Nine ";
            }
            // extractedDig *= 0;
            number/=10;

            System.out.println(letters);

        }
    }


    public static void main(String[] args){
        numToLetters(412);
    }
}