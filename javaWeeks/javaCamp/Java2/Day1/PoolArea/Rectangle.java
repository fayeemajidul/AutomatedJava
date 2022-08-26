public class Rectangle{
    //Instance Field:
    double width;
    double length;
    //Constructor Field:
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(){
        this(0, 0);
    }

    //Instance Methods:
    public double width(){
        return width;
    }
    public double length(){
        return width;
    }
    public double area(){
        return (width * length);
    }

}