public class Pokemon {
    //Instance Field:
    private Attack attack; private Health health; private String name;
    public Pokemon(String name, Attack attack, Health health){
        this.name = name;
        this.attack = attack;
        this.health = health;
    }
    public void userProfile(){
        /** Should Include
         * Pokemon Name:
         * Pokemon Health
         * Pokemon Hunger/Energy
         */
        System.out.println("\n/ User Profile /");
        System.out.println("Pokemon Name: " + name);
        System.out.println("Health: " + health.getHealth());
        System.out.println("Hunger: " + health.getHunger());
    }
    public void lostInThoughts(){
        attack.specialMove1();
        attack.specialMove2();
        attack.specialMove3();
    }
}
