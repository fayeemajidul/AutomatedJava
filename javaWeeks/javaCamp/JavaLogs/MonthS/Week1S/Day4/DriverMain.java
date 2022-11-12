public class DriverMain {
    public static void main(String[] args) {
        Animal animal = new Animal(1, 2, true);
        animal.isMoving();
        animal.isEating();
        
        System.out.println();
        Bat batman = new Bat("Bruce Wayne ");
        batman.flappingSpeed();
        batman.isMoving();
        batman.isEating();
    }
}
