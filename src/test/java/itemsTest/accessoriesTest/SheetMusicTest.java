package itemsTest.accessoriesTest;

import items.accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("The Prodigy", "Firestarter Collection", "Ukulele", 7.00, 15.00);
    }

    @Test
    public void canGetType(){
        assertEquals("Sheet Music", sheetMusic.getType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("Ukulele", sheetMusic.getInstrumentType());
    }

    @Test
    public void canGetArtist() { assertEquals("The Prodigy", sheetMusic.getArtist()); }

    @Test
    public void canGetTitle(){assertEquals("Firestarter Collection", sheetMusic.getTitle());}

    @Test
    public void canGetColour(){ assertEquals("white", sheetMusic.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("paper", sheetMusic.getMaterial());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(7.00, sheetMusic.getPurchasePrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(15.00, sheetMusic.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(8.00, sheetMusic.calculateMarkup(), 0.1);
    }





}
