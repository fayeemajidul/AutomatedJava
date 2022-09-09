import java.util.ArrayList;
public class GroceryList{
    //Instance Varaible:
    //Functions:
    public static void main(String[] args) {
        addGroceryList("Chicken Breast");
    }

    public static void addGroceryList(String ingredients){
        ArrayList <String> groceryList = new ArrayList<String>();
        groceryList.add(ingredients);

        //Prints the Array List:
        System.out.println(groceryList.size() + "items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " +groceryList.get(i));
        }
    }

}