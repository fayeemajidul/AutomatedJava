public class Day3{
    //Instance Field:
    public Day3(){} //Constructor Class:
    public static void main(String[] arg){
        //sumLoop();
        System.out.println(sumOdd(13, 13));
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
            for(start = start; start <= end; start++){
                if(isOdd(start)){
                    sumOfOddNums += start;
                }
            }
        }
        return sumOfOddNums;
    }
}