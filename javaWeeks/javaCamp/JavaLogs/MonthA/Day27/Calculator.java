public class Calculator{
    public static void main(String[] args){
        Addition objectOne = new Addition(3,4);
        System.out.println(objectOne.additionOperation());
        
        Subtraction subtractionObject = new Subtraction(1, 2);
        System.out.println(subtractionObject.subtractionOperation());

    }
}