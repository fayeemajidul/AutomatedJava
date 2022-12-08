public class Substraction {
    private int a,b;
    public Substraction(int a, int b){
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
    public void substractTheTwoNums(){
        int a = getA();
        int b = getB();

        if(a > b){
            System.out.println("Substraction between two numbers: " + (a-b) );

        }else if(a < b){
            System.out.println("Substraction between two numbers: " + (b-a) );
        }else{
            System.out.println("Answer is 0");
        }
    }
}

