public class Day2{
    //Instance Field
    public Day2(){} //Constructor Class
    public static void main(String[] args){
        //learningSwitch(45);
        //charSwitch('A');
        //printDayOfTheWeek(2);
        // for(int i = 2; i <= 8; i++){
        //     System.out.println(calculateInterest(10000.0, i));
        // }
        for(int i = 8; i > 1; i--){
            System.out.println(calculateInterest(10000.0, i));
        }


    }
    public static void learningSwitch(int switchValue){
        /** Switch is good to use if you test same variable */

        switch(switchValue){ //Switch Value tests Condition in parameter.
            case 1: //Condition 1 if True --> execute.
                System.out.println("Value was 1");
                break; //If not break out of condition test others.
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4:
                System.out.println("Value was 4");
                break;
            default:
                System.out.println("None of the values entered are in range");
                break;
        }
    }
    public static void charSwitch(char letter){
        switch(letter){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(letter + " was found");
                break;
            default:
                System.out.println("Char was not found in Char range");
                break;
        }
    }
    public static void printDayOfTheWeek(int Day){
        switch (Day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
    public static void printNumberInWord(int num){
        switch(num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
    public static double calculateInterest(double amount, double InterestRate){
        return (amount * (InterestRate/100));
    }
}