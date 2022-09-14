public class PokemonWorld {
    /* Trainers Create Trainer. */
    /* PokemonWorld has a gym */
    /* Save Data Feature */
    private Trainers fayeem; private PokemonGym gym;
    public PokemonWorld(Trainers fayeem, PokemonGym gym){
        this.fayeem = fayeem;
        this.gym = gym;
    }
    public Trainers getFayeem() {
        return fayeem;
    }
    public PokemonGym getGym() {
        return gym;
    }

}
