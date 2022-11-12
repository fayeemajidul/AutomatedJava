//creating an individual element of my task class:

public class Task {
    private String category;
    private String description;
    
    //Initializes Element w/ contents:

    public Task(String category, String description){
        this.category = category;
        this.description = description;
    }
    public Task(){
        this("null : Did not input category", "null: unable to get description.");
    }
    //Getters
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    //Methods:
    
    public static Task createTask(String category, String description){
        //Create 
        return new Task(category, description);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //Simple Object that Creates Tasks.
    //Add //Remove Task

    //Return Array List
    
    //Override to String method.

}