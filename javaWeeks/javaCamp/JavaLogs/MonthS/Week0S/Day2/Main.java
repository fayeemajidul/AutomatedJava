import java.util.Scanner;

//Create a To-Do List:
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static boolean quit = false; 

public static void introduction(){
    System.out.println("Please enter your name");
    String name = scanner.nextLine();
    System.out.println("\nWelcome " + name + " lets have a productive day by creating a to do list.");
}
public static int printActions(){
    System.out.println("[At any time please press the following to navigate the ToDoList]\n");
    System.out.println("Please press 0 -- to quit");
    System.out.println("Please press 1 -- to add a task");
    System.out.println("Please press 2 -- to remove a task");
    System.out.println("Please press 3 -- to mark task as finished");
    int choice = scanner.nextInt();
    return choice;
}
    public static void main(String[] args) {  
        while(!quit){
            introduction();
            int choice = printActions();
            switch(choice){
                case 0:
                    //Quit
                    quit = true;
                    break;
                case 1:
                    break;
                    //call Function add task
                case 2:
                    //call Function remove task
                    break;
                case 3:
                    //call function finish task.
                    break;
            }
            quit = true;
        }
    }
}
