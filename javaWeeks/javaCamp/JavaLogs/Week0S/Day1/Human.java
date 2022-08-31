public class Human implements fundamental {
    private boolean ackerman;
    private int health = 100;
    private int attack = 100;
    private String name;

    public Human(boolean Ackerman, String name){
        this.ackerman = ackerman;
        this.name = name;
    }
    @Override
    public int health() {
        if(ackerman){
            health += 50;
            return health;
        }else{
            return health;
        }
    }

    @Override
    public int attack() {
        if(ackerman){
            attack += 140;
            return attack;
        }else{
            return attack;
        }
    }

    @Override
    public int defend() {
        if(ackerman){
            health += 100;
            return health;
        }else{
            return health;
        }
    }

    @Override
    public String name() {
        if(ackerman){
            return name() + "ackerman";
        }else{
            return name();
        }
    }
    
}
