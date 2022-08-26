package Gearbox;
public class Main{
    public Main(){}
    public static void main(String[] args) {
        //Object of the top class initialized.
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);


        //Specify OuterClass --> Inner Class
    }
}