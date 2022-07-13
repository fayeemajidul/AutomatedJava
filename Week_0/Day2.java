public class Day2{
    //Instance Field
    public Day2(){} //Constructor Class
    public static void main(String[] args){
        //learningSwitch(45);
        //charSwitch('A');
        printDayOfTheWeek(2);

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
}