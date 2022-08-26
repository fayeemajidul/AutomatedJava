package Day1;
public class Car{
    private int doors;
    // private int wheels;
    private String model;
    // private String engine;
    // private String color;

    // (Getter) Mutator Class: Object gets initialized and passes its argument into String model to update value of String.
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("aventador")){
            this.model = model;
        }else{
            this.model = "unknown";
        }
    }

    //Getter #2: Sets value to the object from user input:
    public void setDoors(int doors){
        this.doors = doors;
    }
    public int getDoors(){
        return this.doors;
    }


    // (Setter) you can return value of Object initialized for the Variable
    public String getModel(){
        return this.model;
    }
}