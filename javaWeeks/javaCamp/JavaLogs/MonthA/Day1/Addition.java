public class Addition {
    private int a,b;
    public Addition(int a, int b){
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

    public void sumOfNums(){
        int a = getA();
        int b = getB();

        System.out.println("Sum of both numbers = " + (a+b));
    }
}
