package itemsTest.instrumentsTest;

import items.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar( "purple", "wood", 100.00, 300.00);
    }

    @Test
    public void canGetType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("purple", guitar.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(100.00, guitar.getPurchasePrice(), 0.1);
    }

    @Test
    public void canGetStrings(){ assertEquals(6, guitar.getStrings()); }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(200.00, guitar.calculateMarkup(), 0.1);
    }




}
