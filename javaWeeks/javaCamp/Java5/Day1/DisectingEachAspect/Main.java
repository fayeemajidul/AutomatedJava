import java.util.Scanner;

public class Main {
    //Instance Field:
    private static Scanner scanner = new Scanner(System.in);
    public Main(){}
    
    /* Prints Menu */
    public static void printMenu(){
        System.out.println("\nAvailable Actions: \npress");
        System.out.println("0 - to display menu");
        System.out.println("1 - to quit");
        System.out.println("2 - to open the Starbucks menu");
        System.out.println("3 - to open the Dunkin Donuts menu");

    }
    public static void main(String[] args) {
        
        /** GUI FOR ORDER MENU */
        boolean quit = false;
        System.out.println("Hello, please press 0 to activate the menu options. ");

        while(!quit){
            int choice  = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                printMenu();
                break;

                case 1:
                quit = true;

                case 2:
                Scanner scanName = new Scanner(System.in);
                System.out.println("Hello, welcome to Starbucks, can I please get the name for your order. ");
                String orderName = scanName.nextLine();
                Starbucks starbucks = new Starbucks(orderName);
                starbucks.starBucksOrder();
                
            }
        }
        
    }
}
