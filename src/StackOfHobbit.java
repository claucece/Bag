import java.util.*;

/**
 * Created by sceli on 2/5/16.
 */
public class StackOfHobbit {

    private LinkedHashMap<Integer, String> bagThings;
    private ArrayList<String> keys;

    public StackOfHobbit(LinkedHashMap<Integer, String> bagThings, ArrayList<String> keys) {
        this.bagThings = bagThings;
        this.keys = keys;
    }

    public LinkedHashMap<Integer, String> addThingsToStack() {
        bagThings.put(new Integer(1), "One Ring");
        bagThings.put(new Integer(2), "Lemba");
        bagThings.put(new Integer(3), "Elven Cloack");
        bagThings.put(new Integer(4), "Elven Rope");
        bagThings.put(new Integer(5), "Phial of Galadriel");
        bagThings.put(new Integer(6), "Mallorns nut");
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
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, String> me = (Map.Entry<Integer, String>)i.next();
            System.out.print(me.getKey() + ": " + me.getValue());
            break;
        }
        return bagThings;
    }
}
