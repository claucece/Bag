import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sceli on 2/5/16.
 */
public class BagTest {

    private String size = "big";
    private String color = "brown";

    @Test
    public void shouldHaveSize () {
        Bag frodosBag = new Bag(size, color);
        assertTrue(frodosBag.getSize().equals("big"));
    }

    @Test
    public void shouldHaveColor() {
        Bag frodosBag = new Bag(size, color);
        assertTrue(frodosBag.getColor().equals("brown"));

    }

    @Test
    public void shouldBagNotBeEmpty() {
        Bag frodosBag = new Bag(size, color);
        frodosBag.addElements();
        assertNotNull(frodosBag.addElements());
    }

    //    Bag frodoBag = new Bag();

    //}
}