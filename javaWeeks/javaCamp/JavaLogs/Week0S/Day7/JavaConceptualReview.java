public class JavaConceptualReview{
    //Two Methods:
    public static void arrayOne(int [] integers, int [] sum){
        int testSum;
        int Sum;
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

    public static void main(String[] args) {
        int [] integers = {0, 1, 2, 3, 4, 5, 6, 7};
        int [] sum = {1,3, 13, 7, 5};
        arrayOne(integers, sum);
    }
}