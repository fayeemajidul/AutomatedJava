public class Dimensions {
    //Instance Field:
    private int width; private int height; private int depth;
    //Constructor Method:
    public Dimensions(int height, int width, int depth){
        this.height = height;
        this.depth = depth;
        this.width = width;
    }
    //Instance Methods:

    //Acccessor methods:
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getDepth(){
        return depth;
    }
}
