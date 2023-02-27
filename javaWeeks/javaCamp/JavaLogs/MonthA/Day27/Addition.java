public class Addition{
    int figureA;
    int figureB;

    public Addition(int figureA, int figureB){
        this.figureA = figureA;
        this.figureB = figureB;
    }
    public int getFigureA() {
        return figureA;
    }
    public int getFigureB() {
        return figureB;
    }

    public int additionOperation(){
        return figureA + figureB;
    }
}