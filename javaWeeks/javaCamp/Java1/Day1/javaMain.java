package Day1; //Have to declare file or package.

public class javaMain{
    //instance variable
    public javaMain(){}// constructor variable
    public static void main(String[] args){
        //Initialized Object #1
        Point point1 = new Point();
        point1.setXandY(10, 12);
        System.out.println(point1.getNewCoordinates());
        //------------------------------------
        // -- initialized Object -- //
        // p1.Translate(31, 21);
        // p2.Translate(31, 21);
        // System.out.println("distance from orgin = " + p1.distanceFromZero());
        // System.out.println(p2.distanceFromZero());
        //------------------------------------

        //Initialized Object #2
        // Car Lamborghini = new Car();
        // Lamborghini.setModel("Aventador");
        // System.out.println( "Model is an "+ Lamborghini.getModel());

    }
}