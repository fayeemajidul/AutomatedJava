public class Day3{
    //Instance Field:
    public Day3(){} //Constructor Class:
    public static void main(String[] arg){
        //sumLoop();
        //System.out.println(sumOdd(13, 13));
        //whileLooping();
        //System.out.println(isEvenNumber(6));
        rangeOfEvenNumbers(4, 20);
    }
    
    public static void sumLoop(){
        /** Prints Sum of #'s divisible by 3&5 */
        int counter = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i%3 ==0 && i%5 == 0){
                counter++;
                sum += i;
            }if(counter == 5){
                break;
            }
        }
        System.out.println(sum);
    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }if(number % 2 == 0){
            return false;
        }
        return true;
    }
    public static int sumOdd(int start, int end){
        int sumOfOddNums = 0;
        if(start < 0 || end < 0){
            return -1;
        }
        if(start > 0 && end > 0){
            for(start = 1; start <= end; start++){
                if(isOdd(start)){
                    sumOfOddNums += start;
                }
            }
        }
        return sumOfOddNums;
    }
    public static void whileLooping(){
        int counter = 1;
        while(counter < 100){
            System.out.println("counter = " + counter);
            counter ++;
        }
    }
    public static boolean isEvenNumber(int numEntered){
        if((numEntered % 2 == 0)){
            System.out.println(numEntered + ": number is even");
            return true;
        }
        return false;
    }
    public static void rangeOfEvenNumbers(int numStarted, int numEnd){
        int evenNumbersFound = 0;
        while(numStarted < numEnd){
            numStarted++;
            if(evenNumbersFound == 5){
                break;
            }
            if(!isEvenNumber(numStarted)){
                continue;
            }
            evenNumbersFound ++; 
        }
    }
}