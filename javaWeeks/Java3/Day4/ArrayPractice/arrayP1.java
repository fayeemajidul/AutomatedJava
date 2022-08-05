import java.util.ArrayList;
public class arrayP1 {
    //Array List is a Class: //Empty Constructor.
    private ArrayList <String> groceryList = new ArrayList<String>();

    public void addGroceryItems(String groceryItem){
        /* Adds Item to Array List */
        groceryList.add("groceryItem");
    }

    public void printGroceryList(){
        /** Prints Grocery Item */
        System.out.println("You have " + groceryList.size() + "items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int itemPosition, String itemReplace){
        groceryList.set(itemPosition, itemReplace);
        //Line has a Plus one since we started from 1 instead of Zero.
        System.out.println("Grocery item " + itemPosition+1 + " has been modified");
    
    }
    public void removeItem(int position){
        String itemRemoved = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("You have removed " + itemRemoved);
    }
    public static void main(String[] args) {
        
    }

}
