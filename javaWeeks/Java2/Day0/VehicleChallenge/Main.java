public class Main{
    //Instance Field:
    public Main(){} //Constructor Method:
    public static void main(String[] args){
        Vehicle newVehicle = new Vehicle(100);
        Car newCar = new Car(100);
        Lamborghini newLambo = new Lamborghini(100);
        System.out.println(newVehicle.isCar);
        newCar.steering(true);
        newLambo.applyingBrakes();

    }
}