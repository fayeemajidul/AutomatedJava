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
    public static void printArray(int [] averages){
        for(int i = 0; i < averages.length; i++){
            averages[i] = i * 10;
        }
        for(int i = 0; i < averages.length; i++){
            System.out.println(averages[i]);
        }
    }
    public static void namesInClassRoom(String [] arrayInput){
        for(int i = 0; i < arrayInput.length; i++){
            arrayInput[i] = "Zairah";
        }
        for (int i = 0; i < arrayInput.length; i++){
            System.out.println("Element #" + i);
        }
    }
    public static void main(String[] args) {
        //Testing
        String [] names = new String [10];
        //
        int[] myArrayVariable = new int [10];
        myArrayVariable[0] = 1; 
        for(int i = 0; i < myArrayVariable.length; i++){
            myArrayVariable[i] = i;
            System.out.println(myArrayVariable[i]);
        }
        getAverage();
        String [] fruits = {"Apple" , "Banana" , "Pear" , "Pomegrante"};
        System.out.println(fruits);
        String [] ripeFruits = new String [10];
        ripeFruits[1] = "Banana";
        ripeFruits[0] = "Apple";
        ripeFruits[3] = "Heart Break";
        ripeFruits[4] = "Why don't you love me";
        ripeFruits[5] = "I will develop great habits to change myself ";

        // System.out.println(ripeFruits[0] +  " " + ripeFruits[1] +  " " + ripeFruits[3]);
        // printArray(myArrayVariable);
        namesInClassRoom(names);
        System.out.println(names[1]);
    }
}