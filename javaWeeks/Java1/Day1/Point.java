package Day1;
public class Point{
    int x; int y;
    public void Translate(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public double distanceFromZero(){
        return Math.sqrt(x*x + y*y);
    }
}