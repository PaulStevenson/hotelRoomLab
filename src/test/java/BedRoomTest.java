import enums.BedroomType;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;

import static junit.framework.TestCase.assertEquals;

public class BedRoomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(666, BedroomType.SINGLE, 50.00);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(666, bedroom.getRoomNumber());
    }

    @Test
    public void hasType(){
        assertEquals(BedroomType.SINGLE, bedroom.getBedroomRoomType());
    }

    @Test
    public void getCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void getRoomRate(){
        assertEquals(50.00, bedroom.getRoomRate(), 0.01);
    }
}
