public abstract class Bird extends Animal implements ICanFly{
    private String name;
    public Bird(String name){
        super(name);
    }
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println(getName() + " is pecking. ");
    }
    @Override
    public void breathe() {
        // TODO Auto-generated method stub
        System.out.println(" BAWK BAWK BAWK!");
        
    }
    @Override
    public void fly(){
        //Using the interface IcanFly
        System.out.println(getName() + " is flapping its wings. ");
    }
}
