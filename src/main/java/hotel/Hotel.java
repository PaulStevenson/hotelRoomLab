package hotel;

import people.Guest;
import rooms.Dining;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Guest> bedRoomList;
    private ArrayList<Guest> conferenceRoomList;
    private ArrayList<Guest> diningRoomList;
//    private ArrayList<Guest> guestList;

    public Hotel(String name){
        this.name = name;
        this.bedRoomList = new ArrayList<Guest>();
        this.conferenceRoomList = new ArrayList<Guest>();
        this.diningRoomList = new ArrayList<Guest>();
//        this.guestList = new ArrayList<Guest>();
    }

    public String hasName() {
        return this.name;
    }

    public int bedRoomCount() {
        return bedRoomList.size();
    }

    public int conferenceRoomCount() {
        return conferenceRoomList.size();
    }

    public int diningRoomCount() {
        return diningRoomList.size();
    }

    public void checkInGuestInToBedRoom(Guest guest) {
        bedRoomList.add(guest);
    }

    public void checkOutGuestFromBedRoom(Guest guest){
        bedRoomList.remove(guest);
    }

    public void checkInGuestInToConferenceRoom(Guest guest) {
        conferenceRoomList.add(guest);
    }

    public void checkOutGuestFromConferenceRoom(Guest guest){
        conferenceRoomList.remove(guest);
    }

    public void checkInGuestInToDiningRoom(Guest guest) {
        diningRoomList.add(guest);
    }

    public void checkOutGuestFromDiningRoom(Guest guest){
        diningRoomList.remove(guest);
    }

//    public int guestCount() {
//        return guestList.size();
//    }
//
//    public void addGuest(Guest guest) {
//        guestList.add(guest);
//    }
//
//    public void removeGuest(Guest guest) {
//        guestList.remove(guest);
//    }




//    private void addRoomsToList(){
//        for (BedroomType bedroomType : BedroomType.values()){
//            for (ConferenceType conferenceType : ConferenceType.values()){
//                for (DiningType diningType : DiningType.values()) {
//                    roomList.add(new roomList(bedroomType, conferenceType, diningType));
//                }
//            }
//        }
//
//    }


}
