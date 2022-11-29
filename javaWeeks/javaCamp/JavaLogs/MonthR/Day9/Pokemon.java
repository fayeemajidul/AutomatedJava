public class Pokemon {
    private String elementType;
    private int pokemonHealth;
    private int pokemonStrength;

    public Pokemon(String elementType){
        this.elementType = elementType;
        this.pokemonHealth = 100;
    }

    /**
     * Getters + Setters:
     */

    public String getElementType() {
        return elementType;
    }
    public void setPokemonStrength(int pokemonStrength) {
        this.pokemonStrength = pokemonStrength;
    }
    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    /** Pokemon Functions: 
     */

    public void sortAbilities(){
        String elementType = getElementType();
        
        if(elementType.equalsIgnoreCase("Fire")){

        }else if(elementType.equalsIgnoreCase("Earth")){

        }else if(elementType.equalsIgnoreCase("Lightning")){
            
        }else if(elementType.equalsIgnoreCase("Wind")){
            
        }else if(elementType.equalsIgnoreCase("Water")){
            
        }
    }
    private void FireMoveset(){
    }
    private void EarthMoveset(){

    }
    private void LightningMoveset(){

    }
    private void WindMoveset(){

    }
    private void WaterMoveset(){

    }
}
