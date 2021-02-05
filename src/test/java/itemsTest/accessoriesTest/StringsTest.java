package itemsTest.accessoriesTest;

import items.accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before(){
        strings = new Strings("Ukulele", "white", "plastic", 5.00, 10.00);
    }

    @Test
    public void canGetType(){
        assertEquals("Strings", strings.getType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("Ukulele", strings.getInstrumentType());
    }

    @Test
    public void canGetColour(){
        assertEquals("white", strings.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("plastic", strings.getMaterial());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(5.00, strings.getPurchasePrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(10.00, strings.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5.00, strings.calculateMarkup(), 0.1);
    }





}
