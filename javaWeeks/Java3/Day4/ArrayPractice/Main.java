import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static arrayP1 groceryList = new arrayP1();

    public static void main(String[] args) {
        boolean quit  = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                quit = true;
                break; 
            }
        }
    }
    public static void printInstructions(){
        System.out.print("\nPress ");
        System.out.print("\n 0 - To print choice options. ");
        System.out.print("\n 1 - To print the list of grocery items.");
        System.out.print("\n 2 - To add an item to the list. ");
        System.out.print("\n 3 - To modify an item in the list. ");
        System.out.print("\n 4 - To remove an item from the list. ");
        System.out.print("\n 5 - To search for an item in the list. ");
        System.out.print("\n 6 - To quit the application. ");
    }
    public static void addItem(){
        /* Adds Item to Array List */
        System.out.println("Please add grocery item");
        groceryList.addGroceryItems(scan.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Current item number: ");
        String getPosition = scan.nextLine();
        System.out.println("Enter the new item num: ");
        String getNewItem = (scan.nextLine());
        groceryList.modifyGroceryItem(getPosition, getNewItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item  you would like to remove");
        String itemName = scan.nextLine();
        groceryList.removeItem(itemName);
    }
    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem =  scan.nextLine();
        if(groceryList.findItemInList(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
    public static void processArrayList(){
        //Duplicate Array list
        ArrayList <String> newArray =  new ArrayList<>();
        //Copy array list through a getter from the class.
        newArray.addAll(groceryList.getGroceryList());

        //Duplicates through the file: Java Short cut.
        ArrayList <String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        //Convert from Array to regular Array list:
        String[] myArray = new String[groceryList.getGroceryList().size()];

        myArray = groceryList.getGroceryList().toArray(myArray);

        System.out.println(nextArray);
    }

}