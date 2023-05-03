import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer,Location>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        locations.put(0, new Location(0,"You are now back home, Good Bye!"));
        locations.put(1, new Location(1,"You are standing on a road with " +
                "4 directions to go"));
        locations.put(2, new Location(2,"you are at the top of the hill West to the road"));
        locations.put(3, new Location(3,"you are inside a building East to the road"));
        locations.put(4, new Location(4,"you are at a beautiful valley below the road "));
        locations.put(5, new Location(5,"you are in a forest above the road"));


        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);

        locations.get(2).addExit("N",5);

        locations.get(3).addExit("W",1);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);

        Map<String,String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
       System.out.println("Welcome to your adventure!");
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }
            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.print("Available paths are: ");
            for(String exit : exits.keySet()){
                System.out.print(exit + "  ");
            }

            System.out.println("\nType Q to go back home");

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String currWord : words){
                    if(vocabulary.containsKey(currWord)){
                        direction = vocabulary.get(currWord);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("Sorry, you can't go in that direction\n");
            }

        }







    }
}