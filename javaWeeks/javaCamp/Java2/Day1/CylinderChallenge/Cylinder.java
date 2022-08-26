public class Cylinder extends Circle{
    //Instance Field:
    double height;
    //Constructor Field:
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(){
        this(0, 0);
    }

    //Accessors:
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        double area = getArea();
        return (area * height);
    }
}