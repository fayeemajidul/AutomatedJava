import java.util.ArrayList;

public class Traversing{
    //Instance Field:
    ArrayList <Task> ListOfTasks;

    public Traversing(String category, String description){
        new Task(category, description);
        this.ListOfTasks = new ArrayList<Task>();
    }
}