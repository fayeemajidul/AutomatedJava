import java.util.*;

public final class HeavenlyBody{
    private final String name;
    private final double orbintalPeriod;
    private final Set <HeavenlyBody> satellites; //Moons

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
    ////////////// SO WE DONT HAVE DUPLICATE SETS
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("Obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);            
        }
    }



/** NO WAY TO RETIREVE ITEM FROM A SET 
 * Hashsets use Maps, but just dont have any values. [Dummy Value is stored] 
 * Operations are allowed to be implemented on Java Sets.
 * Union, Intersection, and other operations are used.
*/