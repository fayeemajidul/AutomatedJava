public class Main{
    //Instance Field:
    //Constructor Field:
    public Main(){}
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        //You can directly initialize into constructor if constructor needs only inputs:
        Monitor monitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboad theMotherBoard = new Motherboad("BJ-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, monitor, theMotherBoard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboad().loadProgram("Loading Windows 10 on your computer");
        thePC.getCase().pressPowerButton();

    }
}