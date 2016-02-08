import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by sceli on 2/5/16.
 */
public class StackOfHobbitTest {

    LinkedHashMap<Integer, String> bagThingsTest = new LinkedHashMap<>();
    ArrayList<String> keysTest = new ArrayList<>();

    @Test
    public void shouldNotBeEmpty() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsTest,keysTest);
        frodosStack.addThingsToStack();
        assertNotNull(bagThingsTest);
    }

    @Test
    public void shouldHaveAFixedSize() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsTest,keysTest);
        frodosStack.addThingsToStack();
        assertTrue(bagThingsTest.size() == 6);
    }

    @Test
    public void shoulHaveOneRing() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsTest,keysTest);
        frodosStack.addThingsToStack();
        assertTrue(bagThingsTest.containsValue("One Ring"));
    }

    @Test
    public void shoulBeConvertedIntoArray() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsTest,keysTest);
        ArrayList<Integer> keysTest = new ArrayList<>();
        assertTrue(frodosStack.getKeys() instanceof ArrayList);
    }

    // this Test HAS to fail sometimes. If a it never fails, then it
    // demonstrates a predictable attribute of our random number sequence
    // Probability is 1/36 which is less than polynomial time.
    // Assures security but no authenticity.
    @Test
    public void shouldBeRandomized() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsTest,keysTest);
        frodosStack.addThingsToStack();
        frodosStack.getKeys();
        frodosStack.randomizeStack();
        assertTrue(bagThingsTest.get(1) == "One Ring");
    }

    @Test
    public void shouldReturnOneRandomizedThig() {
        StackOfHobbit frodosStack = new StackOfHobbit(bagThingsTest,keysTest);
        frodosStack.addThingsToStack();
        frodosStack.getKeys();
        frodosStack.randomizeStack();
        assertNotNull(frodosStack.getOneRandomizeThing());
    }
}