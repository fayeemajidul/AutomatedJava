public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.gills = gills;
        this. fins = fins;
    }

    private void moveBackFins(){
        System.out.println("fish is moving its front and back fins");

    }
    private void moveMuscles(){
        System.out.println("fish is moving its muscles");
    }

    private void Swim(int speed){
        moveBackFins();
        moveMuscles();
        super.move(speed);
    }

}