import java.lang.Math;
public class Circle{
    //Instance Field:
    double radius;
    //Constructor Class:
    public Circle(){
        this(0);
    }
    public Circle(double radius){
        this.radius = radius;
    } 

    //Accessor Methods:
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double radius = getRadius();
        double area = (Math.PI) * ((Math.pow(radius, 2)));
        return area;
    }
}