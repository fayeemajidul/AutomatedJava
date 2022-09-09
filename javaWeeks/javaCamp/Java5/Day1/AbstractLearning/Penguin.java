public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Can not fly, can we please go for a swim instead");
    }
    
}