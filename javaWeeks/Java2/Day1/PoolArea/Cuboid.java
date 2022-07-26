public class Cuboid extends Rectangle{
    //Instance Field:
    double height;
    //Constructor Method:
    public Cuboid(double width, double length, double height){
        super(width, length);
    }
    public Cuboid(){
        super(0, 0);
        this.height = 0;
    }
    public double height(){
        return (height);
    }
    public double getVolume(){
        double area = area();
        return (height * area);
    }
}