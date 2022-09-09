import java.util.ArrayList;
public class arrayP1 {
    //Array List is a Class: //Empty Constructor.
    private ArrayList <String> groceryList = new ArrayList<String>();

    public void addGroceryItems(String groceryItem){
        /* Adds Item to Array List */
        groceryList.add("groceryItem");
    }
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        /** Prints Grocery Item */
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int itemPosition, String itemReplace){
        groceryList.set(itemPosition, itemReplace);
    }
    public void removeItem(String item){
        int positon = findItem(item);
        if(positon >= 1){
            removeItem(positon);
        }
    }
    private void removeItem(int position){
        groceryList.remove(position);
    }
    public boolean findItemInList(String item){
        boolean foundItem = groceryList.contains(item);
        int position = groceryList.indexOf(item);
        if(foundItem){
            System.out.println(position + ". " + item + " exists in the grocery list");
        }
        return foundItem;
    }
    public int findItem(String item){
        int position = groceryList.indexOf(item);
        return position;
    }
    public static void main(String[] args) {

    }

}
