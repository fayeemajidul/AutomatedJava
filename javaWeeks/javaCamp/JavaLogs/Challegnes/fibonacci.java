

public class fibonacci{
    static int grades[] = {0,1,2,3,4,5,6,7,8,9};
    int legsOntable = 10;

    public fibonacci(){}
    //ArrayList <String> lettersInAlphabet = new ArrayList<String>();    

    public static void sequencing(){
        int temp = 0;
        for(int i = 0; i < grades.length-1; i++){
            // System.out.println(grades[i] + ", " + i);
            temp = grades[i] + grades[i+1];
            grades[i+1] = temp;
            temp = 0;
            System.out.println(i + ": " + grades[i]);
        }
    }
    public static void addIntegers(int userNum){
        //In this method you will be adding all the numbers that the user put in
        boolean test = true;
        int storeNum = 0;
        while(test){
            storeNum += (userNum % 10);
            userNum /= 10;
            if(userNum <= 0 ){
                test = false;
            }
        }
        System.out.println(storeNum);

    }
    
    public static void main(String[] args) {
        sequencing();
        addIntegers(100001);
    }
}