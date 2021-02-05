package instrumentsTest;

import instruments.Bass;
import instruments.Drumkit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumkitTest {

    Drumkit drumkit;

    @Before
    public void before(){
        drumkit = new Drumkit( "yellow", "metal", 200.00, 500.00);
    }

    @Test
    public void canGetType(){
        assertEquals("Percussion", drumkit.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("yellow", drumkit.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("metal", drumkit.getMaterial());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(200.00, drumkit.getPurchasePrice(), 0.1);
    }

    @Test
    public void canGetDrums(){
        assertEquals(5, drumkit.getDrums());
    }

    @Test
    public void canPlay(){
        assertEquals("Boooom", drumkit.play());
    }





}
