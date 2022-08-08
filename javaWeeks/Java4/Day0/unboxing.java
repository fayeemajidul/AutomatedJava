import java.util.ArrayList;
//Creating a primitive wrapper
class gradeAverage{
    private int myValue;
    public gradeAverage(int myValue){
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
}

public class unboxing{
    //Instance Method:

    //Constructor Method:
    public unboxing(){}

    //Main method
    public static void main(String[] args) {
        boolean value = true;

        //Unboxing:
        ArrayList <Boolean> movedOn = new ArrayList<Boolean>();
        for(int i = 0; i < movedOn.size(); i++){
            Boolean setTrue = movedOn.get(i);
            movedOn.set(i, setTrue);
            System.out.println(i + " = "   + movedOn.get(i)); 
        }

        String [] namesInClass = new String [3];
        int [] gradeAverage = new int [2];
        ArrayList <gradeAverage> average = new ArrayList<gradeAverage>();
        average.add(new gradeAverage(23));
        //System.out.println((namesInClass));
        //System.out.println(gradeAverage);
        //ArrayList aren't able to add primitive types into the Arrays in itself.

        Integer integer = Integer.valueOf(41);
        Boolean boolVal = Boolean.valueOf(true);

        System.out.println("Dummy Code:" + namesInClass + gradeAverage + integer + boolVal);

        //Valid Class:
        ArrayList <Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i < 11; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i < 11 ;i++){

            //intValue converts the intArrayClass input into an Int primitive type wow so cool!!
            
            /** Auto Boxing
             * Auto Boxing is the idea that you take primitiveType and you put in a wrapper class using [new <Integer> (value)]
             * 
             * Two step Process
             * 
             * Unboxing: is the idea you take the wrapper class and you convert it into a promite type.
             */

            System.out.println(i + " = " + intArrayList.get(i).intValue());
        }
        //Java shorthands this code
        Integer myIntValue = 56; //Java does hard work for you
        int myInt = myIntValue; // Java unboxes for you as well, doeshardwork.

        //.valueOf();
        //myInt.intValue();

        // //Autoboxing:
        // ArrayList <Double> myDoubles = new ArrayList<Double>();
        // for(double dbl = 0.0; dbl <= 10.00; dbl += 0.5 ){
        //     myDoubles.add(Double.valueOf(dbl));
        // }
        // //Unboxing:
        // for(int i = 0; i < myDoubles.size(); i++){
        //     double value = myDoubles.get(i).doubleValue();
        //     System.out.println(i + " == " + value);
        // }

        // ArrayList <Double> newDoubles = new ArrayList<Double>();
        // //Autoboxing:
        // for(double dbl = 0.0; dbl <= 10.00; dbl += 0.5 ){
        //     newDoubles.add(dbl);
        // }
        // //unboxing:
        // for(int i = 0; i < newDoubles.size(); i++){
        //     double value = newDoubles.get(i);
        //     System.out.println(i + " == " + value);
        // }

        //Practicing
        ArrayList <Integer> zahmed = new ArrayList <Integer>();
        for(int i = 0; i < zahmed.size(); i++){
            zahmed.add(i);
        }
        for(int i = 0; i < zahmed.size(); i++){
            int z = zahmed.get(i);
            System.out.println(i + " == " + z);
        }


    }


    //Review Concepts of Autoboxing and Unboxing:
}