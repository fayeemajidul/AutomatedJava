import java.util.*;

public class Main{
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();

    //Basically a map collection of keys without Values:
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        //Creating a Planet
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        //Creating Planet 2:
        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        //Creating Planet 3:
        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        //Adding Moons:
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 43);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        //Print out:
        System.out.println("Planets");
        for(HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getName());
        }
        HeavenlyBody body = solarSystem.get("Earth");
        System.out.println("Moon " + body.getName());
        for(HeavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getName());
        }
        //Operation: Union  -- groups all sets together w/ unique values.
        Set <HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All Moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\t" + moon.getName());
        }
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        Object o = new Object();
        o.equals(o);
        "pluto".equals("");


    }
}

/* if your set uses an object within the set then you have to
 * Override methods: 
 * If two objects compare equal, then they must have the same hash code. Other wise one object will be duplicated since they have unique hashcodes.
 */