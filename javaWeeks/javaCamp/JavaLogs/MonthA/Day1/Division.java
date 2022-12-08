public class Division {
    private int a,b;
    public Division(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void divisionOfNums(){
        int a = getA();
        int b= getB();
        System.out.println("Value of Divison: " + (a/b));
    }
}
