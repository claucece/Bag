import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by sceli on 2/5/16.
 */
public class Bag {

    private String size = "big";
    private String color = "brown";

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
        LinkedHashMap<Integer, String> bagThingsFrodo = new LinkedHashMap<>();
        ArrayList<String> keysFrodo = new ArrayList<>();
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsFrodo,keysFrodo);
        return frodosStack;
    }
}
