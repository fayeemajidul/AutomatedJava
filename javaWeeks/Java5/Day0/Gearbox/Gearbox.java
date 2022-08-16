package Gearbox;
/** What are Inner classes?
 * Why are they useful
 * within inner class I am packaged around the outer class
 * packaging is just another name for folder.
 */
import java.util.ArrayList;
public class Gearbox {
    private ArrayList <Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    //Constructor Method:
    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        gears = new ArrayList<Gear>();

        //Object created Named Neutral w/ the components. --> It is then put in array.

        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }
    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }
    public void addGear(int number, double ratio){
        //Passing through gears.
        if ((number > 0) && (ratio <= maxGears)){
            this.gears.add(new Gear(1, ratio));
        }
    }
    
    public void changeGear(int newGear){

    }
    private class Gear{
        //Inner Class:
        private int gearNumber;
        private double ratio;
        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        
        public double driveSpeed(int rev){
            return (rev * this.ratio);
        }
        public static void printAction(){
        }
    }
}
