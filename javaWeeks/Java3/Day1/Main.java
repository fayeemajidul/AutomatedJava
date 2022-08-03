public class Main{
    //Syntax for Arrays:
    public Main(){}
    public static void getAverage(){
        //Syntax for intitializing more than one element:
        double [] gradeValue = {99,43.2,30.1,34,55,98,10,11,100,77};

        double totalSum = 0;
        //Loop and average
        for(int i = 0 ; i < gradeValue.length; i++){
            totalSum += gradeValue[i];
        }
        double average = totalSum/gradeValue.length;
        System.out.println(average);

    }
    public static void main(String[] args) {
        int[] myArrayVariable = new int [10];
        myArrayVariable[0] = 1; 
        for(int i = 0; i < myArrayVariable.length; i++){
            myArrayVariable[i] = i;
            System.out.println(myArrayVariable[i]);
        }
        getAverage();
        String [] fruits = {"Apple" , "Banana" , "Pear" , "Pomegrante"};
        String [] ripeFruits = new String [10];
        ripeFruits[1] = "Banana";
        ripeFruits[0] = "Apple";
        ripeFruits[3] = "Heart Break";
        ripeFruits[4] = "Why don't you love me";
        ripeFruits[5] = "I will develop great habits to change myself ";

        System.out.println(ripeFruits[0] +  " " + ripeFruits[1] +  " " + ripeFruits[3]);
    }
}