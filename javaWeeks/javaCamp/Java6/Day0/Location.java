import java.util.HashMap;
import java.util.*;

public class Location {
    private final int locationID;
    private final String description;
    private final Map <String, Integer> exits;
    public Location(int locationID, String description){
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
        
    }
    //Instance Methods:
    public String getDescription() {
        return description;
    }
    public Map<String, Integer> getExits() {
        //Makes it unchangeable / Immutable //
        return new HashMap<String, Integer>(exits);
    }
    public int getLocationID() {
        return locationID;
    }

    //Ability to Add the exit:
    public void addExit(String direction, int location){
        exits.put(direction, location);
        
    }

}



