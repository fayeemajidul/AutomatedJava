public class Subtraction{
    int figureA;
    int figureB;

    public Subtraction(int figureA, int figureB){
        this.figureA = figureA;
        this.figureB = figureB;
    }
    public int getFigureA() {
        return figureA;
    }
    public int getFigureB() {
        return figureB;
    }

    public int subtractionOperation(){
        return figureA - figureB;
    }
}