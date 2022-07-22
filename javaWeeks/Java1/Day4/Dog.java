public class Dog extends Animal{
    //Unique fields related to dog only, not animal.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Super is your Parent Class, Super keyword is the Super's constructor

    public Dog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        //We intitialized and used the super class and intitialized it there.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    public void chew(){
        System.out.println("Dog is called, so go chew");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);

    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);

    }
    public void moveLegs(int speed){
        System.out.println("Dog is moving legs");
    }
    @Override
    public void move( int speed){
        System.out.println("Dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }
    public void getAllVariables(){
        System.out.println(eyes + legs + teeth + tail + coat);
    }
}