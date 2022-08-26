public class Vehicle{
    //Instance Field:
    private String name;

    //Constructor Field:
    public Vehicle(String name){
        this.name = name;
    }
    public Vehicle(){
        this("Default Name");
    }

    public String getName(){
        return name;
    }

}