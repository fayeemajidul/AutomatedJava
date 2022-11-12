public class Titan implements fundamental {
    private int health = 240;
    private boolean isSuperTitan;

    public Titan(boolean isSuperTitan){
        this.isSuperTitan = isSuperTitan;
    }

    @Override
    public int health() {
        return health;
    }

    @Override
    public int attack() {
        int damage;
        if(isSuperTitan){
            damage = 320;
            return damage;
        }else{
            damage = 230;
            return damage;
        }
    }

    @Override
    public int defend() {
        if(isSuperTitan){
            System.out.println("Hardening Shell!");
            health += 120;
            return health;
        }
        else{
            System.out.println("Unable to use that skill, you're not a super titan.");
            return health;
        }
    }

    @Override
    public String name() {
        return null;
    }
    
}
