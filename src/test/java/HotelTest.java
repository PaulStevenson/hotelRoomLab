import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import people.Guest;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;

    @Before
    public void before() {
        hotel = new Hotel("Waterfall Hotel");
        guest = new Guest("Timmy");
    }


    @Test
    public void hasName(){
        assertEquals("Waterfall Hotel", hotel.hasName());
    }

    @Test
    public void bedRoomListEmpty(){
        assertEquals(0, hotel.bedRoomCount());
    }

    @Test
    public void conferenceRoomListEmpty(){
            assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void diningRoomListEmpty(){
        assertEquals(0, hotel.diningRoomCount());
    }

    @Test
    public void checkGuestinAndOutBedRoom(){
        hotel.checkInGuestInToBedRoom(guest);
        hotel.checkOutGuestFromBedRoom(guest);
        assertEquals(0,hotel.bedRoomCount());
    }

    @Test
    public void checkGuestinAndOutConferenceRoom(){
        hotel.checkInGuestInToConferenceRoom(guest);
        hotel.checkOutGuestFromConferenceRoom(guest);
        assertEquals(0,hotel.conferenceRoomCount());
    }

    @Test
    public void checkGuestinAndOutDiningRoom(){
        hotel.checkInGuestInToDiningRoom(guest);
        hotel.checkOutGuestFromDiningRoom(guest);
        assertEquals(0,hotel.diningRoomCount());
    }


//    @Test
//    public void guestListEmpty(){
//        assertEquals(0, hotel.guestCount());
//    }
//
//    @Test
//    public void canCheckInAndOutGuest(){
//        hotel.addGuest(guest);
//        hotel.removeGuest(guest);
//        assertEquals(0, hotel.guestCount());
//    }
}
