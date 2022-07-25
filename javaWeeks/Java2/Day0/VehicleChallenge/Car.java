public class Car extends Vehicle{
    //Instance Field:
    boolean brakes; int speed;
    public Car(int speed){
        super(speed);
    }
    @Override
    public void steering(boolean movement) {
        super.steering(movement);
        if(movement && speed > 54){
            System.out.println("Slow down");
            applyingBrakes();
        }
    }
    public void applyingBrakes(){
        speed -= 15;
    }
}