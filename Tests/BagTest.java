import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void shouldReturnOneObject() {
        Bag frodosBag = new Bag(size, color);
        assertNotNull(frodosBag.pullOneObject());
    }

}