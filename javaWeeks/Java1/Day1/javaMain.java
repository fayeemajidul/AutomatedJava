package Day1; //Have to declare file or package.

public class javaMain{
    //instance variable
    public javaMain(){}// constructor variable
    public static void main(String[] args){
        Point p1 = new Point();
        p1.x = 13;
        p1.y = 10;
        Point p2 = new Point();
        p2.x = 3;
        p2.y = 12;
        
        // -- initialized Object -- //
        // p1.Translate(31, 21);
        // p2.Translate(31, 21);
        System.out.println("distance from orgin = " + p1.distanceFromZero());
        // System.out.println(p2.distanceFromZero());
    }
}