import java.util.Random;

public class Pokemon {
    private String elementType;
    private int pokemonHealth;
    private int pokemonStrength;
    private String pokemonName;
    Random rand = new Random();

    public Pokemon(String elementType){
        this.elementType = elementType;
        this.pokemonHealth = 100;
    }

    /**
     * Getters + Setters:
     */

     public void setPokemonHealth(int pokemonHealth) {
         this.pokemonHealth = pokemonHealth;
     }
     public void setPokemonName(String pokemonName) {
         this.pokemonName = pokemonName;
     }
    public String getElementType() {
        return elementType;
    }
    public void setPokemonStrength(int pokemonStrength) {
        this.pokemonStrength = pokemonStrength;
    }
    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
    public int getPokemonHealth() {
        return pokemonHealth;
    }
    public String getPokemonName() {
        return pokemonName;
    }
    public int getPokemonStrength() {
        return pokemonStrength;
    }

    /** Pokemon Functions: 
     */

    public void sortAbilities(){
        String elementType = getElementType();
        
        if(elementType.equalsIgnoreCase("Fire")){
            
            FireMoveset();
        }else if(elementType.equalsIgnoreCase("Earth")){
            EarthMoveset();
        }else if(elementType.equalsIgnoreCase("Lightning")){
            LightningMoveset();
        }else if(elementType.equalsIgnoreCase("Wind")){
            WindMoveset();
        }else if(elementType.equalsIgnoreCase("Water")){
            WaterMoveset();
        }
    }
    private void FireMoveset(){
        setPokemonName("Charizard");
        setPokemonStrength(rand.nextInt(1,100));
    }
    private void EarthMoveset(){
        setPokemonName("Dilgo");
        setPokemonStrength(rand.nextInt(1,100));
    }
    private void LightningMoveset(){
        setPokemonName("Pikachu");
        setPokemonStrength(rand.nextInt(1,100));
    }
    private void WindMoveset(){
        setPokemonName("Naruto");
        setPokemonStrength(rand.nextInt(1,100));
    }
    private void WaterMoveset(){
        setPokemonName("Squirtle");
        setPokemonStrength(rand.nextInt(1,100));
    }
    public void returnPokemonType(){
        FireMoveset();
        pokemonHealth = getPokemonHealth();
        elementType = getElementType();
        pokemonStrength = getPokemonStrength();
        pokemonName = getPokemonName();
        System.out.println("\nPokemon Data: " + "\nName : " + pokemonName + "\nElement: " + elementType + "\nHealth: " + pokemonHealth);
    }
}
