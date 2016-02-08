import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Bag {

    private String size = "big";
    private String color = "brown";
    private LinkedHashMap<Integer, String> bagThingsFrodo = new LinkedHashMap<>();
    private ArrayList<String> keysFrodo = new ArrayList<>();

    public Bag (String size, String color) {
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Object addElements() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsFrodo,keysFrodo);
        return frodosStack;
    }

    public LinkedHashMap<Integer, String> pullOneObject() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsFrodo,keysFrodo);
        frodosStack.addThingsToStack();
        frodosStack.getKeys();
        frodosStack.randomizeStack();
        System.out.println("Sauron open the bag and grabs: ");
        frodosStack.getOneRandomizeThing();
        return bagThingsFrodo;
    }
}
