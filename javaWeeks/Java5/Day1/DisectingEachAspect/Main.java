import java.util.Scanner;

public class Main {
    //Instance Field:
    private static Scanner scanner = new Scanner(System.in);
    public Main(){}
    
    /* Prints Menu */
    public static void printMenu(){
        System.out.println("\nAvailable Actions: \npress");
        System.out.println("1 - to display menu");
        System.out.println("2 - to quit");
    }
    public static void main(String[] args) {
        boolean quit = false;
        System.out.println("Press 1, to Activate the menu options");

        while(!quit){
            int choice  = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                printMenu();
                break;

                case 2:
                quit = true;
            }
        }
        
    }
}
