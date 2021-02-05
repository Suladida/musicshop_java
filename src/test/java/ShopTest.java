import items.instruments.Bass;
import items.instruments.Guitar;
import items.instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canSetName(){
        shop.setName("Ray's Mega Music Exchange");
        assertEquals("Ray's Mega Music Exchange", shop.getName());
    }

    @Test
    public void canGetStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        Instrument instrument = new Bass( "green", "wood", 150.00,400.00);
        shop.addStock(instrument);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        Instrument instrument = new Bass( "green", "wood", 150.00,400.00);
        Instrument instrument2 = new Guitar( "blue", "wood", 170.00,450.00);
        shop.addStock(instrument);
        shop.addStock(instrument2);
        shop.removeStock(instrument);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canCalculateMarkup(){
        Instrument instrument = new Bass( "green", "wood", 150.00,400.00);
        assertEquals(250.00, instrument.calculateMarkup(), 0.1);
    }



}
