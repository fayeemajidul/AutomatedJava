public class Car extends Vehicle {
    //Instance Field:
    private int doors;
    private int engineCapacity;
    //Constructor Field:
    public Car(String name, int doors, int engineCapacity){
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
