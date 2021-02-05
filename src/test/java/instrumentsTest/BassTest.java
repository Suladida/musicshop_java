package instrumentsTest;

import instruments.Bass;
import instruments.Ukulele;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void before(){
        bass = new Bass( "blue", "wood", 250.00);
    }

    @Test
    public void canGetType(){
        assertEquals("String", bass.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("blue", bass.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", bass.getMaterial());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(250.00, bass.getPurchasePrice(), 0.1);
    }

    @Test
    public void canGetStrings(){
        assertEquals(4, bass.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Doooom", bass.play());
    }





}
