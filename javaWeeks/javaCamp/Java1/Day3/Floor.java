public class Floor{
    //Intance Field:
    double width; double length;
    //Constructor methods:
    public Floor(){
        this(0.0, 0.0);
    }
    public Floor(double width, double length){
        this.width = width;
        this.length = length;
    }

    //Mutation Methods:
    public double getArea(){
        return (width * length);
    }

    //Accessor Methods:
}