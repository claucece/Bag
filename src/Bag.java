import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Bag {

    private String size;
    private String color;
    private LinkedHashMap<Integer, String> bagThingsFrodo = new LinkedHashMap<>();
    private ArrayList<String> keysFrodo = new ArrayList<>();
    StackOfHobbit frodosStack = new StackOfHobbit(bagThingsFrodo,keysFrodo);

    public Bag (String size, String color) {
        if (size == null || color == null)
            throw new NullPointerException();
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public LinkedHashMap<Integer, String> initializeStack() {
        frodosStack.addThingsToStack();
        frodosStack.getValues();
        frodosStack.randomizeStack();
        System.out.println("Sauron opens the bag and grabs: ");
        frodosStack.getOneRandomizeThing();
        return bagThingsFrodo;
    }

}
