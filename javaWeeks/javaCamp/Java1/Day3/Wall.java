public class Wall{
    //Initialize Variables:
    private double width; private double height;

    //Two Constructors:
    public Wall(){
        this(0.0, 0.0);
    }
    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    //Accessor Methods:
    public double getArea(){
        return (width * height);
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    //Mutator Methods:
    public void setWidth(double width){
        if(width < 0 ){
            this.width = 0;
        }
        else{
            this.width = width;
        }
    }
        //Mutator Methods:
        public void setHeight(double height){
            if(height < 0 ){
                this.height = 0;
            }
            else{
                this.height = height;
            }
        }
}
