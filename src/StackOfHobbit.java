import java.util.*;

public class StackOfHobbit {

    private LinkedHashMap<Integer, String> bagThings;
    private ArrayList<String> value;
    String values;

    public StackOfHobbit(LinkedHashMap<Integer, String> bagThings, ArrayList<String> value) {
        this.bagThings = bagThings;
        this.value = value;
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

    public ArrayList<String> getValues() {
        value = new ArrayList<>(bagThings.values());
        return value;
    }

    public LinkedHashMap randomizeStack() {
        Collections.shuffle(value);
        //Iterator<String> iter = value.iterator();
        for (String iter : value) {
            for (Integer k : bagThings.keySet()) {
                //bagThings.put(k, iter.next());
                bagThings.put(k, iter);
            }
        }
        return bagThings;
    }

    public LinkedHashMap<Integer, String> getOneRandomizeThing() {
                bagThings.entrySet().stream()
                .filter(e -> {
                            if (e.getKey() <= 1) {
                                values = e.getValue();
                                System.out.println(values);
                                defineSauronOutcome();
                                return false;
                            } else {
                                return true;
                            }
                        })
                        .findAny();
        //Set set = bagThings.entrySet();
        //for (Iterator i = set.iterator(); i.hasNext();) {
            //Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) i.next();
            //System.out.println(me.getValue());
            //if (me.getValue().equals("One Ring")) {
            //    System.out.println("Sauron got the ring. Middle Earth is doomed and you die.");
            //} else {
            //    System.out.println("Therefore, Sauron dies.");
            //}
            //break;
        //}
        return bagThings;
    }

    public String defineSauronOutcome() {
        if (values.equals("One Ring")) {
            System.out.println("Sauron got the ring. Middle Earth is doomed and you die.");
        } else {
            System.out.println("Therefore, Sauron dies.");
        }
        return values;
    }
}
