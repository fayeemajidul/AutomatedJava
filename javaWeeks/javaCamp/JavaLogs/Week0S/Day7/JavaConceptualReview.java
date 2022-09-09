public class JavaConceptualReview{
    //Two Methods:
    public static void arrayOne(int [] integers, int [] sum){
        int testSum;
        for(int i = 0; i < integers.length -1; i++){
            testSum = 0;
            testSum = integers[i] + integers[i+1];
            System.out.println(testSum);
            for(int j = 0; j < sum.length; j++){
                //Traverse through the sum array --> Check if TestSum = Element position, if true then say which number:
                if(testSum == sum[j]){
                    System.out.println(testSum + ": " + sum[j]);
                }
            }
            
        }
        
    }

    public static void getEvenDigitSum(int number){
        /* Review the concepts: */
        // need a way to extract each number and test each number extracted:
        int digitExtractor = 0;
        int sumOfEvenDigits = 0;
        while(number > 0){
            digitExtractor = 0;
            digitExtractor += number%10;
            number/=10;
            if(digitExtractor % 2 == 0){
                sumOfEvenDigits += digitExtractor;
            }else{
                System.out.println("The Digit " + digitExtractor + " is odd, therefore it can not be added. ");
            }
        }
        System.out.println(sumOfEvenDigits);
    }

    public static void main(String[] args) {
        int [] integers = {0, 1, 2, 3, 4, 5, 6, 7};
        int [] sum = {1,3, 13, 7, 5};
        //arrayOne(integers, sum);
        getEvenDigitSum(1231943);
    
    }
}