import java.util.Random;

public class Bat extends Animal implements Flying{
    private String name;
    
    public Bat(String name) {
        super(1, 2, false);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void canFlying() {
        System.out.println("Bat Can Fly");
    }

    @Override
    public int flappingSpeed() {
        Random rand = new Random();
        int flyingSpeed = rand.nextInt(0,10);
        return flyingSpeed;
    }
    @Override
    public void isMoving() {
        int flyingSpeed = flappingSpeed();
        System.out.println("your pet " + getName() + "has a flying speed of: " + flyingSpeed );
    }
    @Override
    public void isEating() {
        System.out.println("eating some nutz");
    }

}
