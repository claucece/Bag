import java.util.*;

public class StackOfHobbit {

    private LinkedHashMap<Integer, String> bagThings;
    private ArrayList<String> keys;

    public StackOfHobbit(LinkedHashMap<Integer, String> bagThings, ArrayList<String> keys) {
        this.bagThings = bagThings;
        this.keys = keys;
    }

    public LinkedHashMap<Integer, String> addThingsToStack() {
        bagThings.put(1, "One Ring");
        bagThings.put(2, "Lemba");
        bagThings.put(3, "Elven Cloack");
        bagThings.put(4, "Elven Rope");
        bagThings.put(5, "Phial of Galadriel");
        bagThings.put(6, "Mallorns nut");
        return bagThings;
    }

    public ArrayList<String> getKeys() {
        keys = new ArrayList<>(bagThings.values());
        return keys;
    }

    public LinkedHashMap randomizeStack() {
        Collections.shuffle(keys);
        Iterator<String> iter = keys.iterator();
        for (Integer k : bagThings.keySet()) {
            bagThings.put(k, iter.next());
        }
        return bagThings;
    }

    //assuring a "second" randomess
    public LinkedHashMap<Integer, String> getOneRandomizeThing() {
        Set set = bagThings.entrySet();
        for (Iterator i = set.iterator(); i.hasNext();) {
            Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) i.next();
            System.out.println(me.getValue());
            if (me.getValue().equals("One Ring")) {
                System.out.println("Sauron got the ring. Middle Earth is doomed and you die.");
            } else {
                System.out.println("Therefore, Sauron dies.");
            }
            break;
        }
        return bagThings;
    }
}
