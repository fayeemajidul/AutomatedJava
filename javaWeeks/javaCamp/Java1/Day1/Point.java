package Day1;
public class Point{
    private int x; private int y;
    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public void setXandY(int x, int  y){
        this.x = x;
        this.y = y;
    }
    public String getNewCoordinates(){
        String stringValue = String.valueOf(this.x);
        String stringValue2 = String.valueOf(this.y);

        return ("X:" + stringValue2 +  " Y:" + stringValue);
    }
}