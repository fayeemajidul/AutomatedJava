public class Mulitplication {
    private int a,b;
    public Mulitplication(int a, int b){
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

    public void multiplyNums(){
        int a = getA();
        int b = getB();
        System.out.println("Product of A and B = " + (a*b));
    }
}
