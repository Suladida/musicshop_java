package itemsTest.accessoriesTest;

import items.accessories.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks ("brown", "wood", 10.00, 25.00);
    }

    @Test
    public void canGetType(){
        assertEquals("Drumsticks", drumsticks.getType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("Drumkit", drumsticks.getInstrumentType());
    }

    @Test
    public void canGetColour(){
        assertEquals("brown", drumsticks.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", drumsticks.getMaterial());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(10.00, drumsticks.getPurchasePrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(25.00, drumsticks.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(15.00, drumsticks.calculateMarkup(), 0.1);
    }





}
