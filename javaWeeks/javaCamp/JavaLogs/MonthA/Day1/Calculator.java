public class Calculator{
    public static void main(String[] args){
        int a =1 ;
        int b = 2;
        Addition addition = new Addition(a, b);
        Substraction substraction = new Substraction(a, b);
        Division division = new Division(a, b);
        Mulitplication mulitplication = new Mulitplication(a, b);

        addition.sumOfNums();
        substraction.substractTheTwoNums();
        division.divisionOfNums();
        mulitplication.multiplyNums();
    }
}