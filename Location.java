import java.util.HashMap;
import java.util.Map;
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID, String description){
        this.locationID = locationID;
        this.description = description;
        exits = new HashMap<String, Integer>();
        exits.put("Q",0); //this will be the exit for any room
    }


    public void addExit(String direction, int location){
        exits.put(direction,location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }
    //defensive programming, method that get this map wont be able
    // to change the exits map
    public Map<String,Integer> getExits(){
        return new HashMap<String,Integer>(exits);
    }
}
