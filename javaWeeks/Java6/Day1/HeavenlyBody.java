import java.util.*;

public final class HeavenlyBody{
    private final String name;
    private final double orbintalPeriod;
    private final Set <HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbintalPeriod){
        this.name = name;
        this.orbintalPeriod = orbintalPeriod;
        this.satellites = new HashSet<>();
    }

    //Acessor Variables:
    public String getName() {
        return name;
    }
    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }
    public Set<HeavenlyBody> getSatellites() {
        //Creates a new set of our Satellites
        return new HashSet<>(this.satellites);
    }
    //Adding a Moon.
    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }


}
/** NO WAY TO RETIREVE ITEM FROM A SET 
 * Hashsets use Maps, but just dont have any values. [Dummy Value is stored] 
 * Operations are allowed to be implemented on Java Sets.
 * Union, Intersection, and other operations are used.
*/