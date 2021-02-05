package instrumentsTest;

import instruments.Ukulele;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UkuleleTest {

    Ukulele ukulele;

    @Before
    public void before(){
        ukulele = new Ukulele( "purple", "wood", 100.00);
    }

    @Test
    public void canGetType(){
        assertEquals("String", ukulele.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("purple", ukulele.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", ukulele.getMaterial());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(100.00, ukulele.getPurchasePrice(), 0.1);
    }

    @Test
    public void canGetStrings(){
        assertEquals(4, ukulele.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Triiing", ukulele.play());
    }





}
