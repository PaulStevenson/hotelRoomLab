import enums.ConferenceType;
import org.junit.Before;
import org.junit.Test;
import rooms.Conference;

import static junit.framework.TestCase.assertEquals;

public class ConferenceTest {

    Conference Conference;

    @Before
    public void before(){
        Conference = new Conference("Small Conference Room", ConferenceType.SMALL, 100.00);
    }

    @Test
    public void hasRoomName(){
        assertEquals("Small Conference Room", Conference.getName());
    }

    @Test
    public void hasType(){
        assertEquals(ConferenceType.SMALL, Conference.getConferenceType());
    }

    @Test
    public void getCapacity(){
        assertEquals(100, Conference.getCapacity());
    }

    @Test
    public void getRoomRate(){
        assertEquals(100.00, Conference.getRoomRate(), 0.01);
    }
}
