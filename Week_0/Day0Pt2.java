public class Day0Pt2{
    //Instance Field
    public Day0Pt2(){} // Constructor class
    public static void escapeSequences(){
        System.out.println("This is a literal statement");
        System.out.println(); // This statement won't print out anything
        System.out.println("What \" characters\" does this \\ print?");
        System.out.println("Getting used this \"escape sequence feature\" wow it's cool");
       }
    public static void PrimitiveTypes(){
        /** prim Data Types: Used for [Data Manipulation] -- Each Used for Storage in the RAM
         * int
         * boolean
         * String
         * short
         * long
         * byte
         * float
         * double
         */
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("myMaxValue : "  + myMaxValue + "\nmyMinValue : " + myMinValue);
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Max Byte Value: " + myMaxByteValue + "\nMy Min Byte Value: " + myMinByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Max Short Value: " + myMaxShortValue + "\nMy Min Short Value: " + myMinShortValue);
    }

    public static void floatingPoint(){
        //FloatingPointNumbers & Doubles Lesson:
        int myIntValue = 5/2;
        float myFloatValue = 5f/2f;
        double myDoubleValue = 5d/2d; //It only gets rounded bc it thinks it's an integer. [Cast It]
        System.out.println("Integer: " + myIntValue + "\nFloat: " + myFloatValue + "\nDouble: " + myDoubleValue);

    }
    public static void KiloChallenge(int pounds){
        double Kilograms = (double)(pounds*.45359237);
        System.out.println(Kilograms + " KG");
    }
    public static void main(String[] arg){
        //PrimitiveTypes();
        //escapeSequences();
        //floatingPoint();
        KiloChallenge(200);
    }
}