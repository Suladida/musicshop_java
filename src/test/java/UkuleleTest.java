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
        assertEquals("Ukulele", ukulele.getType());
    }



}
