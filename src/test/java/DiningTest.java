import enums.DiningType;
import org.junit.Before;
import org.junit.Test;
import rooms.Dining;

import static junit.framework.TestCase.assertEquals;

public class DiningTest {

    Dining dining;

    @Before
    public void before(){
        dining = new Dining("The Big One", DiningType.RESTARUANT);
    }

    @Test
    public void hasName(){
        assertEquals("The Big One", dining.getName());
    }

    @Test
    public void hasType(){
        assertEquals(DiningType.RESTARUANT, dining.getDiningRoomType());
    }

    @Test
    public void getCapacity(){
        assertEquals(50, dining.getCapacity());
    }
}
