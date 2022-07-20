public class SimpleCalculator{
    private double firstNumber; private double secondNumber;
    
    //Mutation methods: Sets your Values
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    //Accessor Methods: Gets your values:
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double getAdditionResult(){
        return(firstNumber + secondNumber);
    }
    public double getSubtractionResult(){
        return(firstNumber - secondNumber);
    }
    public double getMultiplicationResult(){
        return(firstNumber * secondNumber);
    }
    public double getDivisionResult(){
        if(secondNumber != 0){
            return((double)(firstNumber / secondNumber));
        }else{
            return 0;
        }
    }
}